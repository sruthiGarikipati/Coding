import java .util.Scanner;
public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter the number between 1-7");
		Scanner scan=new Scanner(System.in);
		int a =scan.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Happy sunday");
			break;
			case 2:
				System.out.println("Monday vibes");
			break;
			case 3:
				System.out.println("Tuesday Thoughts");
			break;
			case 4:
				System.out.println("Wednesday ");
			break;
			case 5:
				System.out.println("Thursday Things");
			break;
			case 6:
				System.out.println("Friday flyes");
			break;
			case 7:
				System.out.println("saturday shines");
			break;
			default:
				System.out.println("idiot see the message carefully");
		}
		
		
	}

}
