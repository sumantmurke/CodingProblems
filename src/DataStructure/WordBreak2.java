package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak2 {

	
	public List<String> wordBreak(String s, List<String> wordDict) {

        
        return  backtrack(s,wordDict, new HashMap<String, List<String>>());
    }
    
    
    public List<String> backtrack(String s, List<String> wordDict,  Map<String , List<String>> memo){
         
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        
        List<String> result = new ArrayList<>();
        
        if(s.length() == 0 ){
            result.add("");
            return result;
        }
        
        for(String word : wordDict){
            
            if(s.startsWith(word)){
                
                List<String> tempList = backtrack(s.substring(word.length()), wordDict, memo);
                
                for(String stringWord : tempList){
                    
                    String space = stringWord.isEmpty() ?  "" : " ";
                    result.add(word + space +stringWord );
                }
            }  
        }
        
        memo.put(s,result);
        return result;
    }
    
    public static void main(String[] args) {
		
    	WordBreak2 w = new WordBreak2();
    	List<String> list = new ArrayList<String>();
    	
    	list.add("apple");
    	list.add("pen");
    	list.add("applepen");
    	list.add("pine");
    	list.add("pineapple");
    	
    	List<String> result = w.wordBreak("pineapplepenapple", list);
    	
    	
    	
    	
	}
	
}
