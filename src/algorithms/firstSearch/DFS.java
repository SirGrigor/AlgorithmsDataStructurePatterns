package algorithms.firstSearch;


import java.util.Iterator;
import java.util.LinkedList;

// This class represents a
// directed graph using adjacency
// list representation
public class DFS {
    
    private int Vertical;

    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer>[] adjected;


    // Constructor
    @SuppressWarnings("unchecked")
    public DFS(int vertical) {
       Vertical = vertical;
       adjected = new LinkedList[vertical];
       for (int i = 0; i < vertical; ++i) {
           adjected[i] = new LinkedList<>();
       }
    }

    // Function to add an edge into the graph
    public void addEdge(int vertical, int value) {
        adjected[vertical].add(value);
    }

    // A function used by DFS
    private void DFSUtil(int vertical, boolean[] visited){
        // Mark the current node as visited and print it
        visited[vertical] = true;
        System.out.println(vertical + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        for (int n : adjected[vertical]) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    public void traversalDFS(int vertical) {
        // Mark all the vertices as not visited
        boolean[] visited = new boolean[Vertical];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(vertical, visited);
    }
}
