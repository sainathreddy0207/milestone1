package milestone1;

import java.io.*;
import java.util.Scanner;
public class Activity1 {
public static void main(String[] args) {
int i,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int Arr[];   
Arr = new int[n];
		for(i=0;i<n;i++)
		{
		Arr[i]=sc.nextInt();	
		}
   int max = Arr[0];
        for (i = 1; i < n; i++){
            if (Arr[i] > max)
                max = Arr[i];
       
	}
System.out.println(max);
}
}