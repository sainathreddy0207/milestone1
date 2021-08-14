package milestone1;

import java.util.*;
public class Activity3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int position=1,space=n-1,num=1;
		while(position<=n){
			for(int i=1;i<=space;i++)
				System.out.print(" ");
			for(int i=1;i<=position;i++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}
			int reverse=num-2;
			for(int i=1;i<position;i++){
				if(reverse<0){
					reverse=9;
				}
				System.out.print(reverse);reverse--;
			}
			position++;System.out.print("\n");space--;
		}
	}
}