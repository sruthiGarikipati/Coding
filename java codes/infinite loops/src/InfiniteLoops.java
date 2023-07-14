
public class InfiniteLoops {
	public static void main(String[] args) {
		int i=1;
		for(;;i++)
		{
			if(i!=100000)
			{
				System.out.println(i);
			}
			if(i==200000)
			{
				break;
			}
			
		}
	}
}
		
		
		