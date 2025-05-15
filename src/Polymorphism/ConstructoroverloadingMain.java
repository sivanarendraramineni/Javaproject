package Polymorphism;

public class ConstructoroverloadingMain {
    public static void main(String args[]){

        Constructoroverloading c=new Constructoroverloading();
        System.out.println(c.volume());
        Constructoroverloading c1=new Constructoroverloading(10.1,20.0,30.2);
        double vol=c1.volume();
        System.out.println(vol);
        Constructoroverloading c2=new Constructoroverloading(10.0);
        double vol1=c2.volume();
        System.out.println(vol1);

    }
}
