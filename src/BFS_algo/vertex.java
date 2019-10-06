package BFS_algo;

import java.util.ArrayList;
import java.util.List;

public class vertex {
	private int data;
	private boolean visited;
	private List<vertex> neighbourList;
	
	public vertex(int data) {
		this.data=data;
		this.neighbourList=new ArrayList<vertex>();
	}

	public void addNeighbour(vertex v) {
		this.neighbourList.add(v);
	}
	
	public List<vertex> getNeighbourList() {
		return neighbourList;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
}
