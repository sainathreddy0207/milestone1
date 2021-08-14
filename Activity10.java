package milestone1;

import java.util.*;

public class Activity10 {
	public static void main(String args[]){
		int a=21,b=36,c=66,ans=1;
		lcm l=new lcm();
		int abc=l.findlcm(a,b,c);
		int arr[]=new int[a];Arrays.fill(arr, 0);
		int num=a;int lcm=abc;
		for(int i=2;i<a&&a>1;i++){
			while((abc%i)==0){
		    arr[i]++;abc/=i;
			}
		}
		for(int i=2;i<num;i++){
			if(arr[i]%2!=0)
				ans*=i;
		}
		System.out.println("The least perfect square number the is divisible by 21,36,66 is: "+ans*lcm);
	}
}
class lcm{
	int gcd(int a, int b)
	{
	    if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}
	int findlcm(int a, int b,int c)
	{
	    int ans = a;
	    ans = ((b * ans) /gcd(b, ans));
	    ans = ((c* ans) /gcd(c, ans));
	    return ans;
	}
	 
}