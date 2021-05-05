package homeworknine;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class Programme_4 {
    public static void main(String[] args) {
        List<String>colours=new ArrayList<>();
        colours.add("Orange");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Black");
        colours.add("Violet");
        colours.add("Pink");
        colours.add("Purple");
     //Iterating Arraylist: using the advanced for loop
        for(String values:colours)
            System.out.println(values);

    }

}
