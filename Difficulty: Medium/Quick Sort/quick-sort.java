//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // Fixed condition to correctly handle the base case.
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        // Changed to pivot-1 to correctly sort the left part of the array.
        quickSort(arr, low, pivot - 1);
        // No change needed here.
        quickSort(arr, pivot + 1, high);
    }
    
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int pi = low; // Initialized pi to low instead of 0 for correct index handling.
        
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                // swap pi and i
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }
        // swap pi and pivot;
        int temp = arr[pi];
        arr[pi] = arr[high];
        arr[high] = temp;
        
        return pi;
    } 
}

