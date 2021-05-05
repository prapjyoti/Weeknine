package calculator;
/*
Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.

 */

public class Calculator {
    public void addition(int a, int b){ //instance method with 2 parameter
        System.out.println(a+b);//print the statement does not return anything

    }
    public void subtraction(int a,int b){
        System.out.println(a-b);
    }
    public void division(int a , int b){
        System.out.println(a/b);
    }
    public void multiplication(int a, int b){
        System.out.println(a*b);
    }
    // instance method with 3 parameter
    public void calculateResult(int a ,int b,char symbol){

      // logic written for calculation
        switch(symbol){
            case'+':
                System.out.println("Addition of " + a + " and " + b + " is " + (a+b));//print result
                break;
            case '-':
                System.out.println("subtraction of " + a + " and " + b + " is " + (a-b));
                break;
            case '/':
                System.out.println("division of " + a + " and " + b + " is " + (a/b));
                break;
            case '*':
                System.out.println("Addition of " + a + " and " + b + " is "  + (a*b));
                break;
            default:
                System.out.println("Invalid symbol");
                break;
        }
    }

}
