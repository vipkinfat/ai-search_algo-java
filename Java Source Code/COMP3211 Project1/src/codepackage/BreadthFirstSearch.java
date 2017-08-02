/**
 * This class is the independent implementation of Breadth First Search with generic type
 */
package codepackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {
	 private Queue<Node<T>> queue;
	 //static ArrayList<Node> nodes=new ArrayList<Node>();

	 
	 public BreadthFirstSearch()
	 {
	 queue = new LinkedList<Node<T>>();
	 }
	 
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
	 
	 public void bfs(int adjacency_matrix[][], Node<T> node, ArrayList<Node<T>> nodes)
	 {
		 if(node.getName()!= "G" && node.getName()!= "G1" && node.getName() != "G2")
		 {
			 queue.add(node);
			 
		 }
	 while ( !queue.isEmpty() && node.getName()!= "G" && node.getName()!= "G1" && node.getName() != "G2" )
	 {
	 
		 Node<T> element=queue.remove();
		 System.out.print(element.getName() + " ");
		 if(element.getName() == "G" || element.getName() == "G1" || element.getName() == "G2")
		 {
			 break;
		 }
		 ArrayList<Node<T>> neighbours=findNeighbours(adjacency_matrix,element,nodes);
		 for (int i = 0; i < neighbours.size(); i++) {
			 Node<T> n=neighbours.get(i);
			 if(n!=null )
			 {
				 queue.add(n);
				

			 }
		 }
	 }
	 }
	 
}
