import algorithms.binarySearch.BinarySearch;
import algorithms.firstSearch.DFS;
import algorithms.linearSearch.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = checkLinear();
        checkBinary(BinarySearch.binarySearch(array, 0, array.length - 1, 2));
        checkDFS();
    }

    private static void checkDFS() {
        //Depth First Search
        DFS graph = new DFS(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");
        graph.traversalDFS(2);
    }

    private static void checkBinary(int array) {
        //Binary Search
        System.out.println(array);
    }

    private static int[] checkLinear() {
        //Check linear
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,45,67,104,456,3566,56425};
        checkBinary(LinearSearch.search(array, 0));
        return array;
    }
}