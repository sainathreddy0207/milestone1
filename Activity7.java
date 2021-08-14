package milestone1;

import java.util.*;

public class Activity7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int trainspeed, time,trainlength;
		System.out.print("Enter the train speed in km/hr : ");
		trainspeed=sc.nextInt();
		System.out.print("\nEnter the time in seconds : ");
		time=sc.nextInt();
		trainlength = (trainspeed * 1000 * time)/3600;
		System.out.print("The length of train is : "+trainlength+"m");
	}
}