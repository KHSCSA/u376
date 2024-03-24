import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums = SortingAlgorithms.makeArrayList(10, -10, 10);
        System.out.println("Before sorting: " + nums);
        SortingAlgorithms.selectionSort(nums);
        System.out.println("After selection sort: " + nums);


        nums = SortingAlgorithms.makeArrayList(10, -10, 10);
        System.out.println("Before sorting: " + nums);
        SortingAlgorithms.selectionSort(nums);
        System.out.println("After insertion sort: " + nums);


        // TODO - rewrite the methods for Arrays (not ArrayLists)
        // create an array (not ArrayList) variable for 10 integers
        // write a method to return an array of 10 random integers
        // write the SelectionSort and InsertionSort algorithms for an array


        
    }

}
