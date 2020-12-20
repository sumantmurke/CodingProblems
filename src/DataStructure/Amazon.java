package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class Amazon {

	
 public static void main(String[] args) {
	 /*
	 Scanner scanner = new Scanner(System.in);
	 String myString = scanner.next();
	  // scanner.nextLine();
	 int myInt = scanner.nextInt();
	 scanner.close();

	 System.out.println("myString is: " + myString);
	 System.out.println("myInt is: " + myInt);
	 */
	 
	 Amazon a = new Amazon();
	 int[] a1 = {74303, 20452, 66120,44483,5370,68585} ;
	 
	 
	 
	 System.out.println(a.minDifficulty(a1, 5));
}
 
 
 public int minDifficulty(int[] A, int D) {
	 
	 int n = A.length, inf = Integer.MAX_VALUE, maxd;
	 
     if (n < D) return -1;
     
     int[] dp = new int[n + 1];
     
     //Arrays.fill(dp, Integer.MAX_VALUE);
     for (int i = n - 1; i >= 0; --i)
         dp[i] = Math.max(dp[i + 1], A[i]);
     
     dp[n] = 0;
     
     for (int d = 1; d <= D; d++) {
         for (int i = 0; i <= n - d; i++) {
             maxd = 0; 
             dp[i] = inf;
             
             for (int j = i; j <= n - d; j++) {
                 maxd = Math.max(maxd, A[j]);
                 long test = maxd + dp[j + 1];
                 
                 dp[i] = Math.min(dp[i], maxd + dp[j + 1]);
             }
         }
     }
     return dp[0];
	 
	 
	 
 }
}
