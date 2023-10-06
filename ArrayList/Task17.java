package ArrayList;
import java.util.*;
// Write a Java program to empty an array list.

public class Task17 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        cl.removeAll(cl);
        System.out.println(cl);
    }
}
