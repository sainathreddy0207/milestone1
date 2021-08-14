package milestone1;

import java.io.*;
import java.util.Scanner;
public class Activity4 {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}