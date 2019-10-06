package DFS_algo;

import java.util.Stack;

public class DFS {
	private Stack<vertex> stack;
	
	public DFS() {
		this.stack=new Stack<>();
	}
	public void dfs(vertex root) {
		stack.add(root);
		root.setVisited(true);
		while(!stack.isEmpty()) {
			vertex actualvertex= stack.pop();
			System.out.print(actualvertex.getName()+" ");
			for(vertex v:actualvertex.getAdjacentList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					v.setPredecessor(actualvertex);
					stack.push(v);
				}
				
			}
		}
	}
}
