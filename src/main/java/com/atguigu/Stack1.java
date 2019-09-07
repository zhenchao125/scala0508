package com.atguigu;


import java.util.Stack;

/**
 * @Author lzc
 * @Date 2019-09-07 11:23
 */
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        stack.pop();  //
        System.out.println(stack.peek());  // 只看看在栈顶是谁?
        System.out.println(stack);
    }
}
