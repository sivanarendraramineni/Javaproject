package Strings;

public class Count_of_Given_Char_in_String {
    public static void main(String args[]){
        String str="Siva Narendra";
        char ch='a';
        int count =0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
        System.out.println(ch+" is present in the string " +count);


    }
}
