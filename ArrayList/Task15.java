package ArrayList;
import java.util.*;
//Write a Java program to join two array lists.

public class Task15 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        ArrayList cl2 = new ArrayList();
        cl2.add("Red");
        cl2.add("Green");
        cl2.add("Orange");
        cl2.add("Black");
        ArrayList cl3 = new ArrayList();
        cl3.add(cl);
        cl3.add(cl2);
        System.out.println(cl);
        System.out.println(cl2);
        System.out.println(cl3);
    }
}
