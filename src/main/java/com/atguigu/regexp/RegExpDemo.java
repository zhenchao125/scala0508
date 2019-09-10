package com.atguigu.regexp;

import java.util.Arrays;

/**
 * @Author lzc
 * @Date 2019-09-10 15:01
 */
public class RegExpDemo {
    public static void main(String[] args) {
        /*String s = "18603071637";
        boolean f = s.matches("1[356789]\\d{9}");*/

        /*String email = "abccc@so_-hu.edu";
//        String email = "cn";
        boolean f = email.matches("\\w{3,15}@[\\w-]+\\.(com|cn|org|edu|com\\.cn)");
        System.out.println(f);*/

        /*String s = "1123479ljfl032u5093502fjl";
        System.out.println(s.replaceAll("\\D+", ""));*/

        /*String s = "我我要要要请请你你们大保健";
        System.out.println(s.replaceAll("(.)\\1+", "$1"))*/;

        String s = "a1a2aaaaaa";
        System.out.println(Arrays.toString(s.split("\\D")));
    }
}
/*
\1 取第一组

正则表达式的语法:
[abc]  或者a或者b或者c
[a-zA-Z0-9]
[^ab] 非a和非b   方括号中的 ^ 才表示非
\n   用来匹配换行
\r   回车
\t   制表
\s  表示空白字符
\S  非空白  [^\s]
\d    [0-9]  d:digital
\D  非数字  [^0-9]
\w   匹配单词字符  [a-zA-Z0-9_] word
\W   非单词字符   [^\w]
.   匹配任意字符  \r \n
\. 只匹配点

数量词:
    a?  表示0个或者1个a 至多一个
    a*  表示0个或多个 至少0个
    a+  1个或多个  至少一个
    a{m} 正好m个a
    a{m,}     至少m个
    a{m,n}  至少m个至多n个
() 捕获组
^ 开始
$ 结尾  一起控制字符串的长度  java可以不加


正则表达式 Regular Expression
是一个工具: 处理文本的强大的工具

java:
   提供了两个类:
    Pattern 用来把一段字符串编译成正则

    Matcher 匹配器, 用来去匹配字符串是否满足要求

    java的字符串, 提供了4个支持正则的方法:
        matches
        replaceAll
        replaceFirst
        split


 */