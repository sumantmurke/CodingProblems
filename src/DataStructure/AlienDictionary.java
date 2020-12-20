package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class AlienDictionary {

	public String alienOrder(String[] words) {

		HashMap<Character, ArrayList<Character>> map = new HashMap<Character,ArrayList<Character>>();

		int[] indegree = new int[26];



		// As the list is already sorted we will compare 2 words to create adjacency list

		for(String word : words ){

			for(char c : word.toCharArray()){

				map.put(c, new ArrayList<Character>());

			}

		}

		for(int i =0 ; i< words.length -1; i++){

			int len = Math.min(words[i].length(), words[i+1].length() );

			String wordOne =words[i];
			String wordtwo =words[i+1];

			if(wordOne.length() > wordtwo.length() && wordOne.startsWith(wordtwo)){

				return "";
			}


			for(int j = 0 ; j < len ; j++){

				if(wordOne.charAt(j) != wordtwo.charAt(j)){

					ArrayList<Character> list = map.get(wordOne.charAt(j));
					list.add(wordtwo.charAt(j));
					map.put(wordOne.charAt(j), list);
					int index = (int) wordtwo.charAt(j) - 'a';
					indegree[index] ++ ;    

				}    
			}

		}

		StringBuilder sb = new StringBuilder();
		Queue<Character> q = new LinkedList<Character>();
		HashSet<Character> visited = new HashSet<Character>();   

		// filled up queue with all the 0 indexgree
		for(int i =0 ; i< 26; i++){

			int index1 = (int)i + 'a';
			char ch = (char)index1;
			if(indegree[i] == 0 && map.containsKey(ch)){

				q.add(ch);
			}
		}


		while(!q.isEmpty()){

			char node = q.poll();
			if(!visited.contains(node)){

				sb.append(Character.toString(node));
				visited.add(node);          

			}

			ArrayList<Character> edges = map.get(node);

			for(char vertex : edges){

				indegree[(int) vertex - 'a'] --;
				if(!visited.contains(vertex) && indegree[(int) vertex - 'a'] == 0){
					q.add(vertex);

				}

			}

		} 


		return sb.toString();

	}
	
	
	public static void main(String[] args) {
		AlienDictionary a = new AlienDictionary();
		String[] word = {"ac","ab","zc","zb"};
		a.alienOrder(word);
		
	}
	
}
