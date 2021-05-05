package homeworknine;
/*
Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;
import java.util.Collections;

public class Programme_3 {
    public static void main(String[] args) {
     //Function reserves the element of the array
        Integer[]number={10,13,15,17,19,25};
        System.out.println("Original value before reserves"+ Arrays.asList(number));//print array value before reserves
        Collections.reverse(Arrays.asList(number));//using predefine Collection reserves method
        System.out.println("Reserves Array: "+ Arrays.asList(number));//print array value after reserves

    }
}
