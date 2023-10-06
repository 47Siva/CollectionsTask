package ArrayList;
import java.util.*;
// Write a Java program to increase an array list size.

public class Task20 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        //cl.ensureCapacity(0);
        cl.add("redd");
        cl.add("blue");
        cl.add("pink");
        System.out.println(cl);
    }
}
