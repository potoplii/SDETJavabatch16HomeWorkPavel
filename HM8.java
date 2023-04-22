package class11;

public class HM8 {
    public static void main(String[] args) {
         /*    Maximum and minimum number in the array?
       */
        int[] arr = {5, 10, 15, 20, 25, 30};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum number in the array is " + max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum number in the array is " + min);
    }
}
    