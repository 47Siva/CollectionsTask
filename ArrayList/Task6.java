package ArrayList;
import java.util.*;
/*
* Write a Java program to remove the third element from an array list.
* [Red, Green, Orange, White, Black]
* After removing third element from the list:
* [Red, Green, White, Black]
*/

public class Task6 {
    public static void main (String args [])
    {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        cl.remove(2);
        System.out.println("After removing third element from the list:   ");
        System.out.println(cl);
    }
}
