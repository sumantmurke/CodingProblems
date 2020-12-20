package DataStructure;

public class Rod_Cut {

	public int maximumCut(int n , int[] price) {
		
		int[] result = new int[n+1];
		
		result[0] = 0;
		result[1] = price[0];
		
		for(int i = 2 ; i<= n ; i++) {
			result[i] = price[i-1];
			
			for(int j = 1 ; j < i; j++) {
				
				result[i] = Math.max(result[i], price[j-1]+price[i-j-1]);
				
			}
			
			
		}
		
		
		return result[n];
	}
	
	
	public static void main(String[] args) {
		Rod_Cut r = new Rod_Cut();
		
		int[] p = {1,5,8,9,10,17,17,20,24,30};
		
		int a = r.maximumCut(10, p);
		
		System.out.println(a);
		
	}
}
