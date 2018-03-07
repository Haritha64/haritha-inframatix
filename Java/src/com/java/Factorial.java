package com.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the number");
     int num=scn.nextInt();
     int fact=1;
     for(int i=1;i<=num;i++)
     {
    	 fact=fact*i;
     } System.out.println("The factorial of given number is "+fact);
	}

}
 