package homeworknine;
/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */

import java.util.ArrayList;

public class Programme_7 {
    //create array list string type
    public static void main(String[] args) {
        ArrayList<String>tubename=new ArrayList<String>();
        tubename.add("Central");
        tubename.add("Jubilee");
        tubename.add("Northern");
        tubename.add("Distract");
        tubename.add("Hammersmith & city");
        tubename.add("Victoria");
        tubename.add("Piccadilly");

        //print tube names
        System.out.println("Original tube list:" + tubename);

        System.out.println("Checking the above arraylist is empty or not: "+ tubename.isEmpty());
        tubename.removeAll(tubename);// removal method for array

        System.out.println("Array lsit after removell: "+ tubename);
        //string method to heck its empty or not
        System.out.println("Checking the above array list empty or not:  "+ tubename.isEmpty());


    }
}
