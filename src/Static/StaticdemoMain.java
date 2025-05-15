package Static;

public class StaticdemoMain {
    public static void main (String args[]){
        System.out.println(Staticdemo.a);
        Staticdemo.m2();
        Staticdemo sd=new Staticdemo();
        sd.m1();
        System.out.println(sd.str);
        sd.m3();

    }
}
