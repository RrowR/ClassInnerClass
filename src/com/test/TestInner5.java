package com.test;

/**
 * 又定义了一个内部类
 */
public class TestInner5 {
    public  class Inner{
        public class AInner{}
    }

    public static void main(String[] args) {
        TestInner5 testInner5 = new TestInner5();
        Inner inner = testInner5.new Inner();
        Inner.AInner aInner = inner.new AInner();
//        内部类的嵌套
    }
}
