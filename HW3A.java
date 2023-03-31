package class6;

import java.util.Scanner;

public class HW3A {
    public static void main(String[] args) {
/*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season = ” Spring”
if user is born in June, July, August →
season = ” Summer ”  etc …
At the end of the program we should see 1 output as “You were born is season __”. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month = scanner.next();
        if (month.equals("January")) {
            System.out.println("You were born is season Winter");
        } else if (month.equals("February")) {
            System.out.println("You were born is season Winter");
        } else if (month.equals("December")) {
            System.out.println("You were born is season Winter");
        } else if (month.equals("March")) {
            System.out.println("You were born is season Spring");
        } else if (month.equals("April")) {
            System.out.println("You were born is season Spring");
        } else if (month.equals("May")) {
            System.out.println("You were born is season Spring");
        } else if (month.equals("June")) {
            System.out.println("You were born is season Summer");
        } else if (month.equals("July")) {
            System.out.println("You were born is season Summer");
        } else if (month.equals("August")) {
            System.out.println("You were born is season Summer");
        } else if (month.equals("September")) {
            System.out.println("You were born is season Autumn");
        } else if (month.equals("October")) {
            System.out.println("You were born is season Autumn");
        } else if (month.equals("November")) {
            System.out.println("You were born is season Autumn");
            }

    }

}










