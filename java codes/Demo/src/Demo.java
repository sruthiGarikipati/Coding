import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b)
		{
			System.out.println(b-a);
		}
		else
		{
			System.out.println(a-b);
		}
	}

}
