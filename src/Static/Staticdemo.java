package Static;

public class Staticdemo {
    static int a=10;
    String str="Siva Narendra Ramineni";
    void m1(){
        System.out.println("Static variable a is: "+a);
        System.out.println("Non static variable str is: "+str);
    }
    static void m2(){
        System.out.println("Static method m2");
    }
    void m3(){
        System.out.println(a);
        System.out.println(str);
        m1();
        m2();
    }
    public static void main(String args[]){
        System.out.println(a);
        m2();
        Staticdemo sd=new Staticdemo();
        sd.m1();
        System.out.println(sd.str);
        sd.m3();

    }
}
