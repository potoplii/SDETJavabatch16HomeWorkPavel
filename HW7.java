package class6;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
     /*Write a program that will ask user to input inputs the current time (use 24-hour format).
            Based on the given time define:
          if hour is between 1-11 --> Morning
          if hour between 12-15 --> Afternoon
         if hour between 16-20 --> Evening
           if hour between 21-24 --> Night
            */

        Scanner time = new Scanner(System.in);
        System.out.println("Please insert the current time (24-hour format hh.mm)");
        double currentTime = time.nextDouble();
        if (currentTime >= 0 && currentTime <= 11.59) {
            System.out.println("Morning");
        } else if (currentTime >= 12 && currentTime <= 15.59) {
            System.out.println("Afternoon");
        } else if (currentTime >= 16 && currentTime <= 20.59) {
            System.out.println("Evening");
        } else if (currentTime >= 21 && currentTime <= 23.59) {
            System.out.println("Night");
        }


    }
}




