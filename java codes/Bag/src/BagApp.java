import java.util.Scanner;
public class BagApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter No.of Books ");
		int no =scan.nextInt();
		
		System.out.println("Enter name");
		scan.nextLine();
		String name=scan.next();
		
		System.out.println("Enter color");
		String color=scan.next();
		
		Bag b=new Bag(no,name,color);
		System.out.println();
		b.wear();
		b.carry();
		b.provide();
		


	}

}
