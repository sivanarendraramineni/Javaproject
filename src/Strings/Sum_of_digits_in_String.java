package Strings;

public class Sum_of_digits_in_String {

    public static void main(String args[]){
        String str="sivanarendra1145";
        String str1=str.replaceAll("[a-zA-Z]","");
        int a=Integer.parseInt(str1);
        System.out.println(a);
        int sum=0;
        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
    System.out.println(sum);

    }

}
