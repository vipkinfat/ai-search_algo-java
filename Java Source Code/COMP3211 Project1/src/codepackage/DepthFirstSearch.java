/**
 * This class is the independent implementation of Depth First Search with generic type
 */
package codepackage;

import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch<T> {
	 
	 	 
	 // find neighbors of node using adjacency matrix
	 // if adjacency_matrix[i][j]==1, then nodes at index i and index j are connected
	public ArrayList<Node<T>> findNeighbours(int adjacency_matrix[][],Node<T> x,ArrayList<Node<T>> nodes)
	 {
	 int nodeIndex=-1;
	 
	 ArrayList<Node<T>> neighbours=new ArrayList<Node<T>>();
	 for (int i = 0; i < nodes.size(); i++) {
	 if(nodes.get(i).equals(x))
	 {
	 nodeIndex=i;
	 break;
	 }
	 }
	 
	 if(nodeIndex!=-1)
	 {
	 for (int j = 0; j < adjacency_matrix[nodeIndex].length; j++) {
	 if(adjacency_matrix[nodeIndex][j]==1)
	 {
	 neighbours.add(nodes.get(j));
	 }
	 }
	 }
	 return neighbours;
	 }
	 
	 
	    // Recursive DFS
//	 public  void dfs(int adjacency_matrix[][], Node<T> node, ArrayList<Node<T>> nodes)
//	 {
//
//		 if(node.getVisitedCount()>3)
//		 {
//			 return;
//		 }
//	  System.out.print(node.getName() + " ");
//
//	  ArrayList<Node<T>> neighbours=findNeighbours(adjacency_matrix,node,nodes);
//	  for (int i = 0; i < neighbours.size(); i++) {
//	   Node<T> n=neighbours.get(i);
//	   n.setVisitedCount(n.getVisitedCount()+1);
//	   if( n!=null && !n.isVisited())
//	   {
//		   dfs(adjacency_matrix,n,nodes);
//		   n.setVisited(true);
//		   
//	   }
//	  }
//	 }
	 
	 // Iterative DFS using stack
	 
	 public  void dfsUsingStack(int adjacency_matrix[][], Node<T> node, ArrayList<Node<T>> nodes)
	 {
		 Stack<Node<T>> stack = new Stack<>();
		 if(node.getName()!= "G" && node.getName()!= "G1" && node.getName() != "G2")
		 {
			 stack.push(node);
			 
		 }
	 while ( !stack.isEmpty() && node.getName()!= "G" && node.getName()!= "G1" && node.getName() != "G2" )
	 {
		 
		 Node<T> element=stack.pop();
		 if(element.getVisitedCount()>3)
		 {
			 System.out.print("...");
			 break;
		 }
		 System.out.print(element.getName() + " ");
		 if(element.getName() == "G" || element.getName() == "G1" || element.getName() == "G2")
		 {
			 break;
		 }
		 ArrayList<Node<T>> neighbours=findNeighbours(adjacency_matrix,element,nodes);
		 for (int i =neighbours.size()-1; i >=0 ; i--) {
			 Node<T> n=neighbours.get(i);
			 if(n!=null)
			 {
				 stack.push(n);
				 n.setVisitedCount(n.getVisitedCount()+1);
				 

			 }
		 }
	 }
	 }
	
}
