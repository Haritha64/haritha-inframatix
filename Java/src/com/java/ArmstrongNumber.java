package com.java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=scn.nextInt();
    int r;
    int t=n;
    int s=0;
    while(n>0)
    {
    	r=n%10;
    	n=n/10;
    	s=s+r*r*r;
    }
    if(t==s)
    {
    	System.out.println("The given number is Armstrong Number");
    }else
    	System.out.println("The given number is not Armstrong");
    
	}

}
