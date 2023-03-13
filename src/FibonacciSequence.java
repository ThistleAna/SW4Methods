import java.math.BigInteger; // import BigInteger class

public class FibonacciSequence {
    public static void main(String[] args) {
        fibonacci(100);
    } // end of main method

    // fibonacci generator
    public static void fibonacci(int counter) {
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;
        BigInteger nextNum = BigInteger.ZERO; // 0 1 nextNum

        System.out.println(num1 + " " + num2 + " ");
        // loop through to the end of the counter to generate the next sequence
        for (int i=2; i <counter; i++) {
            nextNum = num1.add(num2);
            System.out.println(nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
