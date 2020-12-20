package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
	
	
	public static void main(String[] args) {
		
		int[] num1 = {};
		int[] num2 = {};
		
		NextGreaterElement a = new NextGreaterElement();
		
		System.out.println(a.nextGreaterElement(num1, num2).toString());
		
		
		
	}

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        if(nums2.length == 0){
            return result;
        } 
        
        
        map.put(nums2[nums2.length-1], -1);
        stack.push(nums2[0]);

        for(int i = 1; i< nums2.length; i++){
            
            if(nums2[i] > stack.peek()){
                
                while(!stack.isEmpty() && 
                     nums2[i] > stack.peek()){
                
                map.put(stack.pop(), nums2[i]);
                
            }
            
            
        }
            stack.push(nums2[i]);
        }
            
            
            while(!stack.isEmpty()){
            	
            	map.put(stack.pop(), -1);
            }
            
            
            for(int i1 = 0 ; i1 < nums1.length ; i1 ++ ){
                
                result[i1] = map.get(nums1[i1]);
            }

        
		return result;
    }
    

    
}
