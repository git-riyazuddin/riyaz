package Diwali;

import java.util.Scanner;

public class BusBooking {
	static Scanner s=new Scanner(System.in);
	static Data d[]=new Data[18];
	static boolean upper[]=new boolean[6];
	static boolean lower[]=new boolean[12];
	public static void main(String[] args) {
		System.out.println(" 1 for Admin \n 2 for user \n 3 for logout");
		int n=s.nextInt();
		if(n==1)
		{
		Admin.view();	
		}
		
		else if(n==2)
		{
			User.show();
		}
		else 
		{
			System.out.println("exit");
		}
	}
}
class Admin extends BusBooking{
	final static String Admin="Riyaz";
	final static String Password="Deen2508";
	public static void view() {
		String name=s.next();
		String pass=s.next();
		if(name.equals(Admin)&&pass.equals(Password)) {
		for(int i=0;i<18;i++) {
			if(d[i]!=null)
			System.out.println(d[i]);
		}
		BusBooking.main(null);
		
		}
		else {
			System.out.println("Your Password or your user id must be wrong");
			view();
		}
		
	}
}
class User extends BusBooking{
	static int k=0;
	public static void show() {
		for(int i=0;i<12;i++) {
			if(lower[i]!=true)
			System.out.println("l"+(i+1));
		}
		for(int i=0;i<6;i++) {
			if(upper[i]!=true)
			System.out.println("u"+(i+1));
		}
		user();
		
	}
	public static void user() {
		System.out.println("1.book \n 2.cancel \n 3.show your booked tickets");
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
			view();
		}
		else
		{
			BusBooking.main(null);
		}
	}
	public static void view() {
		System.out.println("Enter your name : ");
		String name1=s.next();
		System.out.println("Enter your mobile number : ");
		String mobile=s.next();
		for(int j=0;j<18;j++){
			if((d[j].name.equals(name1))&&(d[j].mobileNo.equals(mobile))){
				System.out.println(d[j]);
				break;
			}
		}
		show();
	}
	public static void book() {
		System.out.println("1 upper seat \n 2.lower set");
		int n=s.nextInt();
		if(n==1) {
			lower();
		}
		if(n==2) {
			upper();
		}
		
		
	}
	public static void lower() {
		System.out.println("Enter ur seat no to book ticket");
		int n=s.nextInt();
		if(lower[n-1]==false) {
			System.out.println("Enter passenger name : ");
			String name=s.next();
			System.out.println("Enter passenger age : ");
			int age=s.nextInt();
			System.out.println("Enter passenger gender : ");
			String gender=s.next();
			System.out.println("Enter passenger mobile number : ");
			String mobileNo=s.next();
			System.out.println("Enter passenger email id : ");
			String mailId=s.next();
			System.out.println("Enter berth : ");
			String berth=s.next();
			System.out.println("Enter seat no:");
			int seatno=n;
			System.out.println("Enter pickUp place : ");
			String pickUp=s.next();
			System.out.println("Enter dropUp place : ");
			String dropUp=s.next();
			d[k++]=new Data(name,age,gender,mobileNo,mailId,berth,pickUp,dropUp,seatno);
			lower[n-1]=true;
		}
		else {
			System.out.println("this is already booked");
			lower();
		}
		show();
	}
	public static void cancel() {
		System.out.println("Enter 1 for upper 2 for lower");
		int n=s.nextInt();
		System.out.println("Enter your name : ");
		String name1=s.next();
		System.out.println("Enter your mobile number : ");
		String mobile=s.next();
		for(int j=0;j<18;j++){
			if((d[j].name.equals(name1))&&(d[j].mobileNo.equals(mobile))){
				int se=d[j].seatno;
				if(n==1) {
				upper[se-1]=false;
				System.out.println("your booking as been canceled amout will refund in 2 days");
				}
				if(n==2) {
				
					lower[se-1]=false;
				System.out.println("your booking as been canceled amout will refund in 2 days");
				}d[j]=null;
				break;
			}
		}
		show();
	}
	public static void upper() {
		System.out.println("Enter ur seat no to book ticket");
		int n=s.nextInt();
		if(upper[n-1]==false) {
			System.out.println("Enter passenger name : ");
			String name=s.next();
			System.out.println("Enter passenger age : ");
			int age=s.nextInt();
			System.out.println("Enter passenger gender : ");
			String gender=s.next();
			System.out.println("Enter passenger mobile number : ");
			String mobileNo=s.next();
			System.out.println("Enter passenger email id : ");
			String mailId=s.next();
			System.out.println("Enter berth : ");
			String berth=s.next();
			System.out.println("Enter seat no:");
			int seatno=n;
			System.out.println("Enter pickUp place : ");
			String pickUp=s.next();
			System.out.println("Enter dropUp place : ");
			String dropUp=s.next();
			d[k++]=new Data(name,age,gender,mobileNo,mailId,berth,pickUp,dropUp,seatno);
			upper[n-1]=true;
		}
		else {
			System.out.println("this is already booked");
			upper();
		}
		show();
	}

	}


class Data{
	String name;
	int age;
	String gender;
	String mobileNo;
	String mailId;
	String berth;
	String pickUp;
	String dropUp;
	int seatno;
	
	
	public Data(String name, int age, String gender, String mobileNo, String mailId, String berth, String pickUp, String dropUp,int seatno){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.mobileNo=mobileNo;
		this.mailId=mailId;
		this.berth=berth;
		this.pickUp=pickUp;
		this.dropUp=dropUp;
		this.seatno=seatno;
	}
	
	public String toString(){
		return name+"\t"+age+"\t"+gender+"\t"+berth+"\t"+pickUp+"\t"+dropUp+"\t"+seatno;
	}
}

