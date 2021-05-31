package com.test;

public class TestInner2 {
    //内部接口
    public interface Fly{
        void doFly();
    }

    public class Inner implements Fly{
        @Override
        public void doFly() {
            System.out.println("我是超人");
        }
    }

    public static void main(String[] args) {
        TestInner2 testInner2 = new TestInner2();
        Inner inner = testInner2.new Inner();
        inner.doFly();
    }

}
