package ArrayList;
import java.util.*;
/*
* Write a Java program to retrieve an element (at a specified index) from a given array list.*********
* *** output **********
* [Red, Green, Orange, White, Black]
* First element: Red
* Third element: Orange
*/
public class Task4 {
    public static void main (String args [])
    {
        ArrayList al =  new ArrayList();
        al.add("Red");
        al.add("Green");
        al.add("Orange");
        al.add("white");
        al.add("Black");
        System.out.println(al);
        System.out.println("frist element = "+al.get(0));
        System.out.println("third element = "+al.get(2));
    }
}
