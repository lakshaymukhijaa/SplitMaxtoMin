import java.util.*;

public class MaxSumToMin
{
    public static void SplitMaxSumToMin(int a[], int n, int k)
    {
        int x = n / k;

        // Hash map initialization
        HashMap<Integer, Integer> y = new HashMap<>();

        // counting the frequency of each element
        for (int i = 0; i < n; i++)
        {
            // if element doesn't exist in hash table
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);

               // if element exists in the hash table
            else
            {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }
        // iterating over each element in the hash table to check frequency
        for (Map.Entry m : y.entrySet())
        {
            Integer temp = (Integer)m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }

    // Main Block
    public static void main(String[] args)
    {
        int a[] = new int[] {5,1,2,3,7,4};
        int n=6;
        int k=3;
        SplitMaxSumToMin(a, n, k);
    }
}
 