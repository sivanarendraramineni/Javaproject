package Strings;

public class Remove_given_Char_String {
    public static void main(String args[]){
        String str="siva Narendra";
        char ch='s';
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
