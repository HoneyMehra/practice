package BFS_algo;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	private Queue<vertex> queue;
	
	public BFS() {
		this.queue = new LinkedList<vertex>();
	}
	public void bfs(vertex root) {
		queue.add(root);
		root.setVisited(true);
		while(!queue.isEmpty()) {
			vertex actualvertex=queue.remove();
			System.out.print(actualvertex.getData()+" ");
			for(vertex v: actualvertex.getNeighbourList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
}
