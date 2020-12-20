package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        
        backtrack(result,candidates, target, 0, temp );
        
        return result;
    }
	
public void backtrack(List<List<Integer>> result, int[] candidates, int target, int tempTarget, List<Integer> temp ){
        
        if(tempTarget == target){
            Collections.sort(temp);
            if(!result.contains(temp)){
                result.add(new ArrayList<Integer>(temp));
            }
            return ;
        }
        
        
        for(int i = 0 ; i< candidates.length ; i++){
            
        	if(tempTarget +candidates[i] > target) continue ;
            temp.add(candidates[i]);
            tempTarget += candidates[i];
            backtrack(result, candidates, target, tempTarget, temp);
            temp.remove(temp.size()-1);
            tempTarget -= candidates[i];
        }
        
        
    }


public static void main(String[] args) {
	CombinationSum c = new CombinationSum();
	int[] a = {2,3,5};
	c.combinationSum(a, 8);
}

}
