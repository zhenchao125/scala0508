package com.atguigu;

/**
 * @Author lzc
 * @Date 2019-09-06 10:47
 */
public class My4 {
    public static void main(String[] args) {
        B b = new B();
        A a = b;

        System.out.println(b.a);  // 100
        System.out.println(a.a);  //  10

        System.out.println(b.getA());  //
        System.out.println(a.getA());
    }
}

class A{
    public int a = 10;

    public int getA(){
        return a;
    }
}

class B extends A{

    public int a = 100;
}