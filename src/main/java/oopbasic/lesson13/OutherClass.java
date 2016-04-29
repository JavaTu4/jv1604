package oopbasic.lesson13;

/**
 * Created by JV on 4/29/2016
 */
public class OutherClass {
    private int a;
    private static int b = 10;

    public OutherClass(int a){
        this.a = a;
    }
    public static void methodFromOuther(){
        System.out.println("outher method");
    }
    class InnerClass{
        int a = 10;
        public void doSomething(int a){
            System.out.println("a from parameters = " + a);
            System.out.println("a from inner = " + this.a);
            System.out.println("b from outher = " + b);
            methodFromOuther();
            System.out.println("a from outher = " + OutherClass.this);

        }
    }
}
