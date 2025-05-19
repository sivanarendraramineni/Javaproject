package Strings;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_sort {

    public static void main(String args[]){
        String str="f1e2d4c3d0ba5";
        String str1=str.replaceAll("[0-9]","");
        String str2=str.replaceAll("[a-zA-Z]","");

        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        LinkedHashSet<Character> ha=new LinkedHashSet<Character>();
        for(int i=0;i<a.length;i++){
            ha.add(a[i]);
        }
        StringBuilder sortedAlphas = new StringBuilder();
        for(char c : ha){
            sortedAlphas.append(c);
        }
        String sortednumbers = new String(b);
        String sortedString = sortedAlphas + sortednumbers;
        System.out.println("Output: " + sortedString);



    }


}
