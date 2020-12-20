package DataStructure;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import DataStructure.DailyTemperature.DailyTemperatureObject;

public class Test{

	
	public static void main(String[] args) {
		/*
		System.out.println("Hello World");
	
		int a = 10;
		char[] chars = ("" + a).toCharArray();
		
		
		Test test = new Test();
		
		int[] a1 = {1,2,3,4,5,6,7,8,9,0} ;
		
		 test.largestNumber(a1);
		 
		 Map<Integer, Integer> asd  = new HashMap<Integer, Integer>();
		 asd.put(a1[0], a1[0]);
		 asd.get(1);
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 for (int integer : a1) {
			
		}*/
		 
		 // sorting list of list with the index 
		 
		 int[][] intervals = {{0,30},{5,10},{15,20},{2,15}};
		 Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		 
		 System.out.println(intervals);
		 
		 
		
	}

	 public String largestNumber(int[] nums) {

	        /*
	        Solution: 
	        1. Learn how to write your own comparator and send to a data structure 
	        2. convert to strings and compare strings to sort
	        */

	        String[] arrayString = new String[nums.length];
	        for(int i =0 ; i< nums.length ; i++){
	            
	            arrayString[i]= String.valueOf(nums[i]);
	        }
	        
	        Arrays.sort(arrayString, new StringArrayCompare());
	        

	        StringBuilder str = new StringBuilder(); 
	        for(int i = arrayString.length - 1; i >= 0 ; i--){
	            str.append(arrayString[i]);
	        }
	        
	        //Math.abs(a);
	        Deque<Integer> deque = new ArrayDeque<Integer>();
	        deque.size();
	        


	        if(arrayString[arrayString.length - 1].equalsIgnoreCase("0")){
	            
	            return "0";
	        }
	        
	        return str.toString();
	    }
	
	
	 private class StringArrayCompare implements Comparator<String> {

			
			@Override
			public int compare(String a, String b) {
				String a1 = a + b;
				String a2 = b + a;
							
				return a1.compareTo(a2);
			}
		 
	 }
	
}
