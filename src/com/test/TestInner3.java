package com.test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestInner3 {
    public class Inner{
        public M_Car getCar(){
            //方法体内的内部类
            class BMW extends M_Car{
                @Override
                public void paint() {
                    System.out.println("BMW");
                }
            }
            return new BMW();
        }
    }

    public static void main(String[] args) {
        TestInner3 testInner3 = new TestInner3();
        Inner inner = testInner3.new Inner();
        //调用内部类里的方法
        inner.getCar().paint();
    }

    class M_Car{
        public void paint(){
            System.out.println("car");
        }
    }
}
