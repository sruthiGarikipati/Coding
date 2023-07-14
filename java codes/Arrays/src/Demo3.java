import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter people count");
		int n=scan.nextInt();
		
	boolean arr[]=new boolean[n];
	
	for(int i=0 ;i<=arr.length-1;i++)
	{
		System.out.println(" is person married "+ i);
		arr[i]=scan.nextBoolean();
		
	}
	System.out.println("Array contents are");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i] +" ");
	}
	}
}
		
	
