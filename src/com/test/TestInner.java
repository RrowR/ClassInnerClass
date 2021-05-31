package com.test;

public class TestInner {
    private int number = 10;
    public class inner{     //这里创建了 public class inner的就不能创建 private class inner
        private int number = 100;
        public void paint(){
            int number = 500;
            //局部覆盖规则
            System.out.println(number);
            //通过this指向内部类的成员属性
            System.out.println(this.number);
            //通过外部内名加this的方式访问外部类成员属性
            System.out.println(TestInner.this.number);
        }
    }




    public static void main(String[] args) {
        //创建内部对象分2个步骤
        TestInner inner = new TestInner();
        TestInner.inner in = inner.new inner();
        in.paint();
    }



}
