package Classes;

public class Gretting {

    //no parameter no retuern
    void m1(){
        System.out.println("Hello");
    }

    //No parameter with return
    String m2(){
        return ("Hello how are you");

    }

    //With parameter no return
    void m3(String name){
        System.out.println("Hello "+name);
    }
    //With parameter with return
    String m4(String name){
        return ("Hello "+name);
    }
}
