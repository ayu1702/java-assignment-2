package assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		// 0,1,1,2,3,5,8,13,21,34
		
		int a=0;
		int b=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int count=scan.nextInt();
		
		if(count==0) {
			System.out.print(a);
		}
		else if(count==1) {
			System.out.print(a+"," );
			System.out.print(b+"," );
		}
		else {
			System.out.print(a+"," );
			System.out.print(b+"," );

			while(count>=0) {
				int fibo=a+b;
				System.out.print(fibo+"," );
				a=b;
				b=fibo;
				count=count-1;

			}
		}
		scan.close();

	}

}
