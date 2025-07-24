package Strings;

public class Reverse_str_preserve_numbers_special_chars_in_string {

    public static void main(String args[]){
        String str="s23iv@2a";
        StringBuffer stb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                stb.append(ch);
            }
        }
        stb.reverse();
        StringBuffer result=new StringBuffer();
        int index=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                result.append(stb.charAt(index));
                index++;
            } else {
                result.append(ch);
            }
        }
        System.out.println("Original String :"+str);
        System.out.println("Reversed String :"+result);

    }


}
