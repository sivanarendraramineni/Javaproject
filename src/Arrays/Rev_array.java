package Arrays;

import java.util.Arrays;

public class Rev_array {
    public static void main (String args[]){
        int a[]={2,5,7,9,1,4,6,3};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(Arrays.toString(a));
        for(int j=a.length-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
