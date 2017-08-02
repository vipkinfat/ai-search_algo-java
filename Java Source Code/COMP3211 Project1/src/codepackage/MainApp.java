/**
 * Created by WONG,Kin Fat on 21st March 2017
 * Copyright: For educational purpose
 * Developer info: WONG,Kin Fat
 * 
 * Usage of(MainApp.java):This class is for instantiate of other classes.
 * You can only modify this class for adding, removing
 * Nodes or changing the adjacency_matrix, other classes are implemented for the search algorithm
 * Last modified: 25 March, 2017
 */
package codepackage;

import java.util.ArrayList;

public class MainApp {
	
	 public static void clearVisitedCount(ArrayList<Node<String>> nodes)
	 {
	  for (int i = 0; i < nodes.size(); i++) {
	   nodes.get(i).setVisitedCount(0);;
	  }
	 }
	 
	 public static void clearVisitedFlags(ArrayList<Node<String>> nodes)
	 {
	  for (int i = 0; i < nodes.size(); i++) {
	   nodes.get(i).setVisited(false);
	  }
	 }

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TODO: Generating Graph 1
		//Node<T> NODE = new Node<T>( T name);
		Node<String> G1_nodeS = new Node<String>("S");
		Node<String> G1_nodeA = new Node<String>("A");
		Node<String> G1_nodeB = new Node<String>("B");
		Node<String> G1_nodeC = new Node<String>("C");
		Node<String> G1_nodeG = new Node<String>("G");
		 
		ArrayList<Node<String>> G1_nodes=new ArrayList<Node<String>>();
		G1_nodes.add(G1_nodeS);
		G1_nodes.add(G1_nodeA);
		G1_nodes.add(G1_nodeB);
		G1_nodes.add(G1_nodeC);
		G1_nodes.add(G1_nodeG);

		int adjacency_matrix_G1[][] = {
		{0,1,1,0,0}, // Node 1: S
		{0,0,1,0,1}, // Node 2: A
		{0,0,0,1,0}, // Node 3: B
		{0,0,0,0,1}, // Node 4: C
		{0,0,0,0,0}, // Node 5: G
		};
		
		// Graph 1 (BFS, DFS)
		System.out.println("------------Results of Graph 1-------------");
		System.out.println("\nThe BFS tree search of Graph 1 is ");
		BreadthFirstSearch<String> Graph1_BFS = new BreadthFirstSearch<String>();
		Graph1_BFS.bfs(adjacency_matrix_G1, G1_nodeS, G1_nodes);
		
		clearVisitedCount(G1_nodes);
		
		System.out.println("\nThe DFS tree search of Graph 1 is ");
		DepthFirstSearch<String> Graph1_DFS = new DepthFirstSearch<String>();
		Graph1_DFS.dfsUsingStack(adjacency_matrix_G1, G1_nodeS, G1_nodes);
		
		//TODO: Generating Graph 2
		//Node<T> NODE = new Node<T>( T name);
		Node<String> G2_nodeS = new Node<String>("S");
		Node<String> G2_nodeA = new Node<String>("A");
		Node<String> G2_nodeB = new Node<String>("B");
		Node<String> G2_nodeC = new Node<String>("C");
		Node<String> G2_nodeG = new Node<String>("G");
		 
		ArrayList<Node<String>> G2_nodes=new ArrayList<Node<String>>();
		G2_nodes.add(G2_nodeS);
		G2_nodes.add(G2_nodeA);
		G2_nodes.add(G2_nodeB);
		G2_nodes.add(G2_nodeC);
		G2_nodes.add(G2_nodeG);

		int adjacency_matrix_G2[][] = {
		{0,0,1,1,0}, // Node 1: S
		{0,0,0,0,1}, // Node 2: A
		{0,1,0,0,0}, // Node 3: B
		{0,0,1,0,0}, // Node 4: C
		{0,0,0,0,0}, // Node 5: G
		};
		
		// Graph 2 (BFS, DFS)
		System.out.println("\n\n------------Results of Graph 2-------------");
		System.out.println("\nThe BFS tree search of Graph 2 is ");
		BreadthFirstSearch<String> Graph2_BFS = new BreadthFirstSearch<String>();
		Graph2_BFS.bfs(adjacency_matrix_G2, G2_nodeS, G2_nodes);
		
		clearVisitedCount(G2_nodes);
		
