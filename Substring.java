/*
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
*/
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String sub;
        
        if(s.length()>=1 && s.length()<=1000){
        for(int i=0;i<=((s.length())-k);i++)
        {
            sub=s.substring(i,i+k);
           if(i==0)
           smallest=sub;
           if(sub.compareTo(largest)>0)
           largest=sub;
           else if(sub.compareTo(smallest)<0)
           smallest=sub;
        }}
       
        return smallest + "\n" + largest;
        
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
