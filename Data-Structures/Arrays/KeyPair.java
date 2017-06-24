##################################################  Question  ###########################################
/*
Given an array A[] of n numbers and another number x, determine whether or not there exist two elements in A whose sum is exactly x.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and X,N is the size of array.
The second line of each test case contains N integers representing array elements C[i].

Output:

Print "Yes" if there exist two elements in A whose sum is exactly x, else "No" without quotes.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 200
1 ≤ C[i] ≤ 1000

Example:

Input:
2
6 16
1 4 45 6 10 8
5 10
1 2 4 3 6

Output:
Yes
Yes
*/
#########################################################################################################

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int T, N, X;
    static int[] arr;
    
    static void swap(int arr[], int x, int y)  {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    } 
    
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high; j++)   {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    
    static void quickSort(int arr[], int low, int high) {
        if(low < high)  {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    } 
    
    static boolean sumExists(int[] arr, int sum)    {
        int l = 0, r = arr.length - 1;
        while(l<r)  {
            if((arr[l] + arr[r]) == sum)
                return true;
            else if(arr[l] + arr[r] < sum)
                l++;
            else
                r--;
        }
        return false;
    }
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    T = sc.nextInt();
	    for(int i=0; i<T; i++)  {
	        N = sc.nextInt();
	        X = sc.nextInt();
	        arr = new int[N];
	        for(int j=0; j<N; j++)
	            arr[j] = sc.nextInt();
              
	        quickSort(arr, 0, N - 1);
	        
          if(sumExists(arr, X))
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
	}
}
