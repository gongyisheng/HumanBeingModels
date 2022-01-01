package com.orange_yishenggong.humanbeingmodels.initializer;

/**
 * @author Orange Meow
 */
public class RandomInitializer {
    public static double[][] doubleMap(int m,int n){
        double[][] map = new double[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[i][j] = Math.random();
            }
        }
        return map;
    }

    public static int[][] intMap(int m,int n,int min,int max){
        int[][] map = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map[i][j] = randPos(min,max);
            }
        }
        return map;
    }

    public static int randPos(int min,int max){
        return (int)(Math.random()*(max-min))+min;
    }
}
