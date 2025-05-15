package Strings;

public class Strrev_Spaces_Preserve {
    public static void main(String args[]){
        String str="Siva Narendra Ramineni";
        String str1=str.replaceAll(" ","");
        System.out.println(str);
        StringBuffer st=new StringBuffer(str1);
        st.reverse();
        //System.out.println(st);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                st.insert(i,' ');
            }
        }
        System.out.println(st);


    }
}
