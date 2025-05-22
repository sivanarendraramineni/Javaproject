package Inheritance;

class A{
    int a=100;
    void display(){
        System.out.println("Value of a: "+a);
    }
}

class B extends A{
    int b=200;
    void show(){
        System.out.println("Value of b: "+b);
    }
}
class C extends B{
    int c=300;
    void print(){
        System.out.println("Value of c: "+c);
    }
}
public class Single_Multilevel_Inheritance {
    public static void main(String args[]){

        A a1= new A();
        a1.display();
        B b1= new B();
        b1.display();
        b1.show();
        C c1= new C();
        c1.show();
        c1.display();
        c1.print();


    }
}
