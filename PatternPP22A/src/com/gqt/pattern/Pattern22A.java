package com.gqt.pattern;
import java.util.Scanner;
public class Pattern22A{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n;j++) {
				System.out.print("-");
			}
			for(int j=0;j<=i-1;j++) {
				System.out.print("#");
			}
				for(int j=1;j<=i;j++) {
					System.out.print("#");
				
			
	}
			System.out.println();
}
}
}
