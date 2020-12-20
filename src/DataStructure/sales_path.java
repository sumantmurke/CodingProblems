package DataStructure;

import java.util.Stack;

public class sales_path {

		 
		  static class Node {
		      
		    int cost;
		    Node[] children;
		    Node parent;

		    Node(int cost) {
		      this.cost = cost;
		      children = null;
		      parent = null;
		    }
		  }

		  static class SalesPath {
		    

		    
		    

		    public int getCheapestCost(Node rootNode) {
		      
		    	int minPath = 0;
		      //helper(rootNode, rootNode.cost);
		    	
		    	//int numberOfChildren = .length;
		    	
		    	if(rootNode.children == null) {
		    		return rootNode.cost;
		    	}else {
		    		
		    		minPath = Integer.MAX_VALUE;
		    		
		    		for(int i = 0 ; i< rootNode.children.length ; i++) {
		    			
		    			int tempCost = getCheapestCost(rootNode.children[i]);
		    			
		    			if(tempCost < minPath ) {
		    				minPath = tempCost;
		    			}
		    			
		    		}
		    		
		    	}
		      
		    	
		      
		   
		      return minPath + rootNode.cost; 
		    }
		    
		    /*
		    public int helper(Node node, int pathSum){
		      
		      if(node.children == null){
		        
		        if(pathSum < minPath){
		          minPath = pathSum;          
		        }
		        
		        return pathSum - node.cost;
		      }
		      
		      for(int i = 0 ; i < node.children.length ; i++){
		          
		         pathSum =  helper(node.children[i], pathSum + node.children[i].cost);
		          
		      }
		      return pathSum;
		    }
		    
		  }
*/
		  
		  /*********************************************
		   * Driver program to test above method     *
		   *********************************************/

		  public static void main(String[] args) {
		    
		    Node root = new Node(0);
		    Node node6 = new Node(6);
		    Node node3 = new Node(3);
		    Node node5 = new Node(5);
		    Node node4 = new Node(4);
		    Node node2 = new Node(2);
		    Node node30 = new Node(0);
		    Node node1 = new Node(1);
		    Node node65 = new Node(5);
		    Node node3010 = new Node(10);
		    Node node21 = new Node(1);
		    Node node11 = new Node(1);
		    
		    root.children = new Node[] {node6, node3, node5};
		    node6.children = new Node[] {node1,node65};
		    node6.parent = root;
		    node3.children = new Node[] {node2,node30};
		    node3.parent = root;
		    node5.children = new Node[] {node4};
		    node5.parent = root;
		    node2.children = new Node[] {node21};
		    node2.parent= node2;
		    node21.children = new Node[] {node11};
		    node21.parent = node2;
		    node30.children = new Node[] {node3010};
		    node30.parent = node3;
		    node3010.parent = node30;
		    node1.parent = node6;
		    node65.parent = node6;
		    node4.parent = node5;
		    node11.parent = node21;
		    //node1.children = {}
		    
		    SalesPath s = new SalesPath();
		    int min = s.getCheapestCost(root);
		    System.out.println(min);
		  }
		  }
}


//Below we are trying with intereative solution 
/*
   int temp = 0;

   Stack<Integer> sum = new Stack<Integer>();
   Stack<Node> stack = new Stack<Node>();
   stack.push(rootNode);
   
   while(!stack.isEmpty()){
     Node node = stack.pop();
     temp += node.cost;
     sum.push(temp);  
     if(node.children == null){
         if(minPath > sum.peek()){
             minPath = sum.peek();
             sum.pop();
             temp = sum.peek();
         }
     }else{
       for(int i = 0; i < node.children.length; i++){
           stack.push(node.children[i]);
       }
     }       
   }
   
   */