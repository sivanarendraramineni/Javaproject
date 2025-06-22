package Strings;

public class Count_of_given_word_in_string {
    public static void main(String args[]){
        String str="Siva worked at NCR and Siva is qa engineer is";
        String[] words = str.split(" ");
        String str1="Siva";
        int count1=0;
        for(int i=0;i<words.length;i++){
            if(str1.equals(words[i])){
                count1++;
            }

        }
        System.out.print(str1);
        System.out.println(" "+count1);


    }
}
