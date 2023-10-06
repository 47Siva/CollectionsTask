package ArrayList;
import java.util.*;
/*
* Write a Java program to sort a given array list. ********
*
*/

public class Task8 {
    public static void main (String args[]) {
        ArrayList<String> cl = new ArrayList<String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        Collections.sort(cl);
    }
}
