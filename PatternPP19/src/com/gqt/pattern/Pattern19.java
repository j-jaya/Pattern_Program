package com.gqt.pattern;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=sc.nextInt();
		int count=1;
		for(int i=0;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
			System.out.print(count+" ");
			count++;
		}
			System.out.println();	
	}

}
}