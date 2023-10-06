package ArrayList;
import java.util.*;
/*
* ****** Write a Java program to update an array element by the given element.*******
* output
* [Red, Green, Orange, White, Black]
* [Red, Green, Yellow, White, Black]
*/

public class Task5 {
    public static void main (String args[])
    {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        cl.set(2,"Yellow");
        System.out.println(cl);
    }
}
