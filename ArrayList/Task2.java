package ArrayList;

import java.util.*;
/*
* **********  Write a Java program to iterate through all elements in an array list. *************
* ***** output *********
* Red
* Green
* Orange
* White
* Black
*/
public class Task2 {
    public static void main (String args [])
    {
        ArrayList<String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        Iterator i = cl.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
