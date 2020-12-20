package DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContinousSubarrayAbsoluteDiff {
	
	public static void main(String[] args) {
		
		LongestContinousSubarrayAbsoluteDiff l = new LongestContinousSubarrayAbsoluteDiff();
		int[] arr = {4,2,2,2,4,4,2,2};
		
		System.out.println(l.longestSubarray(arr, 0));;
		
	}

	 public int longestSubarray(int[] nums, int limit) {
	        
	        if(nums == null || nums.length == 1){
	            return 1;
	        }
	        
	        
	        int min = nums[0];
	        int max = nums[0];
	        int result=0;
	        Deque<Integer> deque = new ArrayDeque<Integer>();
	        
	        
	        
	        
	        int i =0;
	        while(i < nums.length){
	            
	           if(nums[i] < min){
	               min = nums[i];
	           }
	            
	            if(nums[i] > max){
	               max = nums[i];
	           } 
	            
	           if(max-min <= limit){
	               deque.add(nums[i]);
	               i++;
	           }else{
	               while(!deque.isEmpty() && max - min > limit){
	            	   
	                   int var = deque.removeFirst();
	                  
	                   
	                   if(!deque.isEmpty() && var <= min){
	    	               min = deque.peek();
	    	           }
	    	            
	    	            if(!deque.isEmpty() && var >= max){
	    	               max = deque.peek();
	    	           } 

	               }
	               
	               deque.addLast(nums[i]);
	               i++;
	           }
	            
	            if(deque.size() > result ){
	                
	                result = deque.size();
	            }
	            
	           }
	            return result;
	        }
}
