package class6;

import java.util.Scanner;

public class HW3B {
    public static void main(String[] args) {
/*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season = ” Spring”
if user is born in June, July, August →
season = ” Summer ”  etc …
At the end of the program we should see 1 output as “You were born is season __”. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month = scanner.next();
        switch (month) {
            case "January":
                System.out.println("You were born is season Winter");
                break;
            case "February":
                System.out.println("You were born is season Winter");
                break;
            case "December":
                System.out.println("You were born is season Winter");
                break;
            case "March":
                System.out.println("You were born is season Spring");
                break;
            case "April":
                System.out.println("You were born is season Spring");
                break;
            case "May":
                System.out.println("You were born is season Spring");
                break;
            case "June":
                System.out.println("You were born is season Summer");
                break;
            case "July":
                System.out.println("You were born is season Summer");
                break;
            case "August":
                System.out.println("You were born is season Summer");
                break;
            case "September":
                System.out.println("You were born is season Autumn");
                break;
            case "October":
                System.out.println("You were born is season Autumn");
                break;
            case "November":
                System.out.println("You were born is season Autumn");
                break;
        }
    }
}










