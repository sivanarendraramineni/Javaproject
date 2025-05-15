package Encapsulation;

public class AccountMain {

    public static void main(String args[]){

        Account ac=new Account();
        ac.setAccno(101);
        ac.setAccname("John");
        ac.setAccbal(10000);
        System.out.println("Account Number: "+ac.getAccno());
        System.out.println("Account Name: "+ac.getAccname());
        System.out.println("Account Balance: "+ac.getAccbal());

    }
}
