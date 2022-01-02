package com.orange_yishenggong.humanbeingmodels.util;

/**
 * @author Orange Meow
 */
public class EncoderAndDecoderUtil {
    public static String posEncoder(int X, int Y, String sep){
        return X+sep+Y;
    }
    public static int[] posDecoder(String str,String sep){
        String[] posArr = str.split(sep);
        if(posArr.length!=2){
            return new int[0];
        }else{
            return new int[]{Integer.parseInt(posArr[0]),Integer.parseInt(posArr[1])};
        }
    }
}
