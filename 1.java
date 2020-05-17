import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int a[]=new int[n];
       String line=scan.nextLine();
       Scanner lineScan=new Scanner(line);
      for(int i=0;i<n;i++)
      {a[i]=scan.nextInt();}
       int count=0;
        for(int o=0;o<n;o++)
        { int sum=0; 
            for(int j=o;j<n;j++)
            {
                for(int k=o;k<j;k++)
                {
                    sum+=a[k];
                }
                if(sum<0) count++;
            } 
            
        }
        System.out.println(count);
    }
}
