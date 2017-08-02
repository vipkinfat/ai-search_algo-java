/**
 * Tree Nodes or Graph Nodes
 */
package codepackage;


import java.util.ArrayList;
import java.util.List;

public class Node<T> {

	private T name;
	private double g_scores;
	private double h_scores;
	private double f_scores;
	public Edge<T>[] adjacencies;
	private Node<T> parent;
	private List<Edge<T>> edges;
	private boolean isVisited;
	private int visitedCount;
	
	public Node(T vertex) {
        this.name = vertex;
        this.edges = new ArrayList<>();
    }
	
	public Node(T vertex, double h_scores)
	{
		this.name = vertex;
		this.h_scores = h_scores;
	}
	
	


	public double getG_scores() {
		return g_scores;
	}

	public void setG_scores(double g_scores) {
		this.g_scores = g_scores;
	}

	public double getH_scores() {
		return h_scores;
	}

	public void setH_scores(double h_scores) {
		this.h_scores = h_scores;
	}

	public double getF_scores() {
		return f_scores;
	}

	public void setF_scores(double f_scores) {
		this.f_scores = f_scores;
	}

	
    
    public boolean equal(Node<T> goal)
    {
    	return this.getName()==goal.getName();
    }
    
    
    // Getters and Setters
    public int getEdgeCount() {
        return edges.size();
    }
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	public List<Edge<T>> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge<T>> edges) {
		this.edges = edges;
	}
	
	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public int getVisitedCount() {
		return visitedCount;
	}
	public void setVisitedCount(int visitedCount) {
		this.visitedCount = visitedCount;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name.toString();
	}
	
}
