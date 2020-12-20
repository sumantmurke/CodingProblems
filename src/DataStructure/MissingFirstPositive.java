package DataStructure;

public class MissingFirstPositive {
	
	public static void main(String[] args) {
		
		
		MissingFirstPositive m = new MissingFirstPositive();
		int[] arr = {1,2,0};
		System.out.println(m.firstMissingPositive(arr));
	}

public int firstMissingPositive(int[] nums) {
        
        
        boolean isOnePresent = false;
        
        for(int i = 0 ; i< nums.length; i++){
            
            if(nums[i] == 1){
                isOnePresent = true;
            }
            
            if(nums[i] > nums.length +1 || nums[i] <= 0){
                
                nums[i] = 1 ;
                
            }
            
        }
        
        
        if(!isOnePresent){
            return 1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (num > nums.length) {
                continue;
            }
            num--; // -1 for zero index based array (so the number 1 will be at pos 0)
            if (nums[num] > 0) { // prevents double negative operations
                nums[num] = -1 * nums[num];
            }
        }
        
        
        for(int i=0; i < nums.length ; i++){
            
            if(nums[i] > 0){
                return i+1;
            }
        }
        
        
        return nums.length+1;
    }
}
