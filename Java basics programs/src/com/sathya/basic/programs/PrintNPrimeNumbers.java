package com.sathya.basic.programs;

import java.util.Scanner;

public class PrintNPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int flag=0;
		for (int i = 1; i <=n; i++) {
			flag=0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}else {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.print(i + " ");
			}

		}

	}
}
