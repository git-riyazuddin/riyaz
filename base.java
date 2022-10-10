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

static String detial[][]=new String[11][5];
package oops;
import java.util.Scanner;
public class Trainres {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.Book \n2.Cancel \n3.Available Tickets \n4.Booked Tickets \n5.Exit");
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
		
		static int pnr=1;
		int count=0;
		static int seno=1;
} 
class Booking extends Passenger{
	public void book() {
	System.out.println("Enter number passengers u book");
	int n=s.nextInt();
	if(n<11) {
		for (int i=0;i<n;i++) {
		Pnr[count]=Integer.toString(pnr);
		System.out.println("Enter the Passenger Name");
		String na=s.next();
		Name[count]=na;
		System.out.println("Enter the Passenger Age");
	    int ag=s.nextInt();
		Age[count]=ag;
		if(ag>5)
		berthno[count]=seno++;
	   else 
		   berthno[count]=0;
		System.out.println("Enter the Passenger Gender");
		String gen=s.next();
		Gender[count]=gen;
		if(ag>5)
			Fare[count]=400;
		else
			Fare[count]=200;
		boolean check=false;
		if(berth>0)
		{
		if(ag>60)
		{
		 check=lower!=0?true:false;
		if(check==true)
		{
			Berth[count]="Lower";
			--lower;
			--berth;
		}
		else
		{
		System.out.println("No Lower Available");
         berthPreference(count);			 
		}
		}
		else
		{
		if(ag>5)
		{
		berthPreference(count);
		}
		else
			Berth[count]="no Berth";
		}
		}
		++count;
	}
	++pnr;
	System.out.println("Ticket Booked Sucessfully");
	}
	else {
		Booking bt=new Booking();
		book();	
	}
	}
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper ");
			int pref=s.nextInt();
			--berth;
			switch(pref)
			{
				case 1:
				lowerBerth(count);
				break;
				case 2:
				middleBerth(count);
				break;
				case 3:
				upperBerth(count);
				break;
			}
	}
	void lowerBerth(int count)
	{
		if(lower!=0)
		{
			Berth[count]="Lower";
          --lower;
		}
		else
			upperBerth(count);
	}
     	void upperBerth(int count)
	{
		if(upper!=0)
		{
			Berth[count]="Upper";
		--upper;
		}
		else
			middleBerth(count);
	}	
    void middleBerth(int count)
	{
		if(middle!=0)
		{
			Berth[count]="Middle";
		--middle;
		}
		else
			lowerBerth(count);
	}
	}
class BookedTickt extends Passenger{
	public void ShowDetials(){
	for(int i=0;i<Name.length;i++) {	
		if(Fare[i]!=0) {
			System.out.print(Pnr[i]+"\t "+Name[i]+"\t "+Age[i] +"\t "+Berth[i] +"\t "+berthno[i]+"\t "+Fare[i]);
			System.out.println();
	}
	}
}
}
class TicAva extends Passenger{
	
public void show() {
	
	System.out.println("Avalablelower upper middle seat");
	System.out.println("    "+lower+"\t        "+upper+"\t    "+middle+"\t"+berth);
	System.out.println("Available Sleeper RAC Waitinglist");
	System.out.println("    "+berth+"\t      "+Rac+"\t     "+wl);
}
	
}
class Cancel extends Passenger{
	public Cancel() {
		
	}
}