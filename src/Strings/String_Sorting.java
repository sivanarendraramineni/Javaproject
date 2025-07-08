package Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_Sorting {

    public static void main(String args[]){

        String str="Siva Narendra";
        char[] ch=str.toLowerCase().toCharArray();
        Arrays.sort(ch);
        LinkedHashSet<Character> hs= new LinkedHashSet<>();
        for(char c: ch){
            hs.add(c);
        }
        for(char c: hs){
            System.out.print(c);
        }

    }
}
