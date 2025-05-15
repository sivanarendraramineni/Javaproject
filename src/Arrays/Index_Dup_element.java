package Arrays;

public class Index_Dup_element {
    public static void main(String args[]){

        int a[]={1,2,1,3,8,7,9,4,1,8,1,3,4};
        int search=3;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.print(i);
                System.out.print(" ");
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Element not found");
        }



    }
}
