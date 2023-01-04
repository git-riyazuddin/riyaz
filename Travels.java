import java.util.*;
class Travels{
	static Scanner s=new Scanner(System.in);
	static Data data[]=new Data[18];
	static boolean upper[]=new boolean[6];
	static boolean lower[]=new boolean[12];
	public static void main(String []args){
		System.out.println("Enter 1 for Admin \n 2 for user \t 3 for logout");
		int n=s.nextInt();
		if(n==1)
			Admin.login();
		else if(n==2)
			User.user();
		else 
		{
			System.out.println("exit");
		}
	}
	

}
class Data{
	String name;
	int age;
	String phone;
	String email;
	String seat;
	int seatno;
	
	public Data(String name,int Age,String phone,String email,String seat,int seatno)
	{
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.email=email;
		this.seat=seat;
		this.seatno=seatno;
	}
	public String toString(){
		return name+"\t"+age+"\t"+phone+"\t"+email+"\t"+seat+"\t"+seatno;
	}
}
class Admin extends Travels{
	final static String Admin="Riyaz";
	final static String Password="Deen2508";
	public static void login(){
		String name=s.next();
		String pass=s.next();
		if(name.equals(Admin)&&pass.equals(Password))
		{
			page();
		}
		else
		{
			System.out.println("Your Password or your user id must be wrong");
			login();
		}
}
	public static void page(){
		System.out.println("Enter 1 for view All tickets booked"+"\n"+"2 for log out");
		int n=s.nextInt();
		if(n==1){
			for(int i=0;i<18;i++)
			{	if(!data[i].equals(null))
				System.out.println(data[i]);
			}
			page();
		}
		if(n==2){
			Travels.main(null);
		}
	}
}
class User extends Travels{
	static int i=0;
	public static void user(){
	System.out.println("Enter 1.book \n 2.cancel \n 3.show your tickets");
	int n=s.nextInt();
	if(n==1)
	{
		book();
	}
	else if(n==2)
	{
		cancel();
	}
	else if(n==3)
	{
		//view();
	}
	else
	{
		Travels.main(null);
	}
	}
	public static void cancel(){
		System.out.println("Enter 1 for upper 2 for lower");
		int n=s.nextInt();
		System.out.println("Enter ur name and Your phone number to cancel ticket");
		String name=s.next();
		String phone=s.next();
		for(int i=0;i<18;i++){
			if(name.equals(data[i].name)&&phone.equals(data[i].phone))
			{
			if(n==1){
				upper[(data[i].seatno)-1]=false;
				data[i].name=" ";
				System.out.println("your ticket as been cancel yor money will refund in 1 Or 2 days");
			}
			else if(n==2){
				lower[(data[i].seatno)-1]=false;
				System.out.println("your ticket as been cancel yor money will refund in 1 Or 2 days");
				data[i].name=" ";
			}
			}
		}
	}
	public static void bookcheck(){
		
	 boolean lb=lower();
	 boolean ub=upper();
	if(ub==true||lb==true)
	{
		book();		
	}
	else{
		System.out.println("Seats are full");
		Travels.main(null);
	}
	}
	public static void book(){
		for(int i=0;i<12;i++)
		{
			if(i%2==0)
				System.out.print("b"+(i+1)+"\t");
			else
				System.out.println("b"+(i+1));
		}
		for(int i=0;i<6;i++)
		{
			if(i%2==0)
				System.out.print("u"+(i+1)+"\t");
			else
				System.out.println("u"+(i+1));
		}
		System.out.println("");
		
		
	}
	//public static void 
	
	
	public static boolean lower(){
		for(int i=0;i<12;i++)
		{
			if (lower[i]==false)
				return true;
		}
		return false;
	}
	public static boolean upper(){
		for(int i=0;i<12;i++)
		{
			if (lower[i]==false)
				return true;
		}
		return false;
	}
	
	
}