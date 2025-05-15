public class Demo {

            public static void main(String[] args) {

                    //code for sum of array
                    int[] arr = {1, 2, 3, 4, 5,6};
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                            sum += arr[i];
                    }
                    System.out.println("Sum of array: " + sum);
                    //code for average of array
                int n= arr.length;
                    double average = sum /n;
                    System.out.println("Average of array: " + average);


            }
        }