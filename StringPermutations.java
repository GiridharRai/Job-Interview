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
