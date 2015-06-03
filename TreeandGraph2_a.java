package Training;

import java.util.LinkedList;

public class TreeandGraph2_a {

	public static boolean search (Graph g, GraphNode start, GraphNode end){
		
		LinkedList<GraphNode> q = new LinkedList<GraphNode>();
		for (GraphNode u: g.getNodes()){
			u.state = State.Unvisited;
		}
		start.state = State.Visiting;
		q.add(start);
		GraphNode u;
		while(!q.isEmpty()){
			u = q.removeFirst();
			if (u != null){
				for (GraphNode v: u.getAjacent()){
					if (v.state == State.Unvisited){
						if (v == end){
							return true;
						}else{
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				u.state = State.Visited;
			}
		}
		return false;
	}
	
	public enum State {
		Unvisited, Visited, Visiting;
	}

	public static Graph createNewGraph(){
		
		Graph g = new Graph();
		GraphNode[] temp = new GraphNode[6];
		
		temp[0] = new GraphNode("a", 3);
		temp[1] = new GraphNode("b", 0);
		temp[2] = new GraphNode("c", 0);
		temp[3] = new GraphNode("d", 1);
		temp[4] = new GraphNode("e", 1);
		temp[5] = new GraphNode("f", 0);
		
		temp[0].addAjacent(temp[1]);
		temp[0].addAjacent(temp[2]);
		temp[0].addAjacent(temp[3]);
		temp[3].addAjacent(temp[4]);
		temp[4].addAjacent(temp[5]);
		
		for (int i = 0; i<6; i++){
			g.addNode(temp[i]);
		}
		return g;
	}
	
	public static void main(String[] args) {

		Graph g = createNewGraph();
		GraphNode[] n = g.getNodes();
		GraphNode start = n[2];
		GraphNode end = n[5];
		System.out.println(search(g, start, end));
	}
}