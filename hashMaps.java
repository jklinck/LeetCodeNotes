import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

class HashMaps{

      public static void main(String[] args) {
            
            // creates a hashmap
            Map<Integer,Integer> map = new HashMap<>();

            // creates an ordered hashmap since hahsmaps are not 
            // necessarily ordered
            Map<Integer,Integer> map2 = new LinkedHashMap<>();

            // creates a key of 5 with a value of 17
            map.put(5,17);
            
            // creates a key of 6 with a value of 45
            map.put(6,45);

            // this will check if the map contains a key with the value of 5, it is NOT 
            // checking the value held in that key
            map.containsKey(5); 

            // this will return the value held where 5 is the key
            map.get(5);

            // this will print the entire map in this form {5=17, 6=45}
            System.out.println(map);

            // this loops through the map and prints out the keys
            for(Integer key: map.keySet()) {
                  System.out.println(key);
            }

            for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
                  System.out.println(entry.getKey()); // prints the key
                  System.out.println(entry.getValue()); // prints the value
                  System.out.printf("%d: %d\n", entry.getKey(), entry.getValue()); // prints both
            }

            Map<Character,Integer> firstMap = new HashMap<>();
            String first = "aaabbb";
           
            for(int i = 0; i < first.length(); i++) {
                  char currChar = first.charAt(i);
                  /*
                  the getOrDefault() method below either sets the currChar value to 
                  0 if it doesn't have a value, or it adds 1 the value of currChar
                  */
                  firstMap.put(currChar, firstMap.getOrDefault(currChar, 0) + 1);
            }

            // returns a boolean that checks if the maps are equal
            boolean check = map.equals(firstMap);

      }
}


