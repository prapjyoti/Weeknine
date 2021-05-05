package homeworknine;
/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;


public class Programme_5 {
    public static void main(String[] args) {
        //creating a array list
        ArrayList<String> namelist=new ArrayList<String>(Arrays.asList("John","Patric","Denish","Paul","James"));
        //creating an object for Arraylist using Iterator method
        ListIterator<String>listItr=namelist.listIterator();
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }

    }
}
