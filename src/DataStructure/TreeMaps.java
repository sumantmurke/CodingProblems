package DataStructure;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> numMap = new TreeMap<Integer, Integer>(); 

    // Insert the values 
    numMap.put(1, 10); 
    numMap.put(15, 30); 
    numMap.put(32, 44); 
    numMap.put(45, 56); 
    numMap.put(59, 65); 
    
    
    // Print the Values of TreeMap 
    System.out.println("TreeMap: " + numMap.toString()); 
    
    System.out.println("Tree floor entry "+numMap.floorEntry(56));
    System.out.println("Tree celing entry "+numMap.ceilingEntry(59));
    
    
    Entry<Integer, Integer> floor = numMap.floorEntry(56);
    
    floor.getKey();
	}
}
