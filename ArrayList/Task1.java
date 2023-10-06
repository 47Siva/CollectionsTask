package ArrayList;/*
* Write a Java program to create an array list, add some colors (strings) and print out the collection.
*  output [Red, Green, Orange, White, Black]
*/
import java.util.*;
public class Task1 {
    public static void main (String args [])
    {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
    }
}
