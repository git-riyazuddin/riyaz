import java.util.*;
class Zcoin{
	static Scanner s=new Scanner(System.in);
	static int k=0;
	public static void main(String[]args){
		System.out.println("Enter 1.Admin 2.user 3.Exit
		int n=s.nextInt();
		
		
	}	
	
	
}
class Data{
	String name;
	String mail;
	String mobile;
	String Id;
	String password;
	double curr;
	public Data(String name,String mail,String mobile,String Id,String password,double curr){
		this.name=name;
		this.mail=mail;
		this.mobile=mobile;
		this.Id=Id;
		this.password=password;
		this.curr=curr;
		}
		public String toString(){
			return name+" "+mail+" "+mobile+" "+" "+Id+" "+password+" "+curr;
		}
	}
class detials extends data{
	static Scanner s=new Scanner(System.in);
	public static String name(){
		String name=s.next();
		for(int i=0;i<50;i++){
			if((d[i].name).equals(name))
			{
				System.out.println("this user name already entered");
				System.out.println("reenter ur name");
				return name();
			}
		return name;
	}
	}
	public static String mail(){
		String mail=s.next();
		for(int i=0;i<50;i++){
			if((d[i].mail).equals(mail))
			{
				System.out.println("this user mail id already entered");
				System.out.println("reenter ur mail");
				return mail();
			}
		return mail;
	
	}
	}
	public static String Id(){
		String Id=s.next();
		for(int i=0;i<50;i++){
			if((d[i].Id).equals(Id))
			{
				System.out.println("this user id already entered");
				System.out.println("re enter ur Id");
				return Id();
			}
		return Id;
	}
	}
	public static void mobile(){
		String mobile=s.next();
		for(int i=0;i<50;i++){
			if((d[i].mobile).equals(mobile))
			{
				System.out.println("this user mobile already entered");
				System.out.println("reenter ur mobile num");
				return mobile();
			}
		return mobile;
	}
	}
	public static String password(){
		String password=s.next();
		if(valid(password)){
		if(repass(password))
		return password;
	else 
		return password();}
	else{
		System.out.println("ur password is not valid");
		return password();
	}
	}
	public static boolean repass(String pass){
		String password=s.next();
		if(password.equals(pass))
			return true;
		else
			return false;
	}
	public static boolean valid(String password){
		if(password.length()<8)
			return false;
		int up=0,low=0,spl=0,num=0;
		//char c[]=password.toCharArray();
		for(int i=0;i<password.length();i++){
			if(password.charAt(i)>='a'&&password.charAt(i)<='z')
				low++;
			else if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
				up++;
			else if(password.charAt(i)>='0'&&password.charAt(i)<='9')
				num++;
			else if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='%'||password.charAt(i)=='$'||password.charAt(i)=='?'||password.charAt(i)=='&'||password.charAt(i)=='*'||password.charAt(i)=='<'||password.charAt(i)=='>')
				spl++;
		}
		if(low>1&&up>1&&num>1&&spl>1&&password.length()>=8)
		
		return true;
		else
			return false;
		
	}
	}
	
class Admin extends data{
	static Scanner =new Scanner(System.in);
	private String name="Riyaz@gmail.com";
	private String pass="Deen#2508";
	static int rate=2;
	public void Login(){
		System.out.println("Enter ur id");
		String id=s.next();
		System.out.println("Enter ur password");
		String password=s.next();
		if(id.equals(name))
		{
			if(password.equals(pass)){
				Adminpage();
			}
			else{
				System.out.println("Enter ur password");
				Login();
			}
		}
		else
		{
		System.out.println("Enter ur id invalid ");
		Login();
		}
	}
	public static void Adminpage(){
		System.out.println("Enter");
		int n=s.nextInt();
		Switch(n){
			case 1:
			view();
			case 2:
			rate();
			case 3:
			return Login();
	}
	public static void view(){
		return Adminpage
	}
	public static void rate(){
		System.out.println("Enter rate of exchange")
		rate=s.nextInt();
		return Adminpage
	}
	
}
class user extends data{
	static Scanner =new Scanner(System.in);
	static int k=0
	public static void Userpage(){
		System.out.println("Enter 1.Signup 2.signin 3.Exit");
		int n=s.nextInt();
		Switch(n){
			case 1:
			{Signup();
			break;
			}
			case 2:{
			signin();
			break;}
			case 3:
			return Zcoin.main(null);
	}
	public static void Signup(){
		
		Data d[]=new Data[50];
			System.out.println("Enter ur name");
			String name=detials.name();
			System.out.println("Enter ur mail");
			String mail=detials.mail();
			System.out.println("Enter ur mobile");
			String mobile=detials.mobile();
			System.out.println("Enter ur goverment Id");
			String Id=detials.Id();
			System.out.println("Enter ur password");
			String password=detials.password();
			System.out.println("Enter ur real currancy deposite");
			double curr=s.nextDouble();
			d[k++]=new Data(name,mail,mobile,Id,password,curr);
			Signin();
		}
	}
	
}	
class signin{
	
	
}
