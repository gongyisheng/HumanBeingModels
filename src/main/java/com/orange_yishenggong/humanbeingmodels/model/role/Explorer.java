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

    private PriorityQueue<int[]> toVisitQueue = new PriorityQueue<>(new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            double val1 = Explorer.super.getTargetMapVal(o1[0],o1[1]);
            double val2 = Explorer.super.getTargetMapVal(o2[0],o2[1]);
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
            toVisitQueue.offer(new int[]{x, y});
            return true;
        }
        return false;
    }

    public boolean visit(){
        if(!toVisitQueue.isEmpty()){
            int[] pos = toVisitQueue.poll();
            if(getVisitedMap(pos[0],pos[1])==1){
                setVisitedMap(pos[0],pos[1],2);
                super.setX(pos[0]);
                super.setY(pos[1]);
                maxVisitedVal = Math.max(maxVisitedVal,super.getTargetMapVal(pos[0],pos[1]));
                return true;
            }
        }
        return false;
    }
}
