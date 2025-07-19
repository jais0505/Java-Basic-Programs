
public class Sum {

	int num1;
	int num2;
	int sum=0;
	
	void Add() {
		sum=num1+num2;
	}
	
	void display() {
		Add();
		System.out.println("Sum="+sum);
	}
}
