package milestone1;

import java.util.*;

public class Activity8 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int trainlength,Manspeed,time;
		System.out.print("Enter the train length : ");
		trainlength= sc.nextInt();
		System.out.print("Enter the man speed in km/hr : ");
		Manspeed = sc.nextInt();
		System.out.print("Enter the time in seconds : ");
		time = sc.nextInt();
		int relative_train_speed = ((trainlength*18)/(time*5));
		int train_speed = relative_train_speed + Manspeed;
		System.out.print("The speed of train in km/hr is : "+train_speed);
	}
}