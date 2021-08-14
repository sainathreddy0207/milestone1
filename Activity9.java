package milestone1;

import java.util.*;

public class Activity9 {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the total no of votes : ");
	    int votes=sc.nextInt();
	    int othermem_votes = (votes*80*45)/(100*100);
	    System.out.print("The number of valid votes for other candidate are : "+othermem_votes);
	}
}