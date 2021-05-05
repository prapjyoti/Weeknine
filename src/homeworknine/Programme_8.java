package homeworknine;
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else
 */

import java.util.HashSet;

public class Programme_8 {
    public static void main(String[] args) {
        //create a Hashset object called num
        HashSet<Integer> num = new HashSet<Integer>();
        //add the value the set
        num.add(4);
        num.add(7);
        num.add(8);
        //show which number 1and 10 are in set
        for (int i = 1; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i  +  " was found in the set");
            } else {
                System.out.println(i  +  " was not found in the set");
            }
        }
    }
}