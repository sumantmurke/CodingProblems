package DataStructureOperations;

import java.util.ArrayList;

public class permutiation {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> powerSet  = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> sub = new ArrayList<Integer>();
		int[] arr = {1,3,1};
		
		
		
		System.out.println(backtrack(powerSet, arr, sub ));
	}

	
public static ArrayList<ArrayList<Integer>>  backtrack(ArrayList<ArrayList<Integer>>  result, int[] nums, ArrayList<Integer> subset) {
		
		
		if(subset.size() == nums.length) {
			result.add(new ArrayList<Integer>(subset));
		}else {
			//System.out.println(result.contains(subset));
			for(int i = 0; i< nums.length ; i++) {
				
				//if(subset.contains(nums[i])) continue ;
				subset.add(nums[i]);
				backtrack(result, nums, subset);
				//System.out.println("Backtracking : start : "+start+" i: "+i+ " subset "+subset);
				subset.remove(subset.size() -1);
				
			}
			
			
		}
		
		
		return result;
	}
	
}
