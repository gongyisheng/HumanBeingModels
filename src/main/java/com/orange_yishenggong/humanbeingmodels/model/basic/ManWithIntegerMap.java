package com.orange_yishenggong.humanbeingmodels.model.basic;

public class ManWithIntegerMap {
    //current position
    private int x;
    private int y;
    //target array
    private int[][] targetMap;
    private int m;
    private int n;

    public boolean isValid(int x,int y){
        return x>=0&&x<m&&y>=0&&y<n;
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

    public boolean initializeTargetMap(int m,int n){
        if(m>0&&n>0){
            targetMap = new int[m][n];
            return true;
        }
        return false;
    }
    public int getTargetMapVal(int x,int y) {
        return isValid(x,y)? targetMap[x][y]:-1;
    }

    public int getCurrTargetMapVal() {
        return getTargetMapVal(x,y);
    }

    public boolean setTargetMapVal(int x,int y,int val) {
        if(isValid(x,y)){
            targetMap[x][y] = val;
            return true;
        }
        return false;
    }
}
