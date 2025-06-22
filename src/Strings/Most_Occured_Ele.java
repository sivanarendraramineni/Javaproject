package Strings;

public class Most_Occured_Ele {


        public static void main(String[] args) {
            String str = "javascriptajavascript";
            int maxCount = 0;
            char maxChar = ' ';

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                int count = 0;

                // Count occurrences of currentChar
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == currentChar) {
                        count++;
                    }
                }

                // Update max if needed
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = currentChar;
                }
            }

            System.out.println("Most frequent character: " + maxChar + " (occurred " + maxCount + " times)");
        }
    }


