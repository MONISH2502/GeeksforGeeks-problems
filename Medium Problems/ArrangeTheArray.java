//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrangeTheArray {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends

class Solution {
    
    public void Rearrange(int a[], int n)
    {
        List<Integer> list = new ArrayList<>();   
     List<Integer> list1 = new ArrayList<>();
     
        for(int i : a)
        {
            if(i < 0)
            list.add(i);
            
            else
            list1.add(i);
        }
        
        int j=0;
        
        for(int i : list)
        {
           a[j++] = i; 
        }
        
        for(int i : list1)
        {
           a[j++] = i; 
        }
    }
}
