package assignment;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word : ");

		String str=scan.nextLine();
		
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
			System.out.println(str2);
		}
		scan.close();
	}

}
