package calculator;
/*
Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)


 */

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);//scanner class
        Calculator operater=new Calculator();//obj for scanner class
        String choice;
        //do while statements
        do{
            System.out.println("Enter First Number");
            int a= scanner.nextInt();
            System.out.println("Enter Second Number");
            int b= scanner.nextInt();
            System.out.println("Enter the any of symbol (+,-,/,*");
            char symbol=scanner.next().charAt(0);
            operater.calculateResult(a,b,symbol);
            System.out.println("Do you wish to continue");
            choice=scanner.next();
        }
        while(choice.equalsIgnoreCase("Yes"));
    }
}
