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
    
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    T = sc.nextInt();
	    for(int i=0; i<T; i++)  {
	        N = sc.nextInt();
	        arr = new int[N];
	        for(int j=0; j<N; j++)
	            arr[j] = sc.nextInt();
	        quickSort(arr, 0, N - 1);
	    }
	}
