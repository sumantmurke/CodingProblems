package DataStructure;

public class MaxSwap {
	
	public static void main(String[] args) {

		
		System.out.println(maximumSwap(120));
	}
	
    public static int maximumSwap(int num) {
        
        char[] chars = ("" + num).toCharArray();
        
        int left = 0 ;
        int right = chars.length -1;
        
        int maxNumber = num;
        
        while(left < right){
            
             int number = MaxSwap.swapAndReturnNumber(chars, left, right);
             if(maxNumber < number){
                 
                 maxNumber = number;
             }
             
             MaxSwap.swapAndReturnNumber(chars, left, right);
             
            if(chars[right] > chars[left]){
                right--;
            }else{
                left++;
            }
            
        }
        
        return maxNumber;
    }
    
    public static int swapAndReturnNumber(char[] array, int l, int r){
        
        char a = array[l];
        array[l] = array[r];
        array[r] = a;
        
        String str = String.valueOf(array);
        
        return Integer.parseInt(str);
    }
}
