package Strings;

public class Diff_Two_Strings {
    public static void main(String args[]){
        String Str1="Have a nice day";
        String Str2="Have a good day";

        String[] str1=Str1.split(" ");
        String[] str2=Str2.split(" ");
        System.out.println(str1.length);
        String diff1="";
        String diff2="";
        for(int i=0;i<str1.length;i++){
            boolean flag=false;
            for(int j=0;j<str2.length;j++){
                if(str1[i].equals(str2[j])){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                diff1+=str1[i]+" ";

            }
        }
        for(int i=0;i<str2.length;i++){
            boolean flag=false;
            for(int j=0;j<str1.length;j++){
                if(str2[i].equals(str1[j])){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                diff2+=str2[i]+" ";

            }
        }
        System.out.println(diff1);
        System.out.println(diff2);


    }
}
