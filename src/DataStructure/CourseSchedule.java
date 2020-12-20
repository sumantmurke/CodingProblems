package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
	
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
	        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
	        
	        
	        for(int i = 0 ; i< prerequisites.length ; i++){
	            
	             counts.put(prerequisites[i][0], 0);
	             counts.put(prerequisites[i][1], 0);
	            
	        }
	        
	        for(int i = 0 ; i< prerequisites.length ; i++){
	            
	            if(!map.containsKey(prerequisites[i][0])){
	                
	            	ArrayList<Integer> adlis = new ArrayList<Integer>();
	            	adlis.add(prerequisites[i][0]);
	                map.put(prerequisites[i][1], adlis);
	                counts.put(prerequisites[i][0], counts.get(prerequisites[i][0])+1);
	                
	            }else{
	                
	                ArrayList<Integer> list = map.get(prerequisites[i][1]);
	                list.add(prerequisites[i][0]);
	                map.put(prerequisites[i][1], list);
	                counts.put(prerequisites[i][0], counts.get(prerequisites[i][0])+1);
	            }
	    
	        }
	        
	        
	        Queue<Integer> q = new LinkedList<Integer>();
	        HashSet<Integer> visited = new HashSet<Integer>();
	        for(int count : counts.keySet()){
	            
	            if(counts.get(count) == 0){
	                
	                q.add(count);
	            }
	            
	        }
	        
	        int counter = 0;
	        while(!q.isEmpty()){
	            
	            int vertex = q.poll();
	            if(counts.get(vertex)-1 == 0 ){
	                counter++;
	                if(counter == numCourses){
	                    return true;
	                }
	            }
	            
	            for(int edge : map.get(vertex)){
	                
	                if(!visited.contains(edge)){
	                    q.add(edge);
	                }
	            }
	            
	        }
	        
	        
	        return false;
	    }
	 
	 public static void main(String[] args) {
		
		 CourseSchedule c = new CourseSchedule();
		 int[][] a = {{1,0}};
		 c.canFinish(2, a);
	}

}
