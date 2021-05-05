package homeworknine;
/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Programme_9 {
    public static void main(String[] args) {
        //create Hashmap object called people
        HashMap<String,Integer>people=new HashMap<String,Integer>();

        //add keys and value (name,age)
        people.put("Kin",38);
        people.put("Keya",28);
        people.put("Komal",25);
        people.put("Riddhi",34);
        people.put("Vrijesh",23);
        people.put("Bhumi",30);

        //for each loop
        for(String i:people.keySet()){
            System.out.println(i + " Age: " + people.get(i));
        }

    }
}
