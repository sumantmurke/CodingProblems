package DataStructure;

public class DecodeWays {

	 public int numDecodings(String s) {
	        
	        // every index in the dp array defines the size of the string so 0th index mean if the size of string is 0 
	        // the number of decode ways it will have 0.
	        int[] dp = new int[s.length() +1];
	        
	        dp[0] = 1;
	        
	        // this means if the character at 1st index is 0 then number of decode ways is 0 else there is atleaset 1 way
	        dp[1] = s.charAt(0) == '0' ? 0 : 1;
	        
	        
	        for(int i = 2 ; i <= s.length() ; i++){
	            
	            int oneDigit = Integer.valueOf(s.substring(i-1,i));
	            int twoDigit = Integer.valueOf(s.substring(i-2, i));
	            
	            if(oneDigit >= 1){
	                
	                dp[i] += dp[i-1];
	            }
	            
	            if(twoDigit >= 10 && twoDigit <= 26){
	                
	                dp[i] += dp[i-2];
	            }
	        }
	        
	        
	        
	        return dp[s.length()];
	        
	    }
	 
	 public static void main(String[] args) {
		 DecodeWays d = new DecodeWays();
		 d.numDecodings("226");
	}
}
