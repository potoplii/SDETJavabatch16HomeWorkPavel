package class11;

public class HM2 {
    public static void main(String[] args) {
         /*  Create an array of integer values. After the array is
         created, calculate the sum of all stored elements in
          that array.
       */
        int[] temp = {33, 56, 23, 89, 104, 14,-3};
        int sum=0;
        for (int i : temp) {

               sum=sum+i;

            }
        System.out.println(sum);
    }
}
    