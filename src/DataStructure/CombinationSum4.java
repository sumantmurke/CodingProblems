package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum4 {
	   int result = 0;
	    public int combinationSum4(int[] nums, int target) {
	        List<Integer> temp = new ArrayList<Integer>();
	        
	        backtrack(nums,target,0,temp);
	        return result;
	    }
	    
	    
	    
	    public void backtrack(int[] nums, int target, int tempTarget, List<Integer> temp){
	        
	        if(tempTarget == target){
	            result +=1;
	            return;
	        }
	        
	        
	        for(int i =0 ; i < nums.length; i++){
	            
	            if(tempTarget > target) continue;
	            
	            temp.add(nums[i]);
	            tempTarget += nums[i];
	            backtrack(nums,target,tempTarget,temp);
	            temp.remove(temp.size()-1);
	            tempTarget -= nums[i];
	            
	        }
	        

	    }
	    
	    public static void main(String[] args) {
	    	CombinationSum4 c = new CombinationSum4();
	    	int[] a = {1,2,3};
	    	System.out.println(c.combinationSum4(a, 32));
	    	
		}
}
