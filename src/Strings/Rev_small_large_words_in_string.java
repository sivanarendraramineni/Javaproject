package Strings;

public class Rev_small_large_words_in_string {
    public static void main(String args[]){



               String str="My name is Siva Narendra";
               String rev="";
               String[] words=str.split(" ");
               String small=words[0];
               String large=words[0];
               for(int i=0;i<words.length;i++){

                   if(words[i].length()<small.length()){
                       small=words[i];
                   }
                   if(words[i].length()>large.length()){
                       large=words[i];;
                   }

        }
               for(int i=0;i<words.length;i++){
                   String word=words[i];
                   String revword="";
                   if(word.equals(small) || word.equals(large)){
                       for(int j=word.length()-1;j>=0;j--){
                           revword=revword+word.charAt(j);
                       }
                       rev=rev+revword+" ";
                   }
                   else{
                       rev=rev+word+" ";
                   }
               }
               System.out.println(rev);




            }
        }





