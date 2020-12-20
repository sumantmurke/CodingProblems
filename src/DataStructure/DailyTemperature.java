package DataStructure;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {
		
		int[] a = {73, 74, 75, 71, 69, 72, 76, 73} ;
		
		DailyTemperature d = new DailyTemperature();
		d.dailyTemperatures(a);
		
	}	
	
public int[] dailyTemperatures(int[] T) {
        
        /*
            Solution
          This problem is also like finding next big number
        */
        
        Stack<DailyTemperatureObject> stack = new Stack<DailyTemperatureObject>();
        
        int[] result = new int[T.length];
        
        
        stack.push(new DailyTemperatureObject(T[0], 0));
        
        for(int i = 1; i<T.length ; i++){
  
        	
            if(T[i] > stack.peek().Temp){
               
                while(!stack.empty() && T[i] > stack.peek().Temp){

                	DailyTemperatureObject dailyTemp = stack.pop();
                    result[dailyTemp.Index] = i - dailyTemp.Index;

                }
     
            }
            
            stack.push(new DailyTemperatureObject(T[i], i));
        }
        
        return result;
        
    }
    
	
public class DailyTemperatureObject{
    
    int Temp;
    int Index;

	public DailyTemperatureObject(int t,int i){
    Temp = t;
    Index = i;
}

}
}
