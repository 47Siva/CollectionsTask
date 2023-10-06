package ArrayList;
import java.util.*;
// Write a Java program to clone an array list to another array list

public class Task16 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        ArrayList cl2 = (ArrayList) cl.clone();
        System.out.println(cl.clone());
        System.out.println(cl2);
    }
}
