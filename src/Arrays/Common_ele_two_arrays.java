package Arrays;

public class Common_ele_two_arrays {
    public static void main(String args[]) {
        int a1[]={1,2,3,4,5};
        int a2[]={4,5,6,7,8};
        boolean flag=false;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    System.out.print(a1[i]);
                    System.out.print(" ");
                    flag=true;
                }
            }

        }
        if(flag==false){
            System.out.println("No common elements");
        }
    }
}
