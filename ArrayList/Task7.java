package ArrayList;
import java.util.*;
//  Write a Java program to search for an element in an array list.


public class Task7 {
    public static void main (String args[])
    {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
       if (cl.contains("Red"))
           System.out.println("found the element");
       else {
           System.out.println("not founded");
       }
    }
}
