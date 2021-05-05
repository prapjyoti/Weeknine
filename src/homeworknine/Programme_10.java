package homeworknine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */
public class Programme_10 {
    public static void main(String[] args) {
        //map and Hashmap method //create Hasmap object called line
        Map<String ,String>line;
        line =new HashMap<>();
        //key and values (station and tube lines)

        line.put("Angle", "Northern\n");
        line.put("Euston", "Northern,Victoria\n");
        line.put("Green Park", "Piccadilly,Victoria\n");
        line.put("Holborn", "Central,Piccadilly\n");
        line.put("Hyde Park Corner", "Piccadilly\n");
        line.put("Moorgate", "Metropolitan,Northern,Circle,Hammersmith & City\n");
        line.put("Paddington", "District,Circle,Bakerloo\n");
        line.put("Piccadilly Circus", "Bakerloo,Piccadilly\n");
        line.put("Victoria", "District,Circle,Victoria\n");
        line.put("Waterloo", "Waterloo & City,Bakerloo,Northen,Jubilee\n");
        line.put("Westminster", "District,Circle,Jubilee\n");

        System.out.println("Please enter Zone 1 station name following list: ");
        System.out.println("Angle,Euston,Green Park,Holborn,Hyde Park Corner");
        System.out.println("Moorgate,Paddington,Piccadilly Circus,Victoria");
        System.out.println("Waterloo,Westminster");

        // scanner class
        Scanner station=new Scanner(System.in);
        String sc= station.nextLine();//scanner class obj

        //to access a vlaue in Hasmap,use the get method and refer to its key
        System.out.println("Following lines passing through this station");
        System.out.println(line.get(sc));


    }
}
