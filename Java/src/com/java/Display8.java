package com.java;

public class Display8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<=5;i++)
    {
    	for(int j=1;j<=5;j++)
    	{
    		if(i==j||(i+j)%6==0)
    		{
    			System.out.print("*");
    			
    		}else
    		{
    			System.out.print(" ");
    		}
    	}System.out.println();
    }
	}

}
