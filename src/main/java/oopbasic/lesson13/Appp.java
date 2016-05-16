package oopbasic.lesson13;

import oopbasic.inter.Testenum;

/**
 * Created by JV on 4/29/2016
 */
public class Appp {
    public static void main(String[] args) {
        OutherClass outher = new OutherClass(100);
//        OutherClass.InnerClass inner = new OutherClass.InnerClass();
        OutherClass.InnerClass inner = outher.new InnerClass();
        inner.doSomething(0);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        }).start();
        System.out.println(Testenum.Three.getA());
        System.out.println(Testenum.Three);
    }

}
