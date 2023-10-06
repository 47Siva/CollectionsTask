package ArrayList;
import java.util.*;
//Write a Java program to compare two array lists.

public class Task13 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        ArrayList <String> cl2 = new ArrayList<String>();
        cl2.add("Red");
        cl2.add("Green");
        cl2.add("Orange");
        cl2.add("Black");
        System.out.println(cl);
        System.out.println(cl2);
        ArrayList cl3 = new ArrayList<>();
        //System.out.println(cl.equals(cl2));
        for(String s : cl ) {
            if (cl3.add(cl2.contains(s)));
        }
        System.out.println(cl3);
    }
}
