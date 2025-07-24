package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;

public class Remove_duplicates_from_list {
    public static void main (String args[]){

        List<Character> list = Arrays.asList('a', 'b', 'g', 'e', 'a', 'b');
        //LinkedHashSet<Character> set = new LinkedHashSet<>(list);
        //System.out.println("List without duplicates: " + set);
        List<Character> list1=new ArrayList<>();
        boolean flag=false;
        for(char c : list) {
            if (list1.contains(c)){
                flag=true;
                break;
            } else{
                list1.add(c);
            }
        }

        if(flag==true){
            System.out.println("List contains duplicates");
        } else {
            System.out.println("List does not contain duplicates");
        }
        System.out.println("List after removing duplicates: "+list1);
    }
}
