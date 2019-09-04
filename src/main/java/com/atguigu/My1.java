package com.atguigu;

/**
 * @Author lzc
 * @Date 2019-09-04 15:12
 */
public class My1 {
    public static void main(String[] args) {
        final int i = 10;
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println(i);

            }
        };

        t1.start();
    }
}
