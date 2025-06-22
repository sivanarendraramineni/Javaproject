package Strings;

public class Most_occuerd_word_in_scentance_count {
    public static void main(String args[]){
        String str="Siva worked at NCR and Siva is qa engineer is";
        String[] words = str.split(" ");
        String mostFrequentWord = "";
        int maxCount = 0;
        for(int i=0;i<words.length;i++){
            int count=0;
            String word=words[i];
            for(int j=0;j<words.length;j++){
                if(word.equals(words[j])){
                    count++;
                }
            }

            if(count>maxCount){
                maxCount=count;
                mostFrequentWord=word;
            }
        }
        System.out.print(mostFrequentWord);
        System.out.println(" "+maxCount);

    }
}
