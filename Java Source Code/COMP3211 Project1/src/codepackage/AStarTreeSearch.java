package codepackage;

import java.util.PriorityQueue;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class AStarTreeSearch<T> {
	public List<Node<T>> printPath(Node<T> target){
		List<Node<T>> path = new ArrayList<Node<T>>();
    
		for(Node<T> node = target; node!=null; node = node.getParent())
		{
			path.add(node);
		}

		Collections.reverse(path);

		return path;
	}

    public void AstarSearch(Node<T> source, Node<T> goal){

//    	Set<Node<T>> explored = new HashSet<Node<T>>();

    	PriorityQueue<Node<T>> queue = new PriorityQueue<Node<T>>(20, 
    			new Comparator<Node<T>>(){
    		//override compare method
    		public int compare(Node<T> i, Node<T> j){
    			if(i.getF_scores() > j.getF_scores()){
                    return 1;
                }

                else if (i.getF_scores() < j.getF_scores()){
                    return -1;
                }

                else{
                    return 0;
                }
             }

    	}
    			);

    	//cost from start
    	source.setG_scores(0);

    	queue.add(source);

    	boolean found = false;

    	while((!queue.isEmpty())&&(!found)){

    		//the node in having the lowest f_score value
    		Node<T> current = queue.poll();

//    		explored.add(current);

    		//goal found
    		if(current.getName().equals(goal.getName())){
    			found = true;
    		}

                    //check every child of current node
    		for(Edge<T> e : current.adjacencies){
    			Node<T> child = e.target;
    			double cost = e.cost;
    			double temp_g_scores = current.getG_scores() + cost;
    			double temp_f_scores = temp_g_scores + child.getH_scores();
		

    			/*if child node has been evaluated and 
      			the newer f_score is higher, skip*/
                            
    			if(temp_f_scores >= child.getF_scores()){
    				continue;
    			}

    			/*else if child node is not in queue or 
        		newer f_score is lower*/
                            
    			else if((!queue.contains(child)) || 
    					(temp_f_scores < child.getF_scores())){

    				child.setParent(current);
    				child.setG_scores(temp_g_scores);
    				child.setF_scores(temp_f_scores);

    				if(queue.contains(child)){
    					queue.remove(child);
    				}

    				queue.add(child);

    			}

    		}

    	}

    }
    
	    
}
