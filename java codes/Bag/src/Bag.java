
public class Bag {
	int no;
	String name;
	String color;
	
	public Bag(int no,String name, String color) {
		super();
		this.no = no;
		this.name = name;
		this.color = color;
		
		
	}
	
void wear()
{
	System.out.println(name+" "+"shirt is in the color of " +color+ " is weared by kodnestains");
}
void carry()
{
	System.out.println(name+" giving bag whcih is in the color of "+color);
}
void provide()
{
	System.out.println(name+" giving "+no+" books, "+color+" bag and shirt as welcome kit");
}
}