package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class subarraySumK {
	
	public static void main(String[] args) {
		subarraySumK s = new subarraySumK();
		int[] a = {0,0,0,0,0,0,0,0,0};
		int b = 0;
		s.subarraySum(a, b);
	}
	
	 public int subarraySum(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        int counter = 0;
	        int sum = 0;
	        
	        // put this for subarrays of size 1 that is equal to the value of k
	        map.put(0,1);
	        for(int i =0 ; i< nums.length; i++){
	            
	            sum += nums[i];
	            
	            if(map.containsKey(sum - k)){
	                counter +=map.get(sum -k);
	            }
	            map.put(sum, map.getOrDefault(sum, 0)+1);
	        }
	        
	        return counter;
	    }

}
