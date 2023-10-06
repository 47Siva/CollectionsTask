package ArrayList;
import java.util.*;
//Write a Java program to replace the second element of an ArrayList with the specified element

public class Task21 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        System.out.println(cl);
        cl.set(1,"blue");
        System.out.println(cl);
    }
}
