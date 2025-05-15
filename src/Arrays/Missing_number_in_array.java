package Arrays;

public class Missing_number_in_array {
    public static void main(String args[]){
        int a[]={1,2,3,5,6};
        int n=a.length+1;
        int expsum=(n*(n+1))/2;
        int actsum=0;
        for(int i=0;i<a.length;i++){
            actsum=actsum+a[i];
        }
        int missnum=expsum-actsum;
        System.out.println("Missing number is: "+missnum);
    }
}
