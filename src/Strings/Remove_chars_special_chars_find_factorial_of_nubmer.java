package Strings;

public class Remove_chars_special_chars_find_factorial_of_nubmer {
    public static void main(String[] args) {

        String str = "dwhpr4na$";
        String str1=str.replaceAll("[a-zA-Z0-9]","");
        System.out.println(str1);
        String str2=str.replaceAll("[^a-zA-Z0-9]","");
        String str3=str2.replaceAll("[a-zA-Z]","");
        System.out.println(str3);
        String str4=str2.replaceAll("[0-9]","");
        System.out.println(str4);
        int n=Integer.parseInt(str3);
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }
}
