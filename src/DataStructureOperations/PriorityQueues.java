package DataStructureOperations;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		
		// priority queue with a custom comparator
		
		
		int[] arr = {2,5,6,1,78,345,22,90};
		
		PriorityQueue<Integer> pq = new  PriorityQueue<Integer>(new Comparator<Integer>(){
	        
	        @Override
	        public int compare(Integer n , Integer n2){
	            if(n > n2){
	                return 1;
	            }else if(n == n2){
	                return 0;
	            }else {
	                return -1;
	            }
	        }
	        });
		
		
		
		for (int p = 0; p < arr.length; p++) {
			
			pq.add(arr[p]);
			
		}
		
		
		System.out.println(pq.toString());
		
	}

}
