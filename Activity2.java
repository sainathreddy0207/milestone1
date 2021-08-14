package milestone1;

import java.util.*;

public class Activity2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,max=0,c=0;
		n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
			if(array[i]>max){
				max=array[i];c=0;
			}
			if(array[i]==max)
				c++;
		}
		System.out.print(c);
	}
}