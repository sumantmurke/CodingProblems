package DataStructure;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString767 {
	
	Map<Character,Integer> map;
	
	
	public static void main(String[] args) {
		
		ReorganizeString767 r = new ReorganizeString767();
		System.out.println(r.reorganizeString("aaab"));
	}
	
public String reorganizeString(String S) {
        
        map = new HashMap<Character,Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< S.length(); i++) {
        	
        	map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0)+1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<Character>(new AlphabetComparator());
        
        for(Character key : map.keySet()) {
        	
        	if(map.get(key) > S.length()/2 + 1) {
        		return "";
        	}
        	pq.add(key);
        	
        }

               
        
        
        while(pq.size() > 1) {
        	Character firstElement = pq.remove();
        	Character SecondElement = pq.remove();
        	
        	sb.append(firstElement);
        	sb.append(SecondElement);
        	
        	map.put(firstElement, map.get(firstElement)-1);
        	map.put(SecondElement, map.get(SecondElement)-1);
        	
        	if(map.get(firstElement) > 0) {
        		pq.add(firstElement);
        	}
        	
        	if(map.get(SecondElement) > 0){
        		pq.add(SecondElement);
        	}
  	
        }
        
        if(!pq.isEmpty()) {
        	
        	Character temp = pq.remove();
        	
        	if(map.get(temp) > 1) {
        		return "";
        	}
        	
        	sb.append(temp);
        	
        }
        
        return sb.toString();
    }


private class AlphabetComparator implements Comparator<Character>{

	@Override
	public int compare(Character arg0, Character arg1) {
		// TODO Auto-generated method stub

		return map.get(arg1) == map.get(arg0) ? arg1 - arg0 : map.get(arg1) - map.get(arg0);
	}
	
	
}

}
