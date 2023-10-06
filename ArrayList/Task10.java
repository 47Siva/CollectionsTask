package ArrayList;
import java.util.*;
// Write a Java program to shuffle elements in an array list.


public class Task10 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        System.out.println("after Shuffle");
        Collections.shuffle(cl);
        System.out.println(cl);
    }
}
