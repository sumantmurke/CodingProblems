package DataStructure;

import java.util.Stack;

public class ValidParanthesisWithAstrix {
	
	public static void main(String[] args) {
		
		ValidParanthesisWithAstrix v = new ValidParanthesisWithAstrix();
		System.out.println(v.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*"));
		
	}
	
	
    public boolean checkValidString(String s) {
        if(s.length() == 0) {
        	return true;
        }
        
        if(s.length() == 1) {
        	if(s.charAt(0) == '*') {
        		return true;
        	}
        	
        	return false;
        }
       
        int left = 0 ;
        int right = 0;
        for(int i =0 ; i< s.length() ; i ++) {
        	
        	if(s.charAt(i) == '(') {
        		
        		left++;
        	}else {
        		left--;
        	}
        	
            
        
        if(left < 0) {
        	left = 0;
        }
        }
        

        
        
        for(int i = s.length()-1 ; i >= 0 ; i --) {
        	
        	if(s.charAt(i) == ')') {
        		
        		right++;
        	}else {
        		right--;
        	}
        	
                    
        if(right < 0) {
        	right = 0;
        }
        
        }
        

        
        return left == 0 && right == 0;
    }
}
