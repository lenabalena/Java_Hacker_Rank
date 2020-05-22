/*
Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int m=scan.nextInt();
       BitSet b1=new BitSet(n);
       BitSet b2=new BitSet(n);
       for(int i=0;i<m;i++)
       {
           String string=scan.next();
           int j=scan.nextInt();
           int k=scan.nextInt();
           if(string.equals("AND")){
               if(j==1 && k==2)
               {
                   b1.and(b2);
               } else b2.and(b1);
           }
           else if(string.equals("SET"))
           {
               if(j==1)
               
                   b1.set(k);
                else if(j==2) b2.set(k);
           }
           else if(string.equals("FLIP"))
           {
               if(j==1)
               b1.flip(k);
               else b2.flip(k);
           }
           else if(string.equals("XOR"))
           {
               if(j==1)
               b1.xor(b2);
               else b2.xor(b1);

           }
           else if(string.equals("OR"))
           {
               if(j==1)
               b1.or(b2);
               else b2.or(b1);
           }
          System.out.print(b1.cardinality()+" ");
          System.out.print(b2.cardinality());
          System.out.println();
       }
    }
}