		System.out.println("\n\nThe DFS tree search of Graph 2 is ");
		DepthFirstSearch<String> Graph2_DFS = new DepthFirstSearch<String>();
		Graph2_DFS.dfsUsingStack(adjacency_matrix_G2, G2_nodeS, G2_nodes);
		
		
		//TODO: Generating Graph 3
		//Node<T> NODE = new Node<T>( T name);
		Node<String> G3_nodeS = new Node<String>("S");
		Node<String> G3_nodeA = new Node<String>("A");
		Node<String> G3_nodeB = new Node<String>("B");
		Node<String> G3_nodeC = new Node<String>("C");
		Node<String> G3_nodeG = new Node<String>("G");
		 
		ArrayList<Node<String>> G3_nodes=new ArrayList<Node<String>>();
		G3_nodes.add(G3_nodeS);
		G3_nodes.add(G3_nodeA);
		G3_nodes.add(G3_nodeB);
		G3_nodes.add(G3_nodeC);
		G3_nodes.add(G3_nodeG);

		int adjacency_matrix_G3[][] = {
		{0,0,1,1,0}, // Node 1: S
		{0,0,0,0,0}, // Node 2: A
		{0,1,0,0,1}, // Node 3: B
		{0,1,0,0,1}, // Node 4: C
		{0,0,0,0,0}, // Node 5: G
		};
		
		// Graph 3 (BFS, DFS)
		System.out.println("\n\n------------Results of Graph 3-------------");
		System.out.println("\nThe BFS tree search of Graph 3 is ");
		BreadthFirstSearch<String> Graph3_BFS = new BreadthFirstSearch<String>();
		Graph3_BFS.bfs(adjacency_matrix_G3, G3_nodeS, G3_nodes);
		
		clearVisitedCount(G3_nodes);
		
		System.out.println("\nThe DFS tree search of Graph 3 is ");
		DepthFirstSearch<String> Graph3_DFS = new DepthFirstSearch<String>();
		Graph3_DFS.dfsUsingStack(adjacency_matrix_G3, G3_nodeS, G3_nodes);
		
		
		
		//Generating Graph 4 (Part 1)
		//TODO: (BFS, DFS, UCS-when h=0)
		//Node<T> NODE = new Node<T>( T name,double h_scores);
		Node<String> G4_nodeS = new Node<String>("S",0);
		Node<String> G4_nodeA = new Node<String>("A",0);
		Node<String> G4_nodeB = new Node<String>("B",0);
		Node<String> G4_nodeC = new Node<String>("C",0);
		Node<String> G4_nodeD = new Node<String>("D",0);
		Node<String> G4_nodeE = new Node<String>("E",0);
		Node<String> G4_nodeF = new Node<String>("F",0);
		Node<String> G4_nodeG1 = new Node<String>("G1",0);
		Node<String> G4_nodeG2 = new Node<String>("G2",0);
		
		//TODO: Generating Graph 4 (Part 2)
		//TODO: (A* tree, A* Graph)
		Node<String> G4_2_nodeS = new Node<String>("S",7);
		Node<String> G4_2_nodeA = new Node<String>("A",8);
		Node<String> G4_2_nodeB = new Node<String>("B",6);
		Node<String> G4_2_nodeC = new Node<String>("C",3);
		Node<String> G4_2_nodeD = new Node<String>("D",1);
		Node<String> G4_2_nodeE = new Node<String>("E",3);
		Node<String> G4_2_nodeF = new Node<String>("F",2);
		Node<String> G4_2_nodeG1 = new Node<String>("G1",0);
		Node<String> G4_2_nodeG2 = new Node<String>("G2",0);
		
		
		G4_2_nodeS.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeA, 1),
	    		new Edge<String>(G4_2_nodeB, 3)
	    };
	    
	    G4_2_nodeA.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeS, 1),
	    		new Edge<String>(G4_2_nodeD, 2)
