package class11;

public class HM7 {
    public static void main(String[] args) {
         /*    Write a Java Program to print the first 10 numbers of
              Fibonacci series.
       */
        int a, b, c;
        a = 0;
        b = 1;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;


        }
    }
}
    