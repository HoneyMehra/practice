package BFS_algo;

public class main {

	public static void main(String[] args) {
		vertex vertex1= new vertex(1);
		vertex vertex2= new vertex(2);
		vertex vertex3= new vertex(3);
		vertex vertex4= new vertex(4);
		vertex vertex5= new vertex(5);
		
		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex4);
		vertex4.addNeighbour(vertex5);
		vertex2.addNeighbour(vertex3);
		
		BFS b=new BFS();
		b.bfs(vertex1);
	}

}
