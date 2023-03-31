package class6;

public class HW1 {
    public static void main(String[] args) {
/*Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
*/
        int day=8;
        String weekDay="Weekday";
        String weekEnd="Weekend";

        if (day>=1&&day<=5) {
            System.out.println("Its is a "+weekDay);
        } else if (day>=6&&day<=7) {
            System.out.println("It is a "+weekEnd);
        } else if (day>7||day<1) {
            System.out.println("Invalid day");
        }
    }
}




