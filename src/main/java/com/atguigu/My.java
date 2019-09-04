package com.atguigu;

/**
 * @Author lzc
 * @Date 2019-09-03 11:35
 */
public class My {
    String type = "start";
    String a = "10";

    public static void main(String[] args) {
       /* String s = "";
        String a = "a" + s;
        String b = "a" + s;

        System.out.println(a.equals( b));*/


//        byte a = 127;

//        a = a + 1;   // a += 1

       /* a += 1;
        System.out.println(a);

        for(byte i = 126; i < 128; i++){
            System.out.println(i);
        }*/

        int a = 3;

//        System.out.println(a++);
        a = ++a;
        System.out.println(a);

        /*

        a的的值:
            a++  a的自增 a++ 是自增前的  --a 的值是自增之后的
        表达式的值:
         */

        int aa = 3;
        System.out.println(aa = 4);





    }
}
