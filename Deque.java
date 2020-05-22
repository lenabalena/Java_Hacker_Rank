/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:
*/
import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max=Integer.MIN_VALUE;
            
            HashSet<Integer> set= new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
               set.add(num);
               if(deque.size()==m)
               {
                   if(set.size()>max) max=set.size();
                   if(max==m) break;
                   int first=deque.remove();
                   if(!deque.contains(first)) set.remove(first);
               }
            }
            System.out.println(max);
        }
    }
