import java.util.Scanner;
public class LogPage{
public static Scanner s=new Scanner(System.in);
public static void main(String[]args){
	System.out.println("ENTER 1 FOR ADMIN");
	System.out.println("ENTER 2 FOR USER");
	int n=s.nextInt();
	switch(n){
		case 1:
		    Admin();
			break;
		case 2:
	        User();
			break;
}
}
public static void Admin(){
	System.out.println("ENTER 1 FOR CREATE ACCOUNT");
	System.out.println("ENTER 2 FOR LOGIN ACCOUNT");
	int n=s.nextInt();
	switch(n){
		case 1:
			SignUp();
			break;
		case 2:
			String name="Mohamed";
			String password="MOha@001";
			SignIn(name,password);	
			break;
}
}
public static void User(){
	System.out.println("ENTER 1 FOR CREATE ACCOUNT");
	System.out.println("ENTER 2 FOR LOGIN ACCOUNT");
	int n=s.nextInt();
	switch(n){
		case 1:
			SignUp();
			break;
		case 2:
			String name="Deen";
			String password="Deen@001";
			SignIn(name,password);	
			break;
}	
//User.SignIn(String name,String password);
}
public static void SignIn(String name,String password){
	String id,lp;
	System.out.println("ENTER UR Name");
	id=s.next();
	if(id.equals(name)){
		System.out.println("ENTER PASSWORD");
		lp=s.next();
		if(lp.equals(password)){
			System.out.println("WELCOME"+id);
		}
		else{
			System.out.println("PASSWORD IN VALID");
		}
	}
	else{
		System.out.println("YOUR PASSWORD OR USER ID IS INVALID");
		SignIn(name,password);
	}	
}
public static void SignUp(){
}
}