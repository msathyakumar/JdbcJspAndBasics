package com.sathya.basic.programs;

import java.util.Scanner;

public class FibbonacciOfMaxN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth number");
		int n = sc.nextInt();
		int a=0,b=1;
		int c;
		System.out.print(a+" ");
		for(;b<=n;) {
			System.out.print(b+" ");
			c = a+b;
			a=b;
			b=c;
			
		}
		
	}

}
