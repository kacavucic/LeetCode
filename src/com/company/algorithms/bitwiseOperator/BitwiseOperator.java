package com.company.algorithms.bitwiseOperator;

public class BitwiseOperator {

    /*
        Bitwise Operators

    Bitwise operators work on binary digits or bits of input values.
    We can apply these to the integer types –  long, int, short, char, and byte.

    Bitwise operators work on a binary equivalent of decimal numbers and perform operations on them bit by bit as per
    the given operator:
        - First, the operands are converted to their binary representation
        - Next, the operator is applied to each binary number and the result is calculated
        - Finally, the result is converted back to its decimal representation
     */

    // Let's understand with an example; let's take two integers:
    int value1 = 6;
    int value2 = 5;

    // Next, let's apply a bitwise OR operator on these numbers:
    int result = value1 | value2;

    // To perform this operation, first, the binary representation of these numbers will be calculated.
    /*
    Binary number of value1 = 0110
    Binary number of value2 = 0101
     */

    // Then the operation will be applied to each bit. The result returns a new binary number.
    /*
    0110
    0101
    -----
    0111
     */

    // Finally, the result 0111 will be converted back to decimal which is equal to 7.

    /*
    Bitwise operators are further classified as bitwise logical and bitwise shift operators.
     */

    /*
        Bitwise Logical Operators

    The bitwise logical operators are AND(&), OR(|), XOR(^), and NOT(~).
     */

    /*
        Bitwise OR (|)

    The OR operator compares each binary digit of two integers and gives back 1 if either of them is 1.
    uUsing OR, 0 and 0 will result in 0, while any combination with at least a 1 will result in 1.

    This is similar to the || logical operator used with booleans. When two booleans are compared the result is true if
    either of them is true. Similarly, the output is 1 when either of them is 1. We saw an example of this operator in
    the previous section.
     */
    public static void main(String[] args) {
        int value1 = 6;
        int value2 = 5;
        int result = value1 | value2;
        System.out.println(result); // 7
    }

    /*
    The AND operator compares each binary digit of two integers and gives back 1 if both are 1, otherwise it returns 0.

This is similar to the && operator with boolean values. When the values of two booleans are true the result of a && operation is true.

Let's use the same example as above, except now using the & operator instead of the | operator
     */

}
