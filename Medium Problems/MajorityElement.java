import java.util.*;
import java.io.*;
import java.lang.*;

class MajorityElement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends

class Solution
{
    static int majorityElement(int a[], int size)
    {
    HashMap<Integer,Integer> map = new HashMap<>();
    
       for(int i :a)
       {
           map.put(i,map.getOrDefault(i,0) + 1);
       }
       
       for(int i : map.keySet())
       {
           if(map.get(i) > size/2)
           {
               return i;
           }
       }
       return -1;
    }
}
