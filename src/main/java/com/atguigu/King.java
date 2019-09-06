package com.atguigu;

/**
 * @Author lzc
 * @Date 2019-09-06 14:20
 */
public class King {

    private King(){}
    private static King king = null;

    public static King getKing(){
        if(king == null){
            synchronized (King.class){
                if(king == null){
                    king = new King();
                }
            }
        }

        return king;
    }
}
