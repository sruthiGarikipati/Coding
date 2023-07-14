import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	float arr[]=new float[5];
	System.out.println(" Enter Array elements ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the height of players  "+ i);
		arr[i]=scan.nextFloat();
		
	}
	System.out.println("Array contents are");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i] +" ");
	}
	
		
	
	}

}
