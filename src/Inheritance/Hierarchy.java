package Inheritance;
class parent{
    void display(int a){
        System.out.println("Value of a: "+a);
    }
}

class child extends parent{
    void show(int b){
        System.out.println("Value of b: "+b);
    }
}

class child2 extends parent{
    void print(int c){
        System.out.println("Value of c: "+c);
    }
}
public class Hierarchy {
    public static void main(String args[]){

        child ch= new child();
        ch.display(100);
        ch.show(10);
        child2 ch2= new child2();
        ch2.display(200);
        ch2.print(20);

    }
}