//	    		new Edge<String>(G4_2_nodeC, 1)
	    };
	    
	    G4_2_nodeB.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeS, 3),
	    		new Edge<String>(G4_2_nodeD, 8),
	    		new Edge<String>(G4_2_nodeE, 5)
	    };

	    G4_2_nodeC.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeA, 1),
	    		new Edge<String>(G4_2_nodeD, 5),
	    		new Edge<String>(G4_2_nodeG1, 4)
	    };

	    G4_2_nodeD.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeA, 2),
	    		new Edge<String>(G4_2_nodeB, 8),
	    		new Edge<String>(G4_2_nodeC, 5),
	    		new Edge<String>(G4_2_nodeG1, 14),
	    		new Edge<String>(G4_2_nodeG2, 6),
	    };
		
	    G4_2_nodeE.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeB, 5),
	    		new Edge<String>(G4_2_nodeF, 1),
	    		new Edge<String>(G4_2_nodeG2, 4)
	    };
	    
	    G4_2_nodeF.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeE, 1),
	    		new Edge<String>(G4_2_nodeG2, 2)
	    };
	    G4_2_nodeG1.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeC, 4),
	    		new Edge<String>(G4_2_nodeD, 14),
	    		new Edge<String>(G4_2_nodeG2, 0)
	    };
	    G4_2_nodeG2.adjacencies = new Edge[]{
	    		new Edge<String>(G4_2_nodeD, 6),
	    		new Edge<String>(G4_2_nodeE, 4),
	    		new Edge<String>(G4_2_nodeF, 2),
	    		new Edge<String>(G4_2_nodeG1, 0)
	    };
		 
		
		//For UCS
	    G4_nodeS.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeA, 1),
	    		new Edge<String>(G4_nodeB, 3)
	    };
	    
	    G4_nodeA.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeS, 1),
	    		new Edge<String>(G4_nodeD, 2)
	    };
	    
	    G4_nodeB.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeS, 3),
	    		new Edge<String>(G4_nodeD, 8),
	    		new Edge<String>(G4_nodeE, 5)
	    };

	    G4_nodeC.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeA, 1),
	    		new Edge<String>(G4_nodeD, 5),
	    		new Edge<String>(G4_nodeG1, 4)
	    };

	    G4_nodeD.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeA, 2),
	    		new Edge<String>(G4_nodeB, 8),
	    		new Edge<String>(G4_nodeC, 5),
	    		new Edge<String>(G4_nodeG1, 14),
	    		new Edge<String>(G4_nodeG2, 6),
	    };
		
	    G4_nodeE.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeB, 5),
	    		new Edge<String>(G4_nodeF, 1),
	    		new Edge<String>(G4_nodeG2, 4)
	    };
	    
	    G4_nodeF.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeE, 1),
	    		new Edge<String>(G4_nodeG2, 2)
	    };
	    G4_nodeG1.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeC, 4),
	    		new Edge<String>(G4_nodeD, 14),
	    		new Edge<String>(G4_nodeG2, 0)
	    };
	    G4_nodeG2.adjacencies = new Edge[]{
	    		new Edge<String>(G4_nodeD, 6),
	    		new Edge<String>(G4_nodeE, 4),
	    		new Edge<String>(G4_nodeF, 2),
	    		new Edge<String>(G4_nodeG1, 0)
	    };
		 
	    
	    
	    
		ArrayList<Node<String>> G4_nodes=new ArrayList<Node<String>>();
		G4_nodes.add(G4_nodeS);
		G4_nodes.add(G4_nodeA);
		G4_nodes.add(G4_nodeB);
		G4_nodes.add(G4_nodeC);
		G4_nodes.add(G4_nodeD);
		G4_nodes.add(G4_nodeE);
		G4_nodes.add(G4_nodeF);
		G4_nodes.add(G4_nodeG1);
		G4_nodes.add(G4_nodeG2);

		int adjacency_matrix_G4[][] = {
		{0,1,1,0,0,0,0,0,0}, // Node 1: S
		{0,0,0,0,1,0,0,0,0}, // Node 2: A
		{0,0,0,0,1,1,0,0,0}, // Node 3: B
		{0,1,0,0,0,0,0,1,0}, // Node 4: C
		{0,0,0,1,0,0,0,1,1}, // Node 5: D
		{0,0,0,0,0,0,1,0,1}, // Node 6: E
		{0,0,0,0,0,0,0,0,1}, // Node 7: F
		{0,0,0,0,0,0,0,0,1}, // Node 8: G1
		{0,0,0,0,0,0,0,0,0}, // Node 9: G2
		};
		
		// Graph 4 (BFS, DFS, UCS, A* tree, A* Graph)
		System.out.println("\n\n------------Results of Graph 4-------------");
		System.out.println("\nThe BFS tree search of Graph 4 is ");
		BreadthFirstSearch<String> Graph4_BFS = new BreadthFirstSearch<String>();
		Graph4_BFS.bfs(adjacency_matrix_G4, G4_nodeS, G4_nodes);
		
		clearVisitedCount(G4_nodes);
		
		System.out.println("\nThe DFS tree search of Graph 4 is ");
		DepthFirstSearch<String> Graph4_DFS = new DepthFirstSearch<String>();
		Graph4_DFS.dfsUsingStack(adjacency_matrix_G4, G4_nodeS, G4_nodes);
		
		System.out.println("\nThe UCS tree search of Graph 4 is ");
		AStarGraphSearch<String> Graph4_UCS = new AStarGraphSearch<String>();
		Graph4_UCS.AstarSearch(G4_nodeS, G4_nodeG2);
		System.out.println(Graph4_UCS.printPath(G4_nodeG2) + " is shortest path");
		
		System.out.println("The A* tree search of Graph 4 is ");
		AStarGraphSearch<String> Graph4_AStarTree = new AStarGraphSearch<String>();
		Graph4_AStarTree.AstarSearch(G4_2_nodeS, G4_2_nodeG2);
		System.out.println(Graph4_AStarTree.printPath(G4_2_nodeG2) + " is shortest path");
		
		
		System.out.println("The A* Graph search of Graph 4 is ");
		AStarGraphSearch<String> Graph4_AStarGraph = new AStarGraphSearch<String>();
		Graph4_AStarGraph.AstarSearch(G4_2_nodeS, G4_2_nodeG2);
		System.out.println(Graph4_AStarGraph.printPath(G4_2_nodeG2) + " is shortest path");
		
		
		
		//TODO: Generating Graph 5 (Part 1)
		//TODO: (BFS, DFS, UCS)
		//Node<T> NODE = new Node<T>( T name,double h_scores);
		Node<String> G5_nodeS = new Node<String>("S",0);
		Node<String> G5_nodeA = new Node<String>("A",0);
		Node<String> G5_nodeB = new Node<String>("B",0);
		Node<String> G5_nodeC = new Node<String>("C",0);
		Node<String> G5_nodeD = new Node<String>("D",0);
		Node<String> G5_nodeG = new Node<String>("G",0);
		 
		//TODO: Generating Graph 5 (Part 2)
		//TODO: (A* tree, A* Graph)
		Node<String> G5_2_nodeS = new Node<String>("S",0);
		Node<String> G5_2_nodeA = new Node<String>("A",3);
		Node<String> G5_2_nodeB = new Node<String>("B",3);
		Node<String> G5_2_nodeC = new Node<String>("C",1);
		Node<String> G5_2_nodeD = new Node<String>("D",2);
		Node<String> G5_2_nodeG = new Node<String>("G",0);
		
		G5_2_nodeS.adjacencies = new Edge[]{
	    		new Edge<String>(G5_2_nodeA, 2),
	    		new Edge<String>(G5_2_nodeB, 1)
	    };
	    
	    G5_2_nodeA.adjacencies = new Edge[]{
	    		new Edge<String>(G5_2_nodeB, 1),
	    		new Edge<String>(G5_2_nodeC, 3),
	    		new Edge<String>(G5_2_nodeD, 1),
	    		new Edge<String>(G5_2_nodeS, 2)
	    };
	    
	    G5_2_nodeB.adjacencies = new Edge[]{
	    		new Edge<String>(G5_2_nodeD, 5),
	    		new Edge<String>(G5_2_nodeG, 10),
	    		new Edge<String>(G5_2_nodeA, 1),
	    		new Edge<String>(G5_2_nodeS, 1)
	    };

	    G5_2_nodeC.adjacencies = new Edge[]{
	    		new Edge<String>(G5_2_nodeG, 7),
	    		new Edge<String>(G5_2_nodeA, 3)
	    };

	    G5_2_nodeD.adjacencies = new Edge[]{
	    		new Edge<String>(G5_2_nodeG, 4),
	    		new Edge<String>(G5_2_nodeA, 1),
	    		new Edge<String>(G5_2_nodeB, 5)
	    };
		
	    G5_2_nodeG.adjacencies = new Edge[]{
	    		new Edge<String>(G5_2_nodeB, 10),
	    		new Edge<String>(G5_2_nodeC, 7),
	    		new Edge<String>(G5_2_nodeD, 4)
	    };
		
		
		
		
		// For UCS
		
	    G5_nodeS.adjacencies = new Edge[]{
	    		new Edge<String>(G5_nodeB, 1),
	    		new Edge<String>(G5_nodeA, 2)
	    };
	    
	    G5_nodeA.adjacencies = new Edge[]{
	    		new Edge<String>(G5_nodeB, 1),
	    		new Edge<String>(G5_nodeC, 3),
	    		new Edge<String>(G5_nodeD, 1),
	    		new Edge<String>(G5_nodeS, 2)
	    };
	    
	    G5_nodeB.adjacencies = new Edge[]{
	    		new Edge<String>(G5_nodeD, 5),
	    		new Edge<String>(G5_nodeG, 10),
	    		new Edge<String>(G5_nodeA, 1),
	    		new Edge<String>(G5_nodeS, 1)
	    };

	    G5_nodeC.adjacencies = new Edge[]{
	    		new Edge<String>(G5_nodeG, 7),
	    		new Edge<String>(G5_nodeA, 3)
	    };

	    G5_nodeD.adjacencies = new Edge[]{
	    		new Edge<String>(G5_nodeG, 4),
	    		new Edge<String>(G5_nodeA, 1),
	    		new Edge<String>(G5_nodeB, 5)
	    };
		
	    G5_nodeG.adjacencies = new Edge[]{
	    		new Edge<String>(G5_nodeB, 10),
	    		new Edge<String>(G5_nodeC, 7),
	    		new Edge<String>(G5_nodeD, 4)
	    };
		
		
		//For BFS and DFS
		ArrayList<Node<String>> G5_nodes=new ArrayList<Node<String>>();
		G5_nodes.add(G5_nodeS);
		G5_nodes.add(G5_nodeA);
		G5_nodes.add(G5_nodeB);
		G5_nodes.add(G5_nodeC);
		G5_nodes.add(G5_nodeD);
		G5_nodes.add(G5_nodeG);
		//For BFS and DFS
		int adjacency_matrix_G5[][] = {
		{0,1,1,0,0,0}, // Node 1: S
		{0,0,1,1,1,0}, // Node 2: A
		{0,0,0,0,1,1}, // Node 3: B
		{0,0,0,0,0,1}, // Node 4: C
		{0,0,0,0,0,1}, // Node 5: D
		{0,0,0,0,0,0}, // Node 9: G
		};
		
		// Graph 5 (BFS, DFS, UCS- when h=0, A* tree, A* Graph)
		System.out.println("\n\n------------Results of Graph 5-------------");
		System.out.println("\nThe BFS tree search of Graph 5 is ");
		BreadthFirstSearch<String> Graph5_BFS = new BreadthFirstSearch<String>();
		Graph5_BFS.bfs(adjacency_matrix_G5, G5_nodeS, G5_nodes);
		
		clearVisitedCount(G5_nodes);
		
		System.out.println("\nThe DFS tree search of Graph 5 is ");
		DepthFirstSearch<String> Graph5_DFS = new DepthFirstSearch<String>();
		Graph5_DFS.dfsUsingStack(adjacency_matrix_G5, G5_nodeS, G5_nodes);
		
		clearVisitedCount(G5_nodes);
		clearVisitedFlags(G5_nodes);
		
		System.out.println("\nThe UCS tree search of Graph 5 is ");
		AStarGraphSearch<String> Graph5_UCS = new AStarGraphSearch<String>();
		Graph5_UCS.AstarSearch(G5_nodeS, G5_nodeG);
		System.out.println(Graph5_UCS.printPath(G5_nodeG) + " is shortest path");
		
		System.out.println("The A* tree search of Graph 5 is ");
		AStarGraphSearch<String> Graph5_AStarTree = new AStarGraphSearch<String>();
		Graph5_AStarTree.AstarSearch(G5_2_nodeS, G5_2_nodeG);
		System.out.println(Graph5_AStarTree.printPath(G5_2_nodeG) + " is shortest path");
		
		
		System.out.println("The A* Graph search of Graph 5 is ");
		AStarGraphSearch<String> Graph5_AStarGraph = new AStarGraphSearch<String>();
		Graph5_AStarGraph.AstarSearch(G5_2_nodeS, G5_2_nodeG);
		System.out.println(Graph5_AStarGraph.printPath(G5_2_nodeG) + " is shortest path");
	}

}
