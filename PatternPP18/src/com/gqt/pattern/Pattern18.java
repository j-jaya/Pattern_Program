package com.gqt.pattern;
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
			System.out.print("* ");
			
		}
			System.out.println();	
	}

}
}