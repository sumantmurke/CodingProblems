package DataStructure;



public class Recursion {
	
	public static void main(String[] args) {
		
		Recursion r = new Recursion();
		
		
		System.out.println(r.climbStairs(5));
		
		
	}
	
	/*
	public static int[] PrintArray(int[] arr, int index) {
		
		if(arr.length < 2) {
			System.out.println(a[0]);
		}
		
		return ArrayUtils.remove(arr, index +1);
	} */
	
	public int climbStairs(int n) {
        if (n <= 0) return 1;
        return n-2 >= 0 ? climbStairs(n-2) + climbStairs(n-1) : climbStairs(n-1);
    }

}
