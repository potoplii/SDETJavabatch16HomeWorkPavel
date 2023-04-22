package class11;

public class HM4 {
    public static void main(String[] args) {
         /*   Create a 2D array of integers. Develop a program
  which will calculate the sum of even and odd numbers
  for that array.
       */
       int sumOdd=0;
       int sumEven=0;
       int number;
        int[][] num = {
                       {33, 56, 23},
                       {89, 104, 14},
                       {-3, 4, 6}
                      };
        for (int row = 0; row <num.length ; row++) {
            for (int column = 0; column < num[row].length ; column++) {
                number=num[row][column];
                 if (number%2==0) {
                     sumEven += number;
                 }else {
                     sumOdd+=number;
                 }
            }


        }
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);



    }
}
    