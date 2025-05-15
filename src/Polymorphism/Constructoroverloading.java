package Polymorphism;

public class Constructoroverloading {

    double width, height, depth;
    Constructoroverloading(){

        width=0;
        height=0;
        depth=0;
    }
    Constructoroverloading(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    Constructoroverloading(double length){
        width=depth=height=length;
    }

    double volume(){
        return width*height*depth;
    }
}
