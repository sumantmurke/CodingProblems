package DataStructure;

public class MissingElementSortedArray {
	
	
	   public int missingElement(int[] nums, int k) {
	        
	        int left = 0 ;
	        int right = nums.length-1;
	        int mid = (left + right)/2 ;
	        
	        while(left < right){
	            
	            if((nums[mid] - nums[left]) == (mid - left)){
	                // on right side
	                
	                left = mid +1;
	            }
	            
	            if((nums[mid] - nums[left]) > (mid - left)){
	                // minus k and on right side
	                k -= (mid-left);
	                left = mid +1;
	            }
	            
	            if((nums[mid] - nums[left]) < (mid - left)){
	                
	                // on left side
	                
	                
	            }
	            
	        }
	        
	        return 0;
	    }
}
