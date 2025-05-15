package Strings;

import java.util.LinkedHashSet;

public class Removedupinstr {
    public static void main(String args[]){

        String str="welcome";
        char a[]=str.toCharArray();
        LinkedHashSet<Character> ha=new LinkedHashSet<Character>();
        for(int i=0;i<a.length;i++){
            ha.add(a[i]);
        }
        for(char c:ha){
            System.out.print(c);
        }


            }
        }


