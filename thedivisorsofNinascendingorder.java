/*
    Time Complexity: O(N).
    Space Complexity: O(1).

    where 'N' is the given number.
*/
import java.util.ArrayList;
import java.util.List;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        List< Integer > ans = new ArrayList<>();

        // Traversing from 1 to 'N'.
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}