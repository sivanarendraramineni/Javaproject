package Arrays;

import java.util.HashSet;

public class Unique_eles_in_array {
    public static void main (String args[]){
        int a[] = {1, 5, 2, 3, 4, 1, 2, 3};
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (hs.contains(a[i])) {
                hs.remove(a[i]);
            } else {
                hs.add(a[i]);
            }
        }
        for (int b : hs) {
            System.out.print(b+" ");
        }

    }
}
