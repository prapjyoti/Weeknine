package homeworknine;
/*
Write a Java program to retrieve an element (at a specified index) from a given
array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Programme_6 {

    public static void main(String[] args) {
        //create array list
        List<String>list=new ArrayList<String>();
        list.add("India");
        list.add("Berlin");
        list.add("Barma");
        list.add("Bhutan");
        list.add("Nepal");
        list.add("Paris");
        list.add("London");
        //print the list
        System.out.println(list);
        // Retrive the first and third element
        String word = list.get(0);
        System.out.println(word);
        word = list.get(5);
        System.out.println(word);

    }
}

