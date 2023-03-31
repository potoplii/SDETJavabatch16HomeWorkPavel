package class6;

public class HW1A {
    public static void main(String[] args) {
/*Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”,
any day from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
*/
        int day=1;
        String weekDay="Weekday";
        String weekEnd="Weekend";

        if (day>0&&day<6) {
            System.out.println("Its is a "+weekDay);
        } else if (day>5&&day<8) {
            System.out.println("It is a "+weekEnd);
        } else if (day!=1||day!=2||day!=3||day!=4||day!=5||day!=6||day!=7) {
            System.out.println("Invalid day");
        }
    }
}




