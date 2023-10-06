package ArrayList;
import java.util.*;
//Write a Java program to print all the elements of an ArrayList using the elements' position.

public class Task22 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        System.out.println("Print using index of an element: ");
        for (int i = 0 ; i < cl.size() ;i++)
            System.out.println(cl.get(i));
    }
}
