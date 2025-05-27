package Inheritance;
class ABC{
    void m1(int a){
        System.out.println(a);

    }
    void m2(int b){{
        System.out.println(b);
    }
    }
}
class XYZ extends ABC{
    void m1(int a){
        System.out.println(a*a);
    }
    void m2(int b){
        System.out.println(b*b);
    }
}
public class Overriding {
    public static void main(String args[]){

        XYZ xy=new XYZ();
        xy.m1(10);
        xy.m2(20);

        ABC ab=new ABC();
        ab.m1(30);
        ab.m2(40);


        ABC abc=new XYZ();
        abc.m1(50);
        abc.m2(60);
        // The above line will call the overridden methods in XYZ class
        // because the reference type is ABC but the object is of type XYZ.

    }
}
