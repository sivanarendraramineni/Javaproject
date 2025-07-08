package Strings;

public class Longestword_in_sentence {
    public static void main(String[] args) {
        String sentence = "Siva Narendra is a good man";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of longest word: " + longestWord.length());
    }
}