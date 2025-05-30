package Interface;

interface phone{
    void call();
    void sms();
    default void camera(){
        System.out.println("This is camera");
    }
    static void ring(){
        System.out.println("This is ring");
    }

        }
public class InterfaceDemo implements phone {
     public void call(){
        System.out.println("This is call");
    }
    public void sms(){
        System.out.println("This is sms");
    }

    public static void main(String args[]){

        InterfaceDemo obj=new InterfaceDemo();
        obj.call();
        obj.sms();
        obj.camera();
        phone.ring();

        phone sh=new InterfaceDemo();
        sh.call();
        sh.sms();
        sh.camera();
        phone.ring();

        

    }
}
