package ArrayList;
import java.util.*;
// Write a Java program to test whether an array list is empty or not.

public class Task18 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        if (cl.isEmpty())
            System.out.println("Yes the Arraylist is empty");
        else
            System.out.println("No the Array list is not emtiy");
        cl.removeAll(cl);
        System.out.println(cl);
        if (cl.isEmpty())
            System.out.println("Yse the Array list is emtiy");
        else
            System.out.println("No the Array list is not emtiy");
    }
}
