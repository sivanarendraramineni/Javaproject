package Collections;
import java.util.*;
public class Remove_nulls_from_list {
    public static void main(String args[]){

        List<Character> list= Arrays.asList('a', 'b', null, 'g', 'e', null, 'a', 'b');
        List<Character> list1=new ArrayList<>();
        for(Character c: list){
            if( c != null) {
                list1.add(c);
            }
        }
        System.out.println("List after removing nulls: " + list1);

    }
}
