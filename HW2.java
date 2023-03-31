package class6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
/*Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scanner.nextInt();
        if (num>0&&num<11){
            System.out.println("Small number");
        } else if (num>10&&num<101) {
            System.out.println("Medium number");

        } else if (num>100&&num<1001) {
            System.out.println("Large number");
        }

    }
    }









