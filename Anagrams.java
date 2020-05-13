/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
*/
import java.util.Scanner;

public class Solution {
     static  int num=256;
    static boolean isAnagram(String a, String b) {
        boolean f=true;
        String al=a.toLowerCase();
        String bl=b.toLowerCase();
       char[] a1=al.toCharArray();
       char[] b1=bl.toCharArray();
       
       if(a1.length!=b1.length)
       f=false;
       int count1[]=new int[num];
       int count2[]=new int[num];
        for(int c=0; c<num; c++){
            count1[c] = 0;
            count2[c] = 0;
        } 
       int i;
       for(i=0;i<a1.length && i<b1.length;i++)
       {
           count1[a1[i]]++;
           count2[b1[i]]++;
       }
       for(i=0;i<num;i++){
       if(count1[i]!=count2[i]) f=false;}
       return f;
     
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
