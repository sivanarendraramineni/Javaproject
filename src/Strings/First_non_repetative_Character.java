package Strings;

public class First_non_repetative_Character {
    public static void main(String args[]){
        String str1="Siva Narendra";
        String str=str1.toLowerCase();
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("First non-repetitive character is :" +str.charAt(i));
                break;
            }
        }

    }
}
