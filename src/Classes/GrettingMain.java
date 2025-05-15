package Classes;

public class GrettingMain {

    public static void main(String args[]){
        Gretting gr=new Gretting();
        gr.m1();
        System.out.println(gr.m2());
        gr.m3("John");
        String s=gr.m4("John");
        System.out.println(s);
    }
}
