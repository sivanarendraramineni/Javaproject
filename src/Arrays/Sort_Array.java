package Arrays;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class Sort_Array {
    public static void main(String args[]) {
        Integer a[] = {1, 2, 0, 1, 8, 0, 3, 9, 7, 0};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        String str="f1e2d4c3d0ba5";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String input = "f1e2d4c3d0ba5";
        char[] charArray = input.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert sorted array back to a string
        String sortedOutput = new String(charArray);

        // Print the result
        System.out.println("Output: " + sortedOutput);

    }
}