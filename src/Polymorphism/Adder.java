package Polymorphism;

public class Adder {

    int a=10;
    int b=20;



    public int add(){
        int c=a+b;
        return c;
    }

    public int add(int x,int y){
        int z=x+y;
        return z;
    }
    public int add(int x,int y,int z){
        int d=x+y+z;
        return d;
    }
    public double add(int x,double y){
        double e=x+y;
        return e;

    }
    public double add(double x,int y){
        double f=x+y;
        return f;

    }
}
