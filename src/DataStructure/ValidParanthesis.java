package DataStructure;

import java.util.Stack;

public class ValidParanthesis {

public Boolean ValidParanthesis(String paranthesis){
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i =0 ; i< paranthesis.length() ; i++){
            
            if(paranthesis.charAt(i) == '('){
                
                stack.push(paranthesis.charAt(i));
            }else if(!stack.isEmpty()){
                stack.pop();
            }else{
                return false;
            }
 
       }
                     
         return stack.isEmpty();            
    }
}

