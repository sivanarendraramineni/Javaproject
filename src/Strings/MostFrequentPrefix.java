package Strings;

public class MostFrequentPrefix {
    public static void main(String args[]){
        String[] words = {"flower", "flow", "flight","flowers"};

        String mostfrequentprefix = "";
        int maxcount=1;

        for(int i=0;i<words.length;i++){
            String word=words[i];

            for(int j=1;j<=word.length();j++){
                String prefix=word.substring(0, j);
                int count=0;

                for(int k=0;k<words.length;k++){
                    if(words[k].startsWith(prefix)){
                        count++;
                    }
                }
                if(count>maxcount || (count == maxcount && prefix.length() > mostfrequentprefix.length())) {
                    maxcount = count;
                    mostfrequentprefix = prefix;

            }


            }
        }
        System.out.println("Most Frequent Prefix: " + mostfrequentprefix);
    }
}
