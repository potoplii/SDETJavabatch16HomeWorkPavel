package class6;

public class HW4 {
    public static void main(String[] args) {
/*3. Write a program that will read three inputs of scores (quiz, midterm, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
*/
       int quiz=49;
       int midterm=48;
       int finalScore=47;
       int average=(quiz+midterm+finalScore)/3;
        System.out.println(average);
        if (average>=90){
            System.out.println("grade=A");
        } else if (average>=70||average>90) {
            System.out.println("grade=B");

        } else if (average>=50&&average<70) {
            System.out.println("grade=C");

        } else if (average<50) {
            System.out.println("grade=F");

        }
    }
}




