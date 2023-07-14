import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	String arr[]=new String[5];
	System.out.println(" Enter Array elements ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the name of  employee "+ i);
		arr[i]=scan.next();
		
	}
	System.out.println("Array contents are");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i] +" ");
	}
	
		
	
	}

}
