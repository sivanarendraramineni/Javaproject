package ExceptionHandling;

import java.util.Scanner;

public class SingleException {
    public static void main(String args[]){

        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
            int b=a/0;
            System.out.println("The value of b is: " + b);
        }
        catch ( ArithmeticException e){
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());


        }
    }
}
