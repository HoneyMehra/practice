package DFS_algo;

public class main {
	
public static void main(String[] args) {
	vertex vertexA= new vertex("A");
	vertex vertexB= new vertex("B");
	vertex vertexC= new vertex("C");
	vertex vertexD= new vertex("D");
	vertex vertexE= new vertex("E");
	
	vertexA.addNeighbour(vertexB);
	vertexA.addNeighbour(vertexC);
	
	vertexC.addNeighbour(vertexD);
	vertexB.addNeighbour(vertexE);
	
	DFS d= new DFS();
	d.dfs(vertexA);
}
}
