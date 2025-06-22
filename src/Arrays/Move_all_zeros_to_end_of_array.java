package Arrays;

public class Move_all_zeros_to_end_of_array {
    public static void main(String args[]){
        int a[]={0,2,1,0,8,1,0,9};
        int n=a.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;

            }
        }
        while(index<n){
            a[index]=0;
            index++;

        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }

}
