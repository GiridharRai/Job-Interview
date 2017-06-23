######################################## 	Question	################################
/*
Given a string, print all permutations of a given string.
Input:

The first line of input contains an integer T denoting the number of test cases.
Each test case contains a single string in capital letter.

Output:
Print all permutations of a given string with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:

Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA 
*/
#################################################################################################

import java.util.*;
import java.lang.*;
import java.io.*;

class StringPermutations {
    
    static int T;
    static String str;
    
    static void swap(char[] ch, int i, int j)  {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    
    static void permute(char[] ch, int start, int len) {
        if(len == 0)    {
            System.out.print(new String(ch) + " ");
            return;
        }
        for(int i=0; i<len; i++)    {
            swap(ch, start, start + i);
            permute(ch, start+1, len-1);
            swap(ch, start, start+i);
        }
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++)  {
		    str = sc.nextLine();
		    int len = str.length();
		    char[] ch = str.toCharArray();
		    permute(ch, 0, len);
		    System.out.println();
		}
	}
}
