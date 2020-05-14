/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer tokenizer=new StringTokenizer(s," ?!,.'_@'");
        System.out.println(tokenizer.countTokens());
        while(tokenizer.hasMoreTokens())
        {System.out.println(tokenizer.nextToken());

        }

        scan.close();
    }
}
