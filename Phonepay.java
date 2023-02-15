i

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payapp {
	static List<Detials> li=new ArrayList<>();
	static Scanner s=new Scanner(System.in);
	static List<List<Hist>> his=new ArrayList<>(); 
public static void main(String[] args) {

	con();
	
}
public static void con() {
	
	System.out.println("1. login \n 2.register");
	int n=s.nextInt();
	if(n==1)
	{
	SignIn();	
	}
	else if(n==2){
		areg();
	}
}
public static void SignIn(){
	if(li.size()<0) {
	String name=s.next();
	String password=s.next();
	
	for(int i=0;i<li.size();i++) {
		String us=li.get(i).id;
		String pas=li.get(i).Password;
		if(name.equals(us)&&password.equals(pas)) {
			MyApp.MyApp(i);
		}
	}
	}
	else
		con();
		
}
public static void areg(){
	String name=s.next();
	String phone =s.next();
	String bank=s.nextLine();
	String accnumber=s.next();
	double balance=10000;
	String Pass=pas();
	String id=phone+"@upi";
	li.add(new Detials(name,id,phone,bank,accnumber,Pass,balance));
	System.out.println("Your upi id is"+id+"\n your password:"+Pass);
	SignIn();
}
public static String pas() {
	String pas=s.next();
	String conpass=s.next();
	if(pas.equals(conpass))
		return pas;
	System.out.println("Password has been worng re try it:");
	return pas();
}
} 
class MyApp extends Payapp{
	
	public static void MyApp(int i) {
	System.out.println("1.Transaction 2.Balance 3.History 4.Exit");
	int n=s.nextInt();
	if(n==1) {
	Trans(i);	
	}
	else if(n==2) {
		bal(i);
	}
	else if(n==3) {
		his(i);
	}
	else {
		con();
	}
	}
	public static void Trans(int i) {
		System.out.println("1.self 2.own bank 3.others 4.return");
		int n=s.nextInt();
		if(n==1) {
			
			self(i);
		}
		else if(n==2) {
			own(i);
		}
		else if(n==3) {
			other(i);
		}
		else {
			MyApp(i);
		}
	}
	public static void self(int i) {
		String name=s.next();
		List<Hist> hi=new ArrayList<>();
		hi.add( new Hist("988381928@upi", "bank of india", name, 10000));
		his.add(i,hi);
	}
public static void own(int i) {
	String name=s.next();
	List<Hist> hi=new ArrayList<>();
	hi.add( new Hist("988381928@upi", "bank of india", name, 10000));
	his.add(i,hi);
	}
public static void other(int i) {
	String name=s.next();
	List<Hist> hi=new ArrayList<>();
	hi.add( new Hist("988381928@upi", "bank of india", name, 10000));
	his.add(i,hi);
}
	public static void bal(int i) {
		System.out.println(li.get(i).balance);
		System.out.println("Enter 1 to return");
		int n=s.nextInt();
		if(n==1) {
			MyApp(i);
		}
	}
	public static void his(int i) {
		for(int j=0;j<his.get(i).size();j++) {
			System.out.println(his.get(i).get(j));
		}
		System.out.println("Enter 1 to return");
		int n=s.nextInt();
		if(n==1) {
		MyApp(i);
	}
	}
	
}
class Hist{
	String id;
	String bank;
	String name;
	double amount;
	public Hist(String id,String bank,String name,double amount) {
	this.id=id;
	this.bank=bank;
	this.name=name;
	this.amount=amount;
	}
	
	public String toString() {
		return id+"\t"+name+"\t"+bank+"\t"+amount;
	}
	
}
class Detials{
String Name;
String phone;
String bank;
String Password;
String accnumber;
String id;
double balance;
public Detials(String Name,String id,String phone,String bank,String accnumber,String Password,double balance){
	this.Name=Name;
	this.phone=phone;
	this.Password=Password;
	this.bank=bank;
	this.accnumber=accnumber;
	this.balance=balance;
	this.id=id;
}
public String toString(){
	return Name+"\t"+phone+"\t"+bank+"\t"+accnumber+"\t"+balance;
}

}

