package com.gqt.pattern;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n;j++) {
				System.out.print(j);
				
					}
			for(int j=1;j<=(2*i-1);j--) {
				System.out.print(j);
			}	
			System.out.println();
	
		}	
	}
}