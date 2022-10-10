package oops;

import java.util.Scanner;


public class Trainres {
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
				Booking bo=new Booking();
				bo.book();
				break;
			}
			case 2:
			{
				
				break;
			}
			case 3:
			{
				TicAva av=new TicAva();
				av.show();
				break;
				
			}
			case 4:
			{	BookedTickt bt=new BookedTickt();
				bt.ShowDetials();
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

class Passenger{
	Scanner s=new Scanner(System.in);
	   String from;
	   String to;
	 static   int upper=2;
	 static  int lower=2;
	 static int middle=2;
	 static int berth=6;
	 static int Rac=2;
	 static  int wl=2;
		static String Pnr[]=new String[10];
		static String Name[]=new String[20];
		static int Age[]=new int[20];
	    static int berthno[]=new int[20];
	    static String Gender[]=new String[20];
		static int Fare[]=new int[20];
		static String Berth[]=new String[20];
		static String detial[][]=new String[11][5];
		static int pnr=0;
		int p=0,n=0,a=0,bn=0,b=0,g=0;
	
} 
class Booking extends Passenger{
	
	public void book() {
	pnr++;
	System.out.println("Enter number passengers u book");
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{   
		Pnr[p++]=Integer.toString(pnr);
		System.out.println("Enter the passenger Name:");
		String name =s.next();
		Name[n++]=name;
		System.out.println("Enter the Passenger age:");
		int age =s.nextInt();
		 Age[a++]=age;
		 System.out.println("Enter the passenger gender:(M,F)");
			String gender =s.next();
			Gender[g++]=gender;
			System.out.println("Enter the passenger Bertn preference:(L,M,U)");
			String berth =s.next();
			Berth[b++]=berth;
			berthno[bn++]=i;
			
			
		 
	}
	}
	
	/*public void booktic(){
		pnr++ ;	
	 int k=0;
	 int j=0;
	 int n=s.nextInt();
	detial[k][j++]="PNR";
		detial[k][j++]="NAME";
		detial[k][j++]="AGE";
		detial[k][j++]="GENDER";
		detial[k][j++]="BERTH";
		detial[k][j++]="WHERE TO WHERE ";
	for(int i=0;i<n;i++)
	{
		for(j=0;j<5;j++)
		{
			if(j==0)
				detial[i][j]=Integer.toString(pnr);
			if(j==1){
				System.out.println("Enter the passenger Name:");
				String name =s.next();
			detial[i][j]=name;
			}
			if(j==2){
				System.out.println("Enter the Passenger age:");
				int age =s.nextInt();
				if(age>5)
			detial[i][j]=Integer.toString(age);}
			if(j==3){
				System.out.println("Enter the passenger gender:(M,F)");
				String gender =s.next();
			detial[i][j]=gender;
			}
			if(j==4)
			{	System.out.println("Enter the passenger Bertn preference:(L,M,U)");
				String berth =s.next();
			detial[i][j]=berth;
			}
			if(j==5){
				
			detial[i][j]="chennai to bangalore";
			}
			
			}
	}
	}*/
}
class BookedTickt extends Passenger{
	public void ShowDetials(){
	for(int i=0;i<11;i++){
		for(int j=0;j<5;j++)
		{
			System.out.print(Pnr[i]+"\t "+Name[i]+"\t "+Age[i] +"\t "+Berth[i] +"\t "+berthno[i]);
		}
		System.out.println();
			
	}
}
}
class TicAva extends Passenger{
	
public void show() {
	System.out.println("Avalablelower upper middle seat");
	System.out.println("    "+lower+"\t        "+upper+"\t    "+middle+"\t"+berth);
}
}
class Cancel extends Passenger{
	public Cancel() {
		
	}
}

