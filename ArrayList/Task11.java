package ArrayList;
import java.util.*;
//  Write a Java program to reverse elements in an array list.
public class Task11 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
        Collections.reverse(cl);
        System.out.println("after reverse");
        System.out.println(cl);
    }
}
