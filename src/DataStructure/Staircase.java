package DataStructure;

public class Staircase {

	public static void main(String[] args) {
		Staircase s = new Staircase();
		System.out.println(s.helper(4));
		
	}
	// do also using memoization with DP
	
	public int helper(int n) {
		
		if(n == 0) return 1;
				
				
		return n >= 2 ? helper(n-2) + helper(n-1) : helper(n-1);
			
	}
}
