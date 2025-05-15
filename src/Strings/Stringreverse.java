package Strings;

public class Stringreverse {
    public static void main(String args[]){
        String str="Siva Narendra Ramineni";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
        System.out.println(str==rev);

//string reverse
        StringBuffer str1=new StringBuffer("Siva Narendra Ramineni");
        StringBuffer rev1=str1.reverse();
        System.out.println(rev1);
        System.out.println(str1==rev1);

        //find duplicate characters
        String str2="welcome";
        char a[]=str2.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[j]);
                }
            }
        }



    }
}
