package DataStructure;

public class WordSearch {
	
public boolean exist(char[][] board, String word) {
        
	//Boolean returnvalue = false;
    for(int i =0 ; i < board.length ; i++){
        for(int j = 0 ; j < board[0].length; j++){
            
            if(backtrack(board, word, i,j,0)) {
            	return true;
            }
            		
            
        }
    }
    
    return false;
    }
    
    
    public Boolean backtrack(char[][] board, String word, int i, int j, int index ){
        
        if(index >= word.length()){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) ){
            return false;
        }
        
        
        int[] rowOffSet  = {0, 1, -1, 0 };
        int[] columnOffset = {1, 0, 0, -1};
        
        
        board[i][j] = '#';
        
        for(int d = 0 ; d < 4; d++){
            
            if(backtrack(board, word, i+rowOffSet[d], j+columnOffset[d], index+1)){
                return true;
            }
        }
        
        board[i][j]= word.charAt(index);
        
        return false;
        
    }
        
    
    public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		WordSearch w = new WordSearch();
		
		System.out.println(w.exist(board, "ABCCED"));
	}

}
