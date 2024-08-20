//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int start=0;
        int end=0;
        int idx=0;
        long[] ans=new long[N-K+1];
        List<Long>neg=new ArrayList<>();
        
        
        while(end<N){
            if(A[end]<0){
                neg.add(A[end]);
            }
            
            if(end-start+1<K){
                end++;
            }else{
                if(neg.size()==0){
                    ans[idx++]=0;
                }else{
                    long x=neg.get(0);
                    ans[idx++]=x;
                    
                    if(x==A[start]){
                        neg.remove(0);
                    }
                }
                start++;
                end++;
            }
        }
        return ans;
    }
}