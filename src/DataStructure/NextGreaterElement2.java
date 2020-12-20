package DataStructure;

import java.util.Stack;

public class NextGreaterElement2 {
	
	
	public static void main(String[] args) {
		
		
        int[] a = {5,4,3,2,1} ;
		
        NextGreaterElement2 d = new NextGreaterElement2();
		d.nextGreaterElements(a);
	}
	
	
    public int[] nextGreaterElements(int[] nums) {
        
        int[] result = new int[nums.length];
        
        Stack<Pair> stack = new Stack<Pair>();
        
        
        stack.push(new Pair(nums[0], 0));
        
        
        for(int i =1 ; i< nums.length; i++){
            
            if( nums[i] > stack.peek().Value){
                
                while(!stack.isEmpty() && 
                     nums[i] > stack.peek().Value){
                    
                    Pair pair = stack.pop();  
                    
                    result[pair.Index] = nums[i];
                }
                
            }
            
            stack.push(new Pair(nums[i], i));
        }
        
        int pointer = 0;

        while(!stack.isEmpty() && 
             pointer < nums.length){

            if(nums[pointer] > stack.peek().Value){

                Pair pair1 = stack.pop();
                result[pair1.Index] = nums[pointer];
            }else {

                pointer ++;
            }
            
        }
        
        while(!stack.isEmpty()){

            Pair pair2 = stack.pop();
                result[pair2.Index] = -1;
        }
              
       return result;       
        
    }
    
    private class Pair{
        int Value ;
        int Index ;
        
        public Pair(int value, int index){
            
            this.Index = index;
            this.Value = value;
        }
    }
}
