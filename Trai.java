package oops;
import java.util.*;
class Train
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int a=0;
		do
		{
		System.out.println("Enter the option as \n1.AvailableTicket \n2.BookTicket \n3.CancelTicket \n4.BookedTicket  \n5.Exit");
		 a=scan.nextInt();
		switch(a)
		{
			case 1:
		    AvaTic At=new AvaTic();
			At.showDetails();
			break;
			case 2:
			TicketBook Bt=new TicketBook();
			Bt.Book();
			break;
			case 3:
				TicketBook bo=new TicketBook();
			bo.Cancel();
			break;
			case 4:
			Booked Bdt=new Booked();
			Bdt.showTicket();
			break;
		}
		}while(a!=5);
	}
}
class PassDetails
{
       Scanner scan=new Scanner(System.in);
	   String Origin;
	   String Destination;
	 static   int upper=2;
	 static  int lower=2;
	 static int middle=2;
	 static int totalseat=6;
	 static int totalticket=10;
	 static int Rac=2;
	 static  int wl=2;
		static String Pnr[]=new String[20];
		static String Name[]=new String[20];
		static int Age[]=new int[20];
	    static int Seatno[]=new int[20];
	    static String Gender[]=new String[20];
		static int Fare[]=new int[20];
		static String Berth[]=new String[20];
		static int si[]=new int[20];
	
}
class TicketBook extends PassDetails
{
	 static  int pvalue=1;
	 static String pnr;
	 static int count=0;
	 static int seno=0;
	 static int sino=1;
	static TicketBook obj=new TicketBook();
	void Book()
	{
		System.out.println("Enter how many ticket you want to book");
		int n=scan.nextInt();
		if(seno<=6)
		{
			pnr=Integer.toString(pvalue);
	    obj.setTicket(n,pnr);
		}
		if(wl==0)
		
			System.out.println("No ticket available");
	}
	void setTicket(int n,String pnr)
	{
			for(int i=0;i<n;i++)
		{   si[count]=sino++;
			Pnr[count]=pnr;
			System.out.println("Enter the Passenger Name");
			String na=scan.next();
			Name[count]=na;
			System.out.println("Enter the Passenger Age");
		    int ag=scan.nextInt();
			Age[count]=ag;
			if(ag>5)
			Seatno[count]=++seno;
		   else 
			   Seatno[count]=seno;
			System.out.println("Enter the Passenger Gender:(m/f)");
			String gen=scan.next();
			Gender[count]=gen;
			if(ag>5)
				Fare[count]=400;
			else
				Fare[count]=200;
			if(lower==0&&middle==0&&upper==0&&Rac==0)
			{
				Berth[count]="WL";
				--wl;
			}
			else if(lower==0&&middle==0&&upper==0) {
				Berth[count]="Rac";
				--Rac;
			}
			
			
			
			boolean check=false;
			
			if(totalseat>0)
			{
			if(ag>60)
			{
			 check=lower!=0?true:false;
			if(check==true)
			{
				Berth[count]="Lower";
				--lower;
				--totalseat;
			}
			else
			{
			System.out.println("No Lower Available");
             obj.berthPreference(count);			 
			}
			}
			else
			{
			if(ag>5)
			{
			obj.berthPreference(count);
			}
			else
				Berth[count]="no Berth";
			}
			}
			
			++count;
			
		}
			
		++pvalue;
		System.out.println("Ticket Booked Sucessfully");
	}
	void berthPreference(int count)
	{
		System.out.println("Enter the Berth Preference as 1.Lower 2.Middle 3.Upper ");
			int pref=scan.nextInt();
			--totalseat;
			switch(pref)
			{
				case 1:
				obj.lower(count);
				break;
				case 2:
				obj.middle(count);
				break;
				case 3:
				obj.upper(count);
				break;
				
			}
	}
	void lower(int count)
	{
		if(lower!=0)
		{
			Berth[count]="Lower";
          --lower;
		}
		else
			obj.upper(count);
	}
     	void upper(int count)
	{
		if(upper!=0)
		{
			Berth[count]="Upper";
		--upper;
		}
		else
			obj.middle(count);
	}	
    void middle(int count)
	{
		if(middle!=0)
		{
			Berth[count]="Middle";
		--middle;
		}
		else
			obj.lower(count);
	}
    void Cancel() {
System.out.println("Enter your sino to cancel your ticket:");
    	int n=scan.nextInt();
    	for(int i=0;i<Name.length;i++) {
    		
    		if(Seatno[i]==n) {
    			Pnr[i]="null";
    			Name[i]="null";
    			Age[i]=0;
    			Gender[i]="null";
    			Fare[i]=0;
    			if(Pnr[i]=="null") {
    			for(int j=0;j<Seatno.length;j++) {
    			if(Seatno[j]==7) {
    				String temp=" ";
    				int temp2=0;
    				Pnr[i]=Pnr[j];
    				Pnr[j]=Pnr[j+2];
    				Name[i]=Name[j];
    				Name[j]=Name[j+2];
    				Age[i]=Age[j];
    				Age[j]=Age[j+2];
    				Gender[i]=Gender[j];
    				Gender[j]=Gender[j+2];
    				Fare[i]=Fare[j];
    				Fare[j]=Fare[j+2];
    				Fare[j+2]=0;
    				break;
    			}
    			
    				
    			}
    			}
    			
    		}
    		
    	}
    }
}

class Booked extends PassDetails
{
	void showTicket()
	{
		System.out.print("si \t Pnr \t Name \t Age \t Seatno \t Gender \t Fare \t Berth\n");
		for(int i=0;i<Name.length;i++)
		{	
		if(Fare[i]!=0)
		{
		System.out.print(si[i]+"\t    "+Pnr[i]+"\t   "+Name[i]+"\t      "+Age[i]+"\t      "+Seatno[i]+"\t    "+Gender[i]+"\t       "+Fare[i]+"\t    "+Berth[i]+"\n");
        }
		}
	}
}

class AvaTic extends PassDetails
{
	void showDetails()
	{
	 System.out.println("No.of.Lower No.of.Upper No.of.Middle Total seats");
	 System.out.println("    "+lower+"\t        "+upper+"\t    "+middle+"\t"+totalseat);
	}
}
