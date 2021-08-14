package milestone1;

import java.io.*;
import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        int i,s=0,num,n;
        float average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers to find the average:");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            num=sc.nextInt();
            s=s+num;
        }
        average=s/(float)10;
        System.out.println("The average "+"is "+average);
    }
}