import java.util.*;
// Bus Booling Management System.
import java.util.Scanner;
public class BusBooking{
	static Scanner scan=new Scanner(System.in);
	static int m=0;
	static String admin="aslam";
	static String adminPass="aslam123";
	static String user[]=new String[18];
	static String userMail[]=new String[18];
	static String userPass[]=new String[18];
	static Passenger p[]=new Passenger[18];
	static String bus[]=new String[18];
	public static void main(String[] args){
		int scount=0, ucount=0;
		for(int i=0;i<bus.length;i++){
			if(i<12)
				bus[i]="s"+(++scount);
			else
				bus[i]="u"+(++ucount);
		}
		content();
	}
	
	public static void content(){
		System.out.println("1.Create Account.\n2.Login Account.\n3.Exit.");
		int n=scan.nextInt();
		switch(n){
			case 1: 
				createAccount();
				break;
			case 2:
				loginAccount(p,bus);
				break;
			case 3:
				return;
		}
	}
	
	public static void createAccount(){
		int k=m++;
		System.out.println("Enter your name : ");
		user[k]=scan.next();
		System.out.println("Enter email Id : ");
		userMail[k]=scan.next();
		System.out.println("Enter password : ");
		userPass[k]=scan.next();
		loginAccount(p,bus);
	}
	
	public static void loginAccount(Passenger p[], String bus[]){
		System.out.println("---LOGIN PAGE---");
		System.out.println("Enter your name : ");
		String name1=scan.next();
		System.out.println("Enter your password : ");
		String pwd=scan.next();
		if((name1.equals(admin))&&(pwd.equals(adminPass))){
			adminPage(p);
		}
		else{
			for(int i=0;i<user.length;i++){
				if((user[i].equals(name1))&&(userPass[i].equals(pwd))){
					System.out.println("Logged In Successfully!");
					userPage(p,bus,0);
				}
				else{
					System.out.println("Invalid username or password!");
					loginAccount(p,bus);
				}
			}
		}				
	}
	
	public static void adminPage(Passenger p[]){
		System.out.println("----ADMIN PAGE----");
		System.out.println("1.Passenger Details.\n2.Exit.");
		int n=scan.nextInt();
		if(n==1)
			Bus.passengerDetails(p);
		else 
			content();
	}
	
	public static void userPage(Passenger p[], String bus[], int index){
		System.out.println("----USER PAGE----");
		System.out.println("1.Book Ticket.\n2.Cancel Ticket.\n3.Available Tickets.\n4.Exit.");
		int n=scan.nextInt();
		switch(n){
			case 1:
				Bus.bookTicket(p,bus);
				break;
			case 2:
				Bus.cancelTicket(p,bus,index);
				break;
			case 3:
				Bus.availableTickets(p,bus,index);
				break;
			case 4:
				content();
		}
	}
}


class Passenger{
	String name;
	int age;
	String gender;
	String mobileNo;
	String mailId;
	String berth;
	String pickUp;
	String dropUp;
	
	
	public Passenger(String name, int age, String gender, String mobileNo, String mailId, String berth, String pickUp, String dropUp){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.mobileNo=mobileNo;
		this.mailId=mailId;
		this.berth=berth;
		this.pickUp=pickUp;
		this.dropUp=dropUp;
	}
	
	public String toString(){
		return name+"\t"+age+"\t"+gender+"\t"+berth+"\t"+pickUp+"\t"+dropUp;
	}
		
}

class Bus{
	static int i=0;
	static Scanner scan=new Scanner(System.in);
	
	public static void bookTicket(Passenger p[], String bus[]){
		System.out.println("--Ticket Booking Page--");
		//int j=i++;
		System.out.println("Enter passenger name : ");
		String name=scan.next();
		System.out.println("Enter passenger age : ");
		int age=scan.nextInt();
		System.out.println("Enter passenger gender : ");
		String gender=scan.next();
		System.out.println("Enter passenger mobile number : ");
		String mobileNo=scan.next();
		System.out.println("Enter passenger email id : ");
		String mailId=scan.next();
		System.out.println("Enter berth : ");
		String berth=scan.next();
		System.out.println("Enter pickUp place : ");
		String pickUp=scan.next();
		System.out.println("Enter dropUp place : ");
		String dropUp=scan.next();
		p[i++]=new Passenger(name,age,gender,mobileNo,mailId,berth,pickUp,dropUp);
		int index=0;
		for(int k=0;k<bus.length;k++){
			if(bus[k].equals(berth)){
				bus[k]="  ";
				index=k;
			}
		}
		BusBooking.userPage(p,bus,index);
	}
	
	public static void cancelTicket(Passenger p[], String bus[], int index){
		System.out.println("--Ticket Canceling Page--");
		System.out.println("Enter your name : ");
		String name1=scan.next();
		System.out.println("Enter your mobile number : ");
		String mobile=scan.next();
		for(int j=0;j<18;j++){
			System.out.println("Inside if");
			if((p[j].name.equals(name1))&&(p[j].mobileNo.equals(mobile))){
				
				bus[index]=p[j].berth;
				p[j]=null;
			}
		}
		BusBooking.userPage(p,bus,index);
	}
	
	public static void availableTickets(Passenger p[], String bus[], int index){
		for(int i=0;i<bus.length;i++){
			if(i%2==0)
				System.out.print(bus[i]+"\t");
			else
				System.out.println(bus[i]);
		}
		BusBooking.userPage(p,bus,index);
	}
	
	public static void passengerDetails(Passenger p[]){
		for(int i=0;i<18;i++)
			if(p[i].name!=" ")
				System.out.println(p[i]);
		BusBooking.adminPage(p);
	}
	
}