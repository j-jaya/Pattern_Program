package com.gqt.pattern;
import java.util.Scanner;
public class PatternP27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++) {
			count=1;
			for(int j=i;j<=n;j++) {
			System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(count+"");
				count++;
				}
			for(int j=1;j<=i;j++) {
				System.out.print(count+"");
				count--;
			}	
			System.out.println();
	
		}	
	}
}