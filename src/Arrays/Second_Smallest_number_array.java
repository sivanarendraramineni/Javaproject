package Arrays;

public class Second_Smallest_number_array {
    public static void main(String args[]){

        int a[]={1,1,5,8,3,2,7,9,5,6,4};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            if(a[i]>first){
                second=first;
                first=a[i];
            }else if(a[i]>second && a[i]!=first){
                second=a[i];
            }
        }
        System.out.println("First largest number is: "+first);
        System.out.println("Second largest number is: "+second);

        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0; i<a.length;i++){
            if(a[i] < smallest){
                secondsmallest=smallest;
                smallest=a[i];
            }else if(a[i]<secondsmallest && a[i]!=smallest){
                secondsmallest=a[i];
            }
        }
        System.out.println("First smallest number is: "+smallest);
        System.out.println("Second smallest number is: "+secondsmallest);



    }
}
