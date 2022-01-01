package com.orange_yishenggong.humanbeingmodels.model.basic;

public class ManWithDoubleMap {
    //current position
    private int x;
    private int y;
    //target array
    private double[][] targetMap;
    private int m;
    private int n;

    public boolean isValid(int x,int y){
        return x>=0&&x<m&&y>=0&&y<m;
    }
    public int getX() {
        return x;
    }

    public boolean setX(int x) {
        if(isValid(x,0)){
            this.x = x;
            return true;
        }
        return false;
    }

    public int getY() {
        return y;
    }

    public boolean setY(int y) {
        if(isValid(0,y)){
            this.y = y;
            return true;
        }
        return false;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public boolean setM(int m) {
        if(m>0){
            this.m = m;
            return true;
        }
        return false;
    }

    public boolean setN(int n) {
        if(m>0){
            this.n = n;
            return true;
        }
        return false;
    }

    public boolean initializeTargetMap(){
        if(m>0&&n>0){
            targetMap = new double[m][n];
            return true;
        }
        return false;
    }

    public boolean setTargetMap(double[][] targetMap) {
        if(targetMap.length==m&&targetMap[0].length==n){
            this.targetMap = targetMap;
            return true;
        }
        return false;
    }

    public double getTargetMapVal(int x, int y) {
        return isValid(x,y)? targetMap[x][y]:-1;
    }
    public double getCurrTargetMapVal() {
        return getTargetMapVal(x,y);
    }

    public boolean setTargetMapVal(int x,int y,double val) {
        if(isValid(x,y)&&val>=0&&val<=1){
            targetMap[x][y] = val;
            return true;
        }
        return false;
    }
}
