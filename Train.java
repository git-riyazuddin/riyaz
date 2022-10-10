package riyaz;

import java.util.Scanner;

public class TrainRes {
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
				Book bo=new Book();
				bo.Book();
				break;
			}
			case 2:
			{
				break;
			}
			case 3:
			{
				break;
				
			}
			case 4:
			{
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
	
	public void Book() {
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
public void Ticket() {
	Scanner s=new Scanner(System.in);
		String[][]str=new String[11][6];
		int j=0;
		int i=0;
		str[i][j++]="PNR";
		str[i][j++]="NAME";
		str[i][j++]="AGE";
		str[i][j++]="GENDER";
		str[i][j++]="BERTH";
		str[i][j++]="WHERE TO WHERE ";

	
		for(i=1;i<=10;i++)
		{
			for(j=1;j<6;j++) {
				if(j==1)
				{
					System.out.println("Enter the passenger Name:");
					str[i][j]=s.next();
				}
				if(j==2)
				{
					int n=s.nextInt();
					str[i][j]=s.next();
					
				}
				if(j==3)
				{
					str[i][j]=s.next();
					
				}
				if(j==4)
				{
					str[i][j]=s.next();
				}
				if(j==5)
				{
				str[i][j]="EGMORE TO THIRUCHI";	
				}

			}
			
		}
	}
}
class Cancel{
	public Cancel() {
		
	}
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
