package ArrayList;
import java.util.*;
//Write a Java program for trimming the capacity of an array list.

public class Task19 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println("befor triming ArrayList size");
        System.out.println(cl);
        cl.trimToSize();
        System.out.println("After triming ArrayList size");
        System.out.println(cl);
    }
}
