package homeworknine;
/*
Re write the student mark sheet programme using if else and while loop.
 */

import java.util.Scanner;

public class Programme_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//called scanner class

        System.out.print("Enter the name of Student ");
        String name = sc.nextLine();
        System.out.print("Enter the Roll Number     ");
        String roll = sc.nextLine();
        System.out.print("Enter the Marks of Maths  ");
        int maths = sc.nextInt();
        while(maths<0 || maths>100){
            System.out.println("Invalid input, Marks should be between 0 to 100");
            maths=sc.nextInt();
        }
        System.out.print("Enter the Marks of Science ");
        int science = sc.nextInt();
        while(science<0 || science>100){
            System.out.println("Invalid input, Marks should be between 0 to 100");
            science=sc.nextInt();
        }
        System.out.print("Enter the Marks of English ");
        int english = sc.nextInt();
        while(english<0 || english>100){
            System.out.println("Invalid input, Marks should be between 0 to 100");
            science=sc.nextInt();
        }

        int total = maths + english + science;//formula for total of subject
        float percent;//datatype declare for percent
        percent = total / 3;//percent formula
        String grade = "";
        String result = "";

        if (percent >= 80) {
            grade = "A+";
            result = "Pass";
        } else if (percent >= 60) {
            grade = "A";
            result = "Pass";
        } else if (percent >= 50) {
            grade = "B";
            result = "pass";
        } else if (percent >= 35) {
            grade = "C";
            result = "Pass";
        } else {
            result = "Fail";
        }
        if ((maths <= 35) || (science <= 34) || (english <= 34)) {
            result = "Fail";
        }

        //print statement

        System.out.println("|-------------------------- |");
        System.out.println("|  Mark sheet               |");
        System.out.println("|---------------------------|");
        System.out.println("|Name:   " + name + "|");
        System.out.println("|Roll No. " + roll + "|");
        System.out.println("|---------------------------|");
        System.out.println("|Subject:   marks           |");
        System.out.println("|Maths     :   " + maths + "|");
        System.out.println("|Science: " + science + "|");
        System.out.println("|English: " + english + "|");
        System.out.println("|---------------------------|");
        System.out.println("|Total:         " + total + "|");
        System.out.println("|---------------------------|");
        System.out.println("|Percentage:   " + percent + "|");
        System.out.println("|Result:        " + result + "|");
        System.out.println("|Grade:   " + grade + "|");
        System.out.println("|---------------------------|");

    }


}














