package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int facRecursive(int number) {
        // base condition
        if (number == 0)
            return 1;

        // calculate the factorial of all number
        return number * facRecursive(number - 1);
    }

    public static int facIterative(int number) {

        int facNumber = 1;
        for (int iNumber = 1; iNumber < number; iNumber++) {
            facNumber = facNumber * (iNumber + 1);
        }
        return facNumber;
    }
}

