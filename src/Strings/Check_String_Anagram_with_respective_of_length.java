package Strings;

import java.util.HashSet;

public class Check_String_Anagram_with_respective_of_length {
    public static void main(String[] args) {
        String str1 = "aaabbac";
        String str2 = "bacd";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<ch1.length;i++){
            hs.add(ch1[i]);
        }
        HashSet<Character> hs1= new HashSet<>();
        for(int i=0;i<ch2.length;i++){
            hs1.add(ch2[i]);
        }
        System.out.println(hs);
        System.out.println(hs1);
        boolean flag=hs.equals(hs1);


        if (flag == true) {
            System.out.println("both strings are same");
        } else {
            System.out.println("both strings are not same");
        }

    }
}