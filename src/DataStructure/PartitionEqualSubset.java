package DataStructure;

import java.util.Arrays;

public class PartitionEqualSubset {
	
	public static void main(String[] args) {
		
		PartitionEqualSubset p = new PartitionEqualSubset();
		
		int[] arr = {2,2,1,1};
		System.out.println(p.canPartition(arr));
		
	}
	
	
    public boolean canPartition(int[] nums) {
        
        Arrays.sort(nums);
        
        int leftSum =0;
        int rightSum = 0;
        
        int left =0 ;
        int right = nums.length -1;
        
        
        if(nums.length == 1) {
        	return false;
        }
        
        if(nums.length == 2){
           if(nums[left] == nums[right]){
               return true;
           }
        }
        
        leftSum += nums[left];
        rightSum += nums[right];
        
        while(left <= right -1){          
           
            if(rightSum == leftSum && left == right -1){
                return true;
            }else if(rightSum > leftSum){
            	
                left ++;
                leftSum += nums[left];
            }else{
            	
                right --;
                rightSum += nums[right];
            }
        
        }
        
        return false;
    }
}

