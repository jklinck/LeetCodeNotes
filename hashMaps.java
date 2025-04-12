// HashMaps
HashMap<Integer,Integer> map1 = new HashMap<>();
LinkedHashMap<Integer,Integer> map2 = new LinkedHashMap<>();

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

// this loop through the map and prints out the keys
for(Integer key: map.keySet()) {
      System.out.println(key);
}

for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
      System.out.println(entry.getKey()); // prints the key
      System.out.println(entry.getValue()); // prints the value
      System.out.printf("%d: %d\n", entry.getKey(), entry.getValue()); // prints both
}


