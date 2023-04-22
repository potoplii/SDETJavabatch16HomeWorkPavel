package class11;

public class HM1 {
    public static void main(String[] args) {
         /*  Create a program that uses an array to store a list of
        temperatures for a week, and then uses a loop to find
        the highest and lowest temperature for the week.

       */
        int[] temp = {33, 56, 23, 89, 104, 14,-3};
        int max = temp[0];
        for (int i : temp) {
            if (i > max) {
                max=i;

            }
        }System.out.println(max);
    }
}
