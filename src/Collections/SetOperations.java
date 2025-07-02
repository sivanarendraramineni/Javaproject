package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperations {

    public static void main(String args[]){

        HashSet<Integer> hs1=new HashSet<Integer>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);
        int[] a={10, 40, 30, 20,50};
        HashSet<Integer> hs2=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            hs2.add(a[i]);
        }
        System.out.println(hs2);
        boolean equals=hs1.equals(hs2);
        System.out.println(equals);
        hs1.remove(10);
        System.out.println(hs1);

        boolean empty=hs2.isEmpty();
                System.out.println(empty);
        int n=hs2.size();
        System.out.println(n);

        boolean contain=hs2.contains(20);;
        System.out.println(contain);
        boolean containsall=hs2.containsAll(hs1);
        System.out.println(containsall);

        hs2.addAll(hs1);
        System.out.println(hs2);
        hs2.retainAll(hs1);
        System.out.println(hs2);
        hs2.removeAll(hs1);
        System.out.println(hs2);


        for(int b: hs2){
            System.out.print(" "+b);

        }

        Iterator<Integer> it=hs1.iterator();
        while(it.hasNext()){
            int i=it.next();
            System.out.print(" "+i);
        }











    }
}
