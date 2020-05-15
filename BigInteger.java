/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

a and b are non-negative integers and can have maximum 200 digits.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        BigInteger int1=s.nextBigInteger();
        BigInteger int2=s.nextBigInteger();
        BigInteger sum;
        BigInteger multipl;
        sum=int1.add(int2);
        multipl=int1.multiply(int2);
        System.out.println(sum);
        System.out.println(multipl);
    }
}
