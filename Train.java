package zoho;
import java.util.*;
public class Train {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	boolean loop=true;
	while(loop)
	{
		System.out.println("1.Book \n2.Cancel \n3.Available Tickets \n4.Booked Tickets \5.Exit");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
		{
			Book();
			break;
		}
		
		case 5:
		{
			loop=false;
			break;
			
		}
		}
	}
}
}
class Book{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the passenger Name:");
	String name =s.next();
	System.out.println("Enter the Passenger age:");
	int age=s.nextInt();
	System.out.println("Enter the passenger gender:(M,F)");
	String gender=s.next();
	System.out.println("Enter the passenger Bertn preference:(L,M,U)");
	String bp=s.next();
	Passenger p=new Passenger(name,age,gender,bp);
}
class Passenger{
	static int id=1;
	String name;
	int age;
	String gender;
	String bp;
	int passengerid=id++;
	String alloted;
	int number;
	public Passenger(String name,int age,String gender,String bp)
	{
		this.name=name;
		this .age=age;
		this.gender=gender;
		this.bp=bp;
		alloted="";
		number=-1;
	}
} 