package com.orange_yishenggong.humanbeingmodels.model.role;
import com.orange_yishenggong.humanbeingmodels.model.basic.ManWithDoubleMap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Explorer extends ManWithDoubleMap {
    private int[][] visitedMap;
    private double maxVisitedVal;

    public void initializeVisitedMap(){
        visitedMap = new int[super.getM()][super.getN()];
        maxVisitedVal = super.getTargetMapVal(super.getX(),super.getY());
    }

    public int getVisitedMap(int x,int y) {
        if(super.isValid(x,y)){
            return visitedMap[x][y];
        }
        return -1;
    }

    public boolean setVisitedMap(int x,int y,int val) {
        if(isValid(x,y)&&val>=0&&val<=2){
            visitedMap[x][y] = val;
            return true;
        }
        return false;
    }

    private PriorityQueue<Integer> toVisitQueue = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            double val1 = Explorer.super.getTargetMapVal(o1/Explorer.super.getM(),o1%Explorer.super.getM());
            double val2 = Explorer.super.getTargetMapVal(o2/Explorer.super.getM(),o2%Explorer.super.getM());
            if(val1>val2){
                return -1;
            }
            if(val1<val2){
                return 1;
            }
            return 0;
        }
    });

    public boolean addToQueue(int x,int y){
        if(isValid(x,y)&&getVisitedMap(x,y)==0) {
            setVisitedMap(x,y,1);
            toVisitQueue.offer(x*super.getM()+y);
            return true;
        }
        return false;
    }

    public boolean visit(){
        if(!toVisitQueue.isEmpty()){
            Integer encodedPos = toVisitQueue.poll();
            int x = encodedPos/super.getM();
            int y = encodedPos%super.getM();
            if(getVisitedMap(x,y)==1){
                setVisitedMap(x,y,2);
                super.setX(x);
                super.setY(y);
                maxVisitedVal = Math.max(maxVisitedVal,super.getTargetMapVal(x,y));
                return true;
            }
        }
        return false;
    }
}
