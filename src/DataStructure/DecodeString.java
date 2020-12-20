package DataStructure;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DecodeString d = new DecodeString();
		System.out.println(d.decodeString("100[leetcode]"));
	}
	
    public String decodeString(String s) {
        
        Stack<Character> stack = new Stack<Character>();
              
        String result = "";

        for(int i = 0; i< s.length(); i ++){
            
            if(s.charAt(i) == ']'){
            	String tmp = "";  
            	String temp = "";
                while(stack.peek() != '[' ){
                    
                   tmp = stack.pop() + tmp;
                }

                // pop [
                stack.pop();
                String digit = "";
                
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    digit = stack.pop() + digit;
                }
                
                int a = Integer.parseInt(String.valueOf(digit));

                while(a > 0){
                    
                	temp +=tmp;
                    a--;
                }
                
                for(int j =0 ; j < temp.length() ; j++){
                    
                    stack.push(temp.charAt(j));
                    
                }
                
            }else {
            	stack.push(s.charAt(i));
            }
            
        }
        
        for(Character c : stack ) {
        	result +=c;
        }

        
        /*
        
        for(int i = 0; i<s.length(); i++) {
        	
        	if(s.charAt(i) == ']') {
        		String temp = "";
        		while(stack.peek() != '[') {
        			temp = stack.pop() + temp;
        		}
        		
        		// pop [
        		stack.pop();
        		int times = Integer.parseInt(String.valueOf(stack.pop()));
        		
        		while(times > 0){
                    
        			temp +=temp;
                	times--;
                }
        		
        		for(int j =0 ; j < temp.length() ; j++){
                    
                    stack.push(temp.charAt(j));
                    
                }
        	}else {
            	stack.push(s.charAt(i));
            }
        }
        
        for(Character c : stack ) {
        	result +=c;
        }
        */
        return result;
    }

}
