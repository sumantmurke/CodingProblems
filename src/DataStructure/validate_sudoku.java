package DataStructure;

import java.util.HashSet;

public class validate_sudoku {
	
	 public boolean isValidSudoku(char[][] board) {
	        // the trick here is finding the box limitation 
	        // box = row/3 * 3 + col/3
	        
	        
	        HashSet<Integer>[] row = new HashSet[9];
	        HashSet<Integer>[] col = new HashSet[9];
	        HashSet<Integer>[] box = new HashSet[9];
	        
	        for (int i = 0; i < 9; i++) {
	            row[i] = new HashSet<Integer>();
	            col[i] = new HashSet<Integer>();
	            box[i] = new HashSet<Integer>();
	        }
	        
	        for(int i = 0 ; i< board.length;i++){
	            for(int j = 0 ; j < board[0].length; j++){
	                
	                char num = board[i][j];
	                int n = (int)num;
	                int box_index = (i/3)*3 + j/3;
	                
	                if(board[i][j] != '.'){
	                    
	                   if(!row[i].add(n) || !col[j].add(n) || !box[box_index].add(n)) {
	                       return false;
	                   }
	                    
	                }
	                
	                
	                
	            }
	        }
	        
	        return true;
	    }

}
