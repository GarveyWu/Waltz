package Training;

public class Graph {

	private GraphNode[] vertices;
	public int count;

	public Graph() {

		vertices = new GraphNode[6];
		count = 0;
	}

	public void addNode(GraphNode x) {

		if (count < 30) {
			vertices[count] = x;
			count++;
		} else {
			System.out.println("Graph is full!");
		}
	}

	public GraphNode[] getNodes() {

		return vertices;
	}
}