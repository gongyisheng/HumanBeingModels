package com.orange_yishenggong.humanbeingmodels.util;

/**
 * @author Orange Meow
 */
public class MathUtil {
    public static double round(Double num,int digit){
        int base = (int)Math.pow(10,digit);
        return (double)Math.round(num*base)/base;
    }
    public static double calcAverage(double[] array){
        double sum = 0.0;
        for(double num:array){
            sum += num;
        }
        return sum/array.length;
    }
}
