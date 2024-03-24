import java.util.ArrayList;

public class SortingAlgorithms{
    // TODO - write new method makeArray
    // TODO - write new method selectionSort (that receives an array)
    // TODO = write new method insertionSort (that receives an array)


    public static ArrayList<Integer> makeArrayList(int num, int min, int max){
        int range = max-min+1;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0; i<num; i++){
            nums.add((int)(Math.random()*range) + min);
        }
        return nums;
    }


    public static void selectionSort(ArrayList<Integer> nums){
        // Iterate through all the values in the list.
        for (int i = 0; i < nums.size() - 1; i++){
            // Keep track of the index of the smallest number.
            int minIndex = i;
            
            // Iterate from the next index up to the end of the array
            for (int j = i + 1; j < nums.size(); j++){
              // If the current element is smaller than the minimum, we have a new 
                // smallest element, so set minIndex to the index of the current element.
                if(nums.get(j) < nums.get(minIndex)){
                    minIndex = j;
                }
            }
            
            // Swap current with minimum element if they're different
            if(nums.get(i) != nums.get(minIndex)){
                // Swap current with minimum element
                int temp = nums.get(i);
                nums.set(i, nums.get(minIndex));
                nums.set(minIndex, temp);
            }
        } 
    } // close method


    public static void insertionSort(ArrayList<Integer> nums){
        /* your code goes here */

        // Iterate through the list starting at the second element.
        // Recall that for an insertion sort, the first element is considered sorted.
        for (int i = 1; i < nums.size(); i++){
            // Copy first unsorted element.
            int unsorted = nums.get(i); 

            // Create a marker to hold the last element of the sorted portion of the array,
            // the remaining portion of the array is unsorted
            int marker = i - 1; 
            
            // Loop backwards through the sorted portion starting at marker
            while (marker >= 0){            
                if ((unsorted < nums.get(marker))){
                    nums.set(marker + 1, nums.get(marker));
                    nums.set(marker, unsorted); 
                }
                else{
                    // element is in correct place so stop iterating
                    marker = 0;
                }
                marker--;
            }
        }
    } // close method


}