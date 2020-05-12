/*
Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        int sum;
        sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else System.out.println("No");
        String A1=A.substring(0,1).toUpperCase();
        String B1=B.substring(0,1).toUpperCase();
        System.out.println(A1+A.substring(1)+" "+B1+B.substring(1));
        
    }
}



