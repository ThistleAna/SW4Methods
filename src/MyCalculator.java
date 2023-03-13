//Workbook methods, Q.10

// import scanner
import java.util.Scanner;
public class MyCalculator {
    // main method starts here
    public static void main(String[] args) {
        // create scanner object
        Scanner reader=new Scanner(System.in);
        // ask user to enter 1st number, save to num1 variable
        System.out.println("Enter the first number:");
        int num1 = reader.nextInt();
        // ask user to enter 2nd number, save to num2 variable
        System.out.println("Enter the second number");
        int num2 = reader.nextInt();
        // call the  method and print the result
        System.out.println("Addition:  " + num1 + " + " + num2 + " = " + plus(num1, num2));
        System.out.println("Minus:  " + num1 + " - " + num2 + " = " + minus(num1, num2));
        System.out.println("Multiply:  " + num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println("Division:  " + num1 + " / " + num2 + " = " + division(num1, num2));

    }

    // method 1, addition
    public static int plus (int a, int b) {
        // return a+b
        return a + b;
    }

    // method 2, substraction
    public static int minus (int a, int b) {
        //return a - b
        return a - b;
    }

    // method 3, multiplication
    public static int multiply (int a, int b) {
        //return a * b
        return a * b;
    }

    // method 4, division
    public static int division (int a, int b) {
        //return a / b
        return a / b;

    }
}
