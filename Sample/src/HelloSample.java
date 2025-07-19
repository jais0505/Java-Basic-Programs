import java.util.Scanner;

public class HelloSample {
	
	public static void main(String ar[]) {
		
//		int a=5;
//		
//		System.out.println("Hello World "+a);
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c=a+b;
		
		System.out.println("Sum="+c);
		
		s.close();
	}

}
