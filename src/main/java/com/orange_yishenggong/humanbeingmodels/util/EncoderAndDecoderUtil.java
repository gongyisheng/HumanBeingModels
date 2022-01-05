package com.orange_yishenggong.humanbeingmodels.util;

/**
 * @author Orange Meow
 */
public class EncoderAndDecoderUtil {
    public static int posEncoder(int X, int Y, int base){
        return X*base+Y;
    }
    public static int[] posDecoder(int number,int base){
        return new int[]{number/base,number%base};
    }
}
