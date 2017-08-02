package codepackage;

public class Edge<T> {
	

    public final double cost;
    public final Node<T> target;

    public Edge(Node<T> targetNode, double costVal){
        target = targetNode;
        cost = costVal;
    }

	public double getCost() {
		return cost;
	}

	public Node<T> getTarget() {
		return target;
	}
    

    //getters and setters
    
}
