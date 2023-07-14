package calculator;
import java.util.Scanner;
public class calculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		calculator calculator=new calculator();
		int c=calculator.add(a,b);
		System.out.println("Addition Result is "+ c);
		int d=calculator.sub(a, b);
		System.out.println("subtraction Result is "+ d);
		int e=calculator.mul(a,b);
		System.out.println("multiplication Result is "+ e);
		
		int f=calculator.div(a, b);
		System.out.println("division Result is "+ f);
		
		int g=calculator.mod(a, b);
		System.out.println("modulus Result is "+ g);
		
		int h=calculator.findsquare(a);
		System.out.println("square Result is "+ h);
		
		
		
		
		
	}

}
