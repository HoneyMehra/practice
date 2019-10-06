package DFS_algo;

import java.util.ArrayList;
import java.util.List;

public class vertex {
	private String name;
	private boolean visited;
	private List<vertex> adjacentList;
	private vertex predecessor;
	
	public vertex(String name) {
		this.name = name;
		this.adjacentList = new ArrayList<vertex>();
	}
	
	public void addNeighbour(vertex v) {
		this.adjacentList.add(v);
	}

	public boolean isVisited() {
		return visited;
	}

	public String getName() {
		return name;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(vertex predecessor) {
		this.predecessor = predecessor;
	}

	public List<vertex> getAdjacentList() {
		return adjacentList;
	}
	
}
