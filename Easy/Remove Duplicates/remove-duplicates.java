//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static String removeDups(String S) {
        // code here
        HashSet<Character>set=new HashSet<>();
        StringBuffer sb=new StringBuffer();
        for (Character character : S.toCharArray()) {
            if (!set.contains(character)) {
                sb.append(character);
                set.add(character);
            }
        }
        return sb.toString();

    }
}