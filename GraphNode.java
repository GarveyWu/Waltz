package Training;

public class GraphNode {

	private GraphNode[] adjacent;
	public int adjacentCount;
	private String vertex;
	public TreeandGraph2_a.State state;

	public GraphNode(String vertex, int adjacentLength) {

		this.vertex = vertex;
		adjacentCount = 0;
		adjacent = new GraphNode[adjacentLength];
	}

	public void addAjacent(GraphNode x) {

		if (adjacentCount < 30) {
			this.adjacent[adjacentCount] = x;
			adjacentCount++;
		} else {
			System.out.println("No more adjacent can be added!");
		}
	}

	public GraphNode[] getAjacent() {

		return adjacent;
	}

	public String getVertex() {

		return vertex;
	}
}