import java.util.ArrayList;

public class SelectionSort
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
        ratings.add(4);
        
        // Iterate through all the values in the list.
        for (int i = 0; i < ratings.size() - 1; i++)
        {
            // Keep track of the index of the smallest number.
            int minIndex = i;
            
            // Iterate from the next index up to the end of the array
            for (int j = i + 1; j < ratings.size(); j++)
            {
                // If the current element is smaller than the minimum, we have a new 
                // smallest element, so set minIndex to the index of the current element.
                if(ratings.get(j) < ratings.get(minIndex))
                {
                    minIndex = j;
                }
            }
            
            // Swap current with minimum element if they're different
            if(ratings.get(i) != ratings.get(minIndex))
            {
            // Swap current with minimum element
            int temp = ratings.get(i);
            ratings.set(i, ratings.get(minIndex));
            ratings.set(minIndex, temp);
            }
        }
        
        // Print all the elements of the list
        System.out.println(ratings);
        
    }
}
