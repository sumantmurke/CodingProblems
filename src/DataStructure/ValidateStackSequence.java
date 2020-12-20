package DataStructure;

import java.util.Stack;

public class ValidateStackSequence {
	
	public static void main(String[] args) {
		
		ValidateStackSequence v = new ValidateStackSequence();
		
		int[] push = {1,0} ;
		int[] pop = {1,0} ;
		
		System.out.println(v.validateStackSequences(push, pop));
	}
	
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        
        int push = 0;
        int pop = 0;

        
        while(push < pushed.length || 
                pop < popped.length){
        	
        	if(push < pushed.length) {
        		stack.push(pushed[push]);
        	}
        	
        	while(popped.length > pop && !stack.isEmpty() && stack.peek() == popped[pop]) {
        		stack.pop();
        		pop++;
        	}
        	
        	if(push >= pushed.length) {
        		pop++;
        	}
        	
        	push++;
        }
        return stack.isEmpty();
    }

}
