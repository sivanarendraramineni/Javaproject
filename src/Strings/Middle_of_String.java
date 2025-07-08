package Strings;

public class Middle_of_String {
    public static void main(String[] args) {
        String str = "Siva Narendra";
        int n = str.length();
        int mid = n / 2;
        if (n % 2 == 0) {
            System.out.println("Middle of the String is: " + str.substring(mid - 1, mid + 1));
        } else {
            System.out.println("Middle of the String is: " + str.charAt(mid));
        }
    }
}
