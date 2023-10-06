package ArrayList;
import java.util.*;
// Write a Java program to copy one array list into another.

public class Task9 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println("cl array "+cl);
        ArrayList name = new ArrayList();
        name.add("ragul");
        name.add("ragul");
        name.add("ragul");
        name.add("ragul");
        name.add("ragul");
        System.out.println("mame array"+name);
        Collections.copy(name,cl);
        System.out.println(name);


    }
}
