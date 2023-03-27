// import Scanner
import java.util.Scanner;
public class MinandMax {
    public static void main(String[] args) { // MAIN METHOD
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // read user input (integers) num1, num2, num3;
        System.out.println("Enter 3 numbers = ");
        int NumOne = reader.nextInt();
        int NumTwo = reader.nextInt();
        int NumThree = reader.nextInt();

        // print out the biggest number, call back the maxNumber method
        System.out.println("The biggest number is " + maxNumber (NumOne, NumTwo, NumThree ));
        // print out the smallest number, call back the minNumber method
        System.out.println("The smallest number is " + minNumber (NumOne, NumTwo, NumThree ));

        
    } //END OF MAIN METHOD

    // Method to find the biggest number
    static int maxNumber(int a, int b, int c) {
        // do if else-if statement to find the biggest number, use return keyword
        if (a > b && a > c) { // first case, a is biggest
            return a;
        } else if (b > a && b > c) { // second, b is biggest
            return b;
        } else {
            return c; // third case, c is biggest
        }
    } // END OF maxNumber method

    // create minNumber method, find the smallest number
    static int minNumber(int a, int b, int c) {
        // do if else-if statement to find the biggest number, use return keyword
        if (a < b && a < c) { // first case, a is biggest
            return a;
        } else if (b < a && b < c) { // second, b is biggest
            return b;
        } else {
            return c; // third case, c is biggest
        }
    }



}
