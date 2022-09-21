/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class P1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);		
        int arr[]={2,8,1};
        
        //////
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            int min=MIN_VALUE;
            int z=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    z=j;
                }
            }
            arr[i]=arr[i]+arr[z];
            arr[z]=arr[i]-arr[z];
            arr[i]=arr[i]-arr[z];
        }
        /////
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
	}
}
