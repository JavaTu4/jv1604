package oopbasic;

/**
 * Created by JV on 4/11/2016
 */
public class App {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.height = 10;
        box1.widht = 10;
        box1.langht = 10;

        Box box2 = new Box();
        box2.height = 12;
        box2.widht = 12;
        box2.langht = 12;
        Box box3 = new Box(15,15,20);
        Box box4 = new Box();
        Box box5 = new Box(150,150,20);


        System.out.println(box1.getVolume());
        System.out.println(box2.getVolume());
        System.out.println(box3.getVolume());
        System.out.println(box4.getVolume());
        System.out.println(box5.getVolume());
    }
}
