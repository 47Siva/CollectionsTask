package ArrayList;
/*
*  Write a Java program to insert an element into the array list at the first position.*****\
*  ***** Output *********
* [Red, Green, Orange, White, Black]
* [Pink, Red, Green, Orange, White, Yellow, Black]
*/
import java.util.*;

public class Task3 {
    public static void main (String args [])
    {
        LinkedList li = new LinkedList();
        li.add("Red");
        li.add("Green");
        li.add("Orange");
        li.add("white");
        li.add("Black");
        System.out.println(li);
        li.addFirst("pink");
        System.out.println (li);
    }
}
