package DataStructure;

import java.util.Arrays;

public class quadraplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, 4, 0, 9, 5, 1, 3};
	      System.out.println(quadraplet.findArrayQuadruplet(arr, 20));

	}
	
	static int[] findArrayQuadruplet(int[] arr, int s) {
	    // your code goes here
	    int[] result = new int[4];
	    if(arr == null || arr.length < 4){
	      return result;
	    }
	    Arrays.sort(arr);
	    //System.out.println(" hello ");    
	    for(int i =0; i < arr.length-3 ; i++ ){
	      //System.out.println("i "+i);
	        for(int j = i +1 ; j < arr.length -2 ; j++){
	            int k = j+1;
	            int l = arr.length -1;
	             while(k < l){
	               
	               //System.out.println("k "+k+" l "+l);
	               
	               if(arr[i]+arr[j]+arr[k]+arr[l] == s){
	                 
	                    //System.out.println("i "+i + "k "+k+" j "+j+" l "+l);
	                    result[0] = arr[i];
	                    result[1] = arr[j];
	                    result[2] = arr[k];
	                    result[3] = arr[l];
	                    
	                    return result;
	                 
	               }else if(arr[i]+arr[j]+arr[k]+arr[l] > s){
	                    l--; 
	               }else{
	                 
	                 k++;
	                 
	               }
	               
	             }
	            
	          
	          
	        }
	    }
	    
	    return result;
	    
	  }

}
