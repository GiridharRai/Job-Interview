######################################################  Question  ################################################
/*
Write a program to find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).  If input array doesn't contain a majority element, then output "NO Majority Element"

Input:  The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.
Output: For each test case the output will be the majority element of the array.
Constraints:

1 <=T<= 100

1 <=N<= 100

0 <= a[i]<= 100


Example:

Input:

2
5
3 1 3 3 2
3
1 2 3

Output:
3
NO Majority Element
*/
##################################################################################################################

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int T, N;
    static int[] arr;
    
    static boolean verifyMajority(int arr[], int majority)   {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == majority)
                count++;
        }
        if(count > (arr.length/2))
            return true;
        else
            return false;
    }
    
    static int findMajority(int arr[])  {
        int majority = arr[0];
        int count = 1;
        int len = arr.length;
        for(int i=1; i<len; i++)    {
            if(arr[i] == majority)
                count++;
            else    {
                if(count == 1)  {
                    majority = arr[i];
                } else  {
                    count--;
                }
            }
        }
        boolean res = verifyMajority(arr, majority);
        if(res)
            return majority;
        else
            return -1;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0; i<T; i++)  {
		    N = sc.nextInt();
		    arr = new int[N];
		    for(int j=0; j<N; j++)  {
		        arr[j] = sc.nextInt();
		    }
		    int result = findMajority(arr);
		    if(result == -1)
		        System.out.println("NO Majority Element");
		    else
		        System.out.println(result);
		}
	}
}
