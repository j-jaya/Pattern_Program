package com.gqt.pattern;
import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++) {
		
		for(int j=0;j<=n-i-1;j++) {
		System.out.print(" ");
		}
		for(int j=i;j>0;j--) {
			System.out.print(j);
			}
		System.out.print(0);
		for(int j=1;j<=i;j++) {
			System.out.print(j);
			}
		System.out.println();
	}

	}

}
