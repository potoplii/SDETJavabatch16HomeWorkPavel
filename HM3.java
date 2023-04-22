package class11;

public class HM3 {
    public static void main(String[] args) {
         /*  Create a 2D array or integer type where you will store
             odd and even numbers. Develop a program which will
             identify/print the even numbers only.
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

                     System.out.print(number+" ");
                     sumEven += number;
                 }else {
                     sumOdd+=number;
                 }
            }


        }System.out.println();
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);



    }
}
    