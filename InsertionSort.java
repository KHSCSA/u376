import java.util.ArrayList;

public class InsertionSort
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ratings = new ArrayList<Integer>();
        ratings.add(5);
        ratings.add(4);
        ratings.add(8);
        ratings.add(9);
        ratings.add(2);
        ratings.add(3);
        ratings.add(1);
        
        // Iterate through the list starting at the second element.
        // Recall that for an insertion sort, the first element is considered sorted.
        for (int i = 1; i < ratings.size(); i++) 
        {
            // Copy first unsorted element.
            int unsorted = ratings.get(i); 

            // Create a marker to hold the last element of the sorted portion of the array,
            // the remaining portion of the array is unsorted
            int marker = i - 1; 
            
            // Loop backwards through the sorted portion starting at marker
            while (marker >= 0)
            {            
                if ((unsorted < ratings.get(marker)))
                {
                    ratings.set(marker + 1, ratings.get(marker));
                    ratings.set(marker, unsorted); 
                }
                else
                {
                    // element is in correct place so stop iterating
                    marker = 0;
                }
                marker--;
            }
        }
        
        // Print all the elements of the list
        System.out.println(ratings);
        
    }
}