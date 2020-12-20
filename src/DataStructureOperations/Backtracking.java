package DataStructureOperations;

import java.util.ArrayList;

public class Backtracking {

	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> powerSet  = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sub = new ArrayList<Integer>();
		int[] arr = {1,2,2,3};
		
		
		
		System.out.println(backtrack(powerSet, 0, arr, sub ));
	}

	
	
	public static ArrayList<ArrayList<Integer>>  backtrack(ArrayList<ArrayList<Integer>>  result, int start, int[] nums, ArrayList<Integer> subset) {
		
		
		if(!result.contains(subset)) {
			result.add(new ArrayList<Integer>(subset));
		}
		
		//System.out.println(result.contains(subset));
		for(int i = start; i< nums.length ; i++) {
			
			
				subset.add(nums[i]);
			
			
			backtrack(result, i+1, nums, subset);
			System.out.println("Backtracking : start : "+start+" i: "+i+ " subset "+subset);
			subset.remove(subset.size() -1);
			
		}
		
		return result;
	}
	
}
