/*
In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

In this problem we will test your knowledge on Java Priority Queue.

There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:

The Student class should implement:
The constructor Student(int id, String name, double cgpa).
The method int getID() to return the id of the student.
The method String getName() to return the name of the student.
The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the given events and return all the students yet to be served in the priority order.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student implements Comparable<Student>{
    private final String name;
    private final double cgpa;
    private final int id;
    Student(String a,double b,int c)
    {
        name=a;
        cgpa=b;
        id=c;
    }
    public String getName()
    {
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
    public int getId()
    {
        return id;
    }
    public int compareTo(Student s)
    {
        if(cgpa==s.cgpa)
        {
            if(name.compareTo(s.name)==0)
            {
                if(id==s.id)
                return 0;
                else if(id>s.id) return 1;
                else return -1;
            }
            return name.compareTo(s.name);
        }
        if(cgpa>s.cgpa) return -1;
        else return 1;
    }
}
class Priorities 
{  Priorities(){}
    public List<Student> getStudents(List<String> events)
{
    PriorityQueue<Student> queue=new PriorityQueue<Student>();
    for(String i:events)
    {
        String s[]=new String[4];
        s=i.split("\\s");
        if(s.length>1)
        {
            queue.add(new Student(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));
        }
        else queue.poll();
    }
    List<Student> stud=new ArrayList<>();
    while(!queue.isEmpty())
    {
        stud.add(queue.poll());
    }
    return stud;
}
}



public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
