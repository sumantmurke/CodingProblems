package DataStructure;

import java.util.HashMap;

public class MinWindow {
	 public String minWindow(String s, String t) {
	     

			        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			        
			        for(int i =0 ; i< t.length(); i++){
			            
			            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
			            
			        }
			        
			        int left = 0;
			        int minLeft = 0;
			        int minLen = s.length()+1;
			        int count = 0;
			        for(int right = 0; right < s.length(); right++){
			            if(map.containsKey(s.charAt(right))){
			                map.put(s.charAt(right),map.get(s.charAt(right))-1);
			                if(map.get(s.charAt(right)) >= 0){
			                    count ++;
			                }
			                while(count == t.length()){
			                    if(right-left+1 < minLen){
			                        minLeft = left;
			                        minLen = right-left+1;
			                    }
			                    if(map.containsKey(s.charAt(left))){
			                        map.put(s.charAt(left),map.get(s.charAt(left))+1);
			                        if(map.get(s.charAt(left)) > 0){
			                            count --;
			                        }
			                    }
			                    left ++ ;
			                }
			            }
			        }
			        if(minLen>s.length())  
			        {  
			            return "";  
			        }  
			        
			        return s.substring(minLeft,minLeft+minLen);
			        
			    }

	 
	 
	 public static void main(String[] args) {
		 MinWindow m = new MinWindow();
		 m.minWindow("ADOBECODEBANC", "ABC");
	}
}
