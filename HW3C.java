package class6;

import java.util.Scanner;

public class HW3C {
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
            case "February":
            case "December":
                System.out.println("You were born is season Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("You were born is season Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born is season Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("You were born is season Autumn");
                break;
        }
    }
}










