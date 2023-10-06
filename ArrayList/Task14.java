package ArrayList;
import java.util.*;
//Write a Java program that swaps two elements in an array list.

public class Task14 {
    public static void main(String[] args) {
        ArrayList <String> cl = new ArrayList <String>();
        cl.add("Red");
        cl.add("Green");
        cl.add("Orange");
        cl.add("white");
        cl.add("Black");
        System.out.println(cl);
      /*  cl.set(0,cl.get(3));
        System.out.println();
        cl.set(3,cl.get(0));
        System.out.println(cl);*/
        Collections.swap(cl,0,3);
        System.out.println(cl);
    }
}
