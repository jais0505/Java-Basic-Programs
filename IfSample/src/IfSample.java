import java.util.Scanner;

public class IfSample {

	public static void main(String args[]) {
		
		System.out.println("Enter a number:");
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		
		if(num>0) {
			System.out.println(num+" is a +ve number");
		}
		else {
			System.out.println(num+" is a -ve number");
		}
	}
}
