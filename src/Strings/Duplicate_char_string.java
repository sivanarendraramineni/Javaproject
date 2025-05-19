package Strings;

public class Duplicate_char_string {
    public static void main(String args[]){
        String str="siva Narendra";
        char a[]=str.toCharArray();
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]);
                    System.out.print(" ");
                    flag=true;

                }
            }
        }
        if(flag==false){
            System.out.println("No duplicate characters");
        }
    }
}
