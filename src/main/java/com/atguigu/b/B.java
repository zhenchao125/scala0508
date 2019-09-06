package com.atguigu.b;

import com.atguigu.a.A;

/**
 * @Author lzc
 * @Date 2019-09-06 14:02
 */
public class B extends A {

    public void eat() {
        super.foo();
        A a = new A();
    }
}
