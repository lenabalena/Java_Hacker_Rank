/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       ArrayList <List<Integer>> lists=new ArrayList<List<Integer>>();
       int n=scan.nextInt();
       for(int i=0;i<n;i++)
       {
           List<Integer> list=new ArrayList<Integer>();
           int d=scan.nextInt();
           for(int j=0;j<d;j++)
           {
               list.add(scan.nextInt());
           }
           lists.add(list);
       }
       int q=scan.nextInt();
       for(int i=0;i<q;i++)
       {
           int x=scan.nextInt();
           int y=scan.nextInt();
           if(y>lists.get(x-1).size())
           {System.out.println("ERROR!");}
           else{
               System.out.println(lists.get(x-1).get(y-1));
           }
       }
        scan.close();
    }
}
