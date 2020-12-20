package DataStructure;

import java.util.TreeMap;

public class MyCalendar2 {

	TreeMap<Integer, Integer> book = new TreeMap<Integer,Integer>();
    TreeMap<Integer, Integer> doubledook = new TreeMap<Integer,Integer>();
    
    public static void main(String[] args) {
		
    	//[24,40],[43,50],[27,43],[5,21],[30,40],[14,29],[3,19],[3,14],[25,39],[6,19]]
    	MyCalendar2 m = new MyCalendar2();
    	m.book(24,40);
    	m.book(43,50);
    	m.book(27,43);
    	m.book(5,21);
    	m.book(30,40);
    	m.book(14,29);
    	m.book(3,19);
    	m.book(3,14);
    	m.book(25,39);
    	m.book(6,19);
	}
    
    public boolean book(int start, int end) {
        
        java.util.Map.Entry<Integer, Integer> floor1 = book.floorEntry(start);
        java.util.Map.Entry<Integer, Integer> ceiling1 = book.ceilingEntry(start);
        
        java.util.Map.Entry<Integer, Integer> floor2 = doubledook.floorEntry(start);
        java.util.Map.Entry<Integer, Integer> ceiling2 = doubledook.ceilingEntry(start);
        
        boolean f = false;
        boolean c = false;
        
        if(floor1 != null && start <= floor1.getValue()){
            
            if(floor2 != null && start <= floor2.getValue()){
                
                return false;
            }else{
                f = true;
            }
            

            
        }
        
        if(ceiling1 != null && end >= ceiling1.getKey()){
            
            if(ceiling2 != null && end >= ceiling2.getKey()){
                
                return false;
            }else{
                c = true;
            }
            
        }
        
        if(f && c){
            doubledook.put(start, end);
            return true;
        }
        
        book.put(start, end);
        return true;
    }
}
