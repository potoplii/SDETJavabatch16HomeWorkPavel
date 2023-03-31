package class6;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
/*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
Allow user to enter grade (A, B, or C etc...) and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
 At the end your program should print which grade was entered by a user with explanation.
*/
        Scanner country=new Scanner(System.in);
        System.out.println("Please enter your country");
        String word= country.next();
        System.out.println("What language you speak?");
        Scanner language=new Scanner(System.in);
        String word1=language.next();
        Scanner grade=new Scanner(System.in);
        String word2=grade.next();
        if (word2.equals("A")){
            System.out.println("A-Excellent");
        } else if (word2.equals("B")) {
            System.out.println("B-Good");
        } else if (word2.equals("C")) {
            System.out.println("C-Average");
        } else if (word2.equals("D")) {
            System.out.println("D-Bad");
        }else {
            System.out.println("Not Acceptable");
        }
    }
}




