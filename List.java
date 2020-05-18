/*
For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
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
    List<Integer> list=new ArrayList<Integer>(n);
    for(int i=0;i<n;i++)
    {   int element=scan.nextInt();
        list.add(element);
    }
    int k=scan.nextInt();
    for(int i=0;i<k;i++)
    {
        String op=scan.next();
        if(op.equals("Insert")) 
        {   int x=scan.nextInt();
            int y=scan.nextInt();
            list.add(x,y);
        }
        else if(op.equals("Delete"))
        {   int del=scan.nextInt();
            list.remove(del);
        }
    }
   
    for(int element:list)
    {System.out.print(element+" ");}
    }
}
