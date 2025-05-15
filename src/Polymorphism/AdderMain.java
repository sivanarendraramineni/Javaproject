package Polymorphism;

public class AdderMain {
    public static void main(String args[]){

        Adder a=new Adder();
        int c=a.add();
        System.out.println("The sum of two numbers is: "+c);
       int d= a.add(100,200);
        System.out.println("The sum of two numbers is: "+d);
        int e= a.add(100,200,300);
        System.out.println("The sum of three numbers is: "+e);
        double f=a.add(100,1.1);
        System.out.println("The sum of int and double is: "+f);
        double g=a.add(11.1,100);
        System.out.println("The sum of double and int is: "+g);
    }
}
