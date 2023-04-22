package class11;

public class HM9 {
    public static void main(String[] args) {
         /*  Write a java program to find the second largest
number in the array?
       */
        int[] arr = {5, 10, 15, 20, 25, 30};

        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("The second largest number in the array is " + max2);
    }
}
    