import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
{
    int countPair(int k, int arr[])
    {
    int n=arr.length,c=0;
    
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j] == k) c++;
        }
    }
        
    return c;
    }
}

class PairSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);

            inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            int res = obj.countPair(k, arr);
            System.out.println(res);
        }
    }
}
