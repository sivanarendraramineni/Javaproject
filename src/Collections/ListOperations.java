package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOperations {
    public static void main(String args[]){
        List<Integer> li=new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println(li);
        int[] a={10, 20, 30, 40,50};
        List<Integer> li2=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            li2.add(a[i]);
        }
        System.out.println(li2);
        boolean equals=li.equals(li2);
        System.out.println(equals);
        li.remove(0); // Removes the element at index 0
        System.out.println(li);
        boolean empty=li2.isEmpty();
        System.out.println(empty);
        int n=li2.size();
        System.out.println(n);
        boolean contain=li2.contains(20);
        System.out.println(contain);
        boolean containsall=li2.containsAll(li);
        System.out.println(containsall);
        li2.addAll(li);
        System.out.println(li2);
        li2.retainAll(li);
        System.out.println(li2);

        for(int b: li2){
            System.out.print(" "+b);
        }
        System.out.println();
        for(int i=0; i<li.size(); i++){
            System.out.print(" "+li.get(i));
        }
        System.out.println();

        Iterator<Integer> it=li2.iterator();
        while(it.hasNext()){
            int i=it.next();
            System.out.print(" "+i);
        }





    }
}
