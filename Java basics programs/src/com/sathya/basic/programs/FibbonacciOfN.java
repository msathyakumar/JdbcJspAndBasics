package com.sathya.basic.programs;
import java.util.Scanner;
public class FibbonacciOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth number");
		int n = sc.nextInt();
		int a=0,b=1;
		int c;
		System.out.print(a +" ");
		for(int i=0;i<n;i++) {
			System.out.print(b+" ");
			c = a+b;
			a=b;
			b=c;
			
		}
		
	}

}
