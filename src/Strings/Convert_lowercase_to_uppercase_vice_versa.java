package Strings;

public class Convert_lowercase_to_uppercase_vice_versa {
    public static void main(String args[]){
        String str="Siva Narendra Ramineni";
        StringBuilder result=new StringBuilder();
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(Character.isLowerCase(ch[i])){
                result.append(Character.toUpperCase(ch[i]));
            } else if(Character.isUpperCase(ch[i])){
                result.append(Character.toLowerCase(ch[i]));
            } else {
                result.append(ch[i]);
            }
        }
        System.out.println("Before "+str);
        System.out.println("Result "+result.toString());
    }
}
