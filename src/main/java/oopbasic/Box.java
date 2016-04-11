package oopbasic;

/**
 * Created by JV on 4/11/2016
 */
public class Box {
    int widht; // pole klassa
    int height;
    int langht;

    Box(){
        widht = 10;
        height = 10;
        langht = 10;
    }

    Box(int widht, int height, int langht){
        this.widht = widht;
        this.height = height;
        this.langht = langht;
    }
    public int getVolume(){
        return height * widht * langht;
    }

}

