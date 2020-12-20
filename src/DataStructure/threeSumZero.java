package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class threeSumZero {
	public static void main(String[] args) {
		
		threeSumZero t = new threeSumZero();
		int[] a = {-1,0,1,2,-1,-4};
		
		System.out.println(t.threeSum(a));
		
		
	}

	 public List<List<Integer>> threeSum(int[] nums) {
		 
		    Set<List<Integer>> res = new HashSet<>();
	        Set<Integer> dups = new HashSet<>();
	        Map<Integer, Integer> seen = new HashMap<>();
	        for (int i = 0; i < nums.length; ++i)
	            if (dups.add(nums[i])) {
	                for (int j = i + 1; j < nums.length; ++j) {
	                    int complement = -nums[i] - nums[j];
	                    if (seen.containsKey(complement) && seen.get(complement) == i) {
	                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
	                        Collections.sort(triplet);
	                        res.add(triplet);
	                    }
	                    seen.put(nums[j], i);
	                }
	            }
	        return new ArrayList(res);
	        
	      /*  
	        Arrays.sort(nums);
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        
	        
	        if (nums == null || nums.length < 3){
	            return result;
	        }
	        
	        int i=0;
	        
	        
	        while(i < nums.length - 2){
	        	
	        	int j=i+1;
		        int k = nums.length -1;
		        
		        
	            while( j < k){
	                
	                if(nums[i]+nums[j]+nums[k] == 0 ){
	                	
	                    int x = nums[j];
	                    int y = nums[k];
	                    int z = nums[i];
	                   List<Integer> a =  new ArrayList<Integer>() { 
	                	   { 
	                           add(x); 
	                           add(y); 
	                           add(z); 
	                        }
	                    };
	                    
	                    result.add(a);
	                }
	                
	                if(nums[i]+nums[j]+nums[k] > 0 ){
	                    k--;
	                    
	                }else{
	                    j++;
	                }
	                
	            }
	            
	            i++;
	            
	        }
	        
	        return result; */
		 
	        
	    }
}
