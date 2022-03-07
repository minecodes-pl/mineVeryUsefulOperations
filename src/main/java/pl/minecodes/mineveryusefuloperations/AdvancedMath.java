package pl.minecodes.mineveryusefuloperations;

import pl.minecodes.mineveryusefuloperations.exception.DumbUserException;

public final class AdvancedMath {

    /**
     * Sum two numbers
     * @param num0 first number
     * @param num1 second number
     * @return result
     */
    public static int sum(int num0, int num1) {
        for (int i = 0; i < num1; i++) {
            num0 += 1;
        }

        return num0;
    }

    /**
     * Subtract two numbers
     * @param num0 first number
     * @param num1 second number
     * @return result
     */
    public static int subtract(int num0, int num1) {
        for (int i = 0; i < num1; i++) {
            num0 -= 1;
        }

        return num0;
    }

    /**
     * Multiply two numbers
     * @param num0 first number
     * @param num1 second number
     * @return result
     */
    public static int multiply(int num0, int num1) {
        int product = 0;
        for (int i = 0; i < num1; i++) {
            product += num0;
        }

        return product;
    }

    /**
     * Divide two numbers
     * @param num0 first number
     * @param num1 second number other than 0
     * @return result
     *
     * @throws DumbUserException if user is dumb enough to provide 0 as second number
     */
    public static int divide(int num0, int num1) {
        if (num1 == 0) {
            throw new DumbUserException("Don't divide by zero! (╯°□°）╯︵ ┻━┻");
        }

        int quotient = 0;
        while (num0 >= num1) {
            num0 -= num1;
            quotient++;
        }

        return quotient;
    }

}
