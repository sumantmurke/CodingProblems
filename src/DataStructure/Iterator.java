package DataStructure;

public class Iterator {
	
	
	public static final int[][] array = { {1, 2, 3, 4},{}, {5, 6, 7},{},{}};
	
	static int OuterIndex = 0;
	static int innerIndex = 0;
	
	public static void main(String[] args) {
		
		
	 System.out.println(Iterator.HasNext());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
	 System.out.println(Iterator.Next());
		
	}
	
	public static int Next() {

		
		if(array.length == 0) {
			
			return -1;
		}
		
		if(HasNext()) {
			
			if(array.length < OuterIndex){
				return -1;
			}
			
			
			if(array[OuterIndex].length-1 == innerIndex && 
				array.length > OuterIndex) {
				
				innerIndex = 0;
				OuterIndex ++;
				
				if(array.length <= OuterIndex) {
					return -1;
				}
				
			}else {
				
				innerIndex ++;
			}
			
			
			if(array[OuterIndex].length == 0) {
				
				while(array.length > OuterIndex && array[OuterIndex].length == 0) {
					innerIndex = 0;
					OuterIndex ++;
				}
			}
			
			
			
			return array[OuterIndex][innerIndex];
		}
		
		return -1;
	}
	
	public static boolean HasNext() {
		
		if(array.length == 0 || array.length <= OuterIndex) {
			
			return false;
		}
		
		if(array[OuterIndex].length > innerIndex || 
			array.length > OuterIndex && array[OuterIndex].length > 0)
		{
			return true ;
		}
		
		
		return false;
	}

}
