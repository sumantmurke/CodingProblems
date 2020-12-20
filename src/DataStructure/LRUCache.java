package DataStructure;

import java.util.HashMap;

class LRUCache {
   
HashMap<Integer,Node> map ;
int counter = 0;
int cap ;
Node head, tail;	
    
    class Node{  
        int key;
        int value;
        Node previous;  
        Node next;  
   
        public Node(int key, int value) {  
            this.key = key; 
            this.value = value;
        } 
    } 
    // add node 
    // remove node 
    // move to head
    // pop tail    
        
        
private void removeNode(Node node) {
   
    node.previous.next = node.next;
    node.next.previous = node.previous;
    
  }   
        
        
private void addNode(Node node) {
   
    node.previous = head;
    node.next = head.next;
    
    head.next.previous = node;
    head.next = node;
    
    
  }   
        
private void removeTail() {
   
    Node res = tail.previous; 
    removeNode(res); 
    
  }   
        
        
private Node moveToHead(Node node) {
   
    removeNode(node);
    addNode(node);
    return node;
  } 
            

public LRUCache(int capacity) {
        
         map = new HashMap<Integer,Node>();
          head = new Node(0,0);
          tail = new Node(0,0);
        
            head.previous = null;
          tail.next = null;
        
          head.next = tail;
         tail.previous = head;
        cap = capacity;
            
    }
    
    public int get(int key) {
        
        // map contains key then get 
        // and update the doubly linked list
        // else return -1
        
        if(map.containsKey(key)){
            Node node = map.get(key);            
            return  moveToHead(node).value;
            
        }else {
            
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        
        // put in the map
        // look for doubly linked list 
        //  if list size == cache size
            //    then find the key and add to the start 
            // else add to the start   
        
        Node tempNode = new Node(key, value);
        map.put(key, tempNode);
        counter ++;
        
        if(counter <= cap){
            
            addNode(tempNode);
            
        }else{
            
            addNode(tempNode);
            removeTail();  
            
        }
        
        
    }
    
    public static void main(String[] args) {
    	LRUCache l = new LRUCache(2);
    	l.put(1, 1);
    	l.put(2, 2);
    	l.get(1);
    	l.put(3, 3);
    	l.get(2);
    	l.put(4, 4);
    	l.get(1);
    	l.get(3);
    	l.get(4);
	}
    
    
}
