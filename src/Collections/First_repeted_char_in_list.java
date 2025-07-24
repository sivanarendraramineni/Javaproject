package Collections;

import java.util.*;
public class First_repeted_char_in_list {
    public static void main(String args[]){
        List<Character> list= Arrays.asList('a', 'b', 'g', 'e', 'a', 'b');
        List<Character> list1=new ArrayList<>();
        for(char c: list) {
            if (list1.contains(c)){
                System.out.println("First repeated character in the list is: " + c);
                return;
            } else{
                list1.add(c);
            }
        }
        System.out.println("No repeated characters in the list");
    }
}
