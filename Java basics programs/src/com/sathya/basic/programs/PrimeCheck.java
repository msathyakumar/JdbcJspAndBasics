package com.sathya.basic.programs;
import java.util.Scanner;
public class PrimeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to be checked");
		int n = sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++) {
			//System.out.print(i);
			if(n%i==0) {
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("given number is prime number");
		}
		else {
			System.out.println("given number is odd number");
		}

	}

}
