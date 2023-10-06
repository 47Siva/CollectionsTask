package ArrayList;
import java.util.*;
//Write a Java program to extract a portion of an array list.


public class task12 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        System.out.println(cl.subList(0,3));
    }
}
