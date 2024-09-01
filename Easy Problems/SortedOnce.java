import java.util.*;

public class SortedOnce 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}

class Solution 
{
    int findOnce(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr)
        {
            if(list.contains(i))
              {
                  list.remove((Integer)i);
                  continue;
              }
              
            list.add(i);
        }
        
    return list.get(0);
    }
}
