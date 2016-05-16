package oopbasic.inter;

/**
 * Created by JV on 16-May-16
 */
public enum Testenum {
    One(1), Two(2), Three(3), Four(4);
    int a;
     Testenum(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
