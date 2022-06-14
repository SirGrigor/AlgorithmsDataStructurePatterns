import algorithms.binarySearch.BinarySearch;
import algorithms.linearSearch.LinearSearch;

public class Main {
    public static void main(String[] args) {
        //Check linear
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,45,67,104,456,3566,56425};
        System.out.println(LinearSearch.search(array, 0));

        //Binary Search
        System.out.println(BinarySearch.binarySearch(array, 0, array.length - 1, 2));
    }
}