package com.test;

/**
 * 静态内部类
 */
public class TestInner6 {
    public static class Inner{
        public static void paint(){
            System.out.println("静态内部类里的静态方法");
        }
    }


    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.paint();      //此时里的静态内部类里的方法可以不需要创建外部类了，严格意义上来说已经不是一个内部类了
    }



}
