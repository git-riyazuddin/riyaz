package program;
import java.util.*;
public class Library{
	public static Scanner s=new Scanner(System.in);
	public static void main(String []args){
		Library obj=new Library();
		Admin ad=new Admin();
		User us=new User();
		//Admin ad=new Admin();
		//User us=new User();
		
		System.out.println("1.login");
		System.out.println("2.signup");
		int click=s.nextInt();
		if(click==1) 
			//Admin ad=new Admin();
		ad.Admin();
		if(click==2)
			
		us.User();
	
	}
		
/*	public void view() {
		String [] str=new String[20];
		String [] pri=new String[20];
		int [] arr=new int [20];
		int count2=0;
		int count=0;
		int count1=0;
		str[count++]="Books";
		str[count++]="Quran";
		str[count++]="Bhavathgitha";
		str[count++]="Bible";
		str[count++]="Thirukural";
		str[count++]="vedhas";
		pri[count1++]="Prize";
		pri[count1++]="Rs.1500";
		pri[count1++]="Rs.800";
		pri[count1++]="Rs.600";
		pri[count1++]="Rs.500";
		pri[count1++]="Rs.2500";
		arr[count2++]=8;
		arr[count2++]=10;
		arr[count2++]=10;
		arr[count2++]=10;
		arr[count2++]=10;
		arr[count2++]=10;

				
		for(int i=0;i<str.length;i++){
			if(i==0)
				System.out.println("s.no"+"|"+str[i]+"|"+pri[i]+"|"+"no.of.books");
			else if(str[i]!=null)
				System.out.println(i+"|"+str[i]+"|"+pri[i]+"|"+arr[i]);
		}


	}*/
	
	
	}
class Admin{
	public static Scanner s=new Scanner(System.in);
	public void Admin() {
		String userid="Mohamed";
		String pass="Riyaz@25";
		System.out.println("Enter name");
		String id=s.next();
		System.out.println("Enter password");
		String password=s.next();
		String uname=userid;
		String upassword=password;
		if((userid.equals(id))&&(pass.equals(password))){
			System.out.println("Login success fully hello "+id);
			view();
			
		}	
		else {
			System.out.println("pass word invalid");
		}
	}
		public void view() {
			String [] str=new String[20];
			String [] pri=new String[20];
			int [] arr=new int [20];
			int count2=0;
			int count=0;
			int count1=0;
			str[count++]="Books";
			str[count++]="Quran";
			str[count++]="Bhavathgitha";
			str[count++]="Bible";
			str[count++]="Thirukural";
			str[count++]="vedhas";
			pri[count1++]="Prize";
			pri[count1++]="Rs.1500";
			pri[count1++]="Rs.800";
			pri[count1++]="Rs.600";
			pri[count1++]="Rs.500";
			pri[count1++]="Rs.2500";
			arr[count2++]=8;
			arr[count2++]=10;
			arr[count2++]=10;
			arr[count2++]=10;
			arr[count2++]=10;
			arr[count2++]=10;

					
			for(int i=0;i<str.length;i++){
				if(i==0)
					System.out.println("s.no"+"|"+str[i]+"|"+pri[i]+"|"+"no.of.books");
				else if(str[i]!=null)
					System.out.println(i+"|"+str[i]+"|"+pri[i]+"|"+arr[i]);
				System.out.println("1.add");
				System.out.println("2.update");
				System.out.println("3.delete");
				int n=s.nextInt();
				
				if(n==1) {
					Add(str,pri,arr,count,count1,count2);
				}
				if(n==2) {
					Update(str,pri,arr);
				}
				if(n==3) {
					
					Delete(str,pri,arr);
				}
				if(n==4) {
					Exit();
				}
				
			}

		
	}
	public void Add(String str[],String pri[],int arr[],int count,int count1,int count2) {
		
		System.out.println("Add Book");
		System.out.println("Enter number of books add");
		int d=s.nextInt();
		
		
		for(int i=0;i<d;i++){
			str[count++]=s.next();
			pri[count1++]=s.next();
		}
		for(int i=0;i<str.length;i++){
			if(i==0)
				System.out.println("s.no"+"|"+str[i]+"|"+pri[i]);
			else if(str[i]!=null)
				System.out.println(i+"|"+str[i]+"|"+pri[i]);
		}
	
	}
	public  void Update(String str[],String pri[],int arr[]) {
		System.out.println("update");
		
			System.out.println("Enter book serial num to Update");
			int k=s.nextInt();
			
			for(int i=0;i<str.length-1;i++){
				String temp=" ";
				if(i==k){
					str[i]=s.next();
					pri[i]=s.next();
				}
		
			

	}
	}
	public  void Delete(String str[],String pri[],int arr[]) {
		System.out.println("delete");
		System.out.println("Delete book");
		System.out.println("Enter serial num of book to delete"); 
		int d=s.nextInt();
		for(int i=0;i<str.length-1;i++){
			String temp=" ";
			if(i==d){
				str[i]=temp;
				pri[i]=temp;
			}
			if(str[i]==null&&pri[i]==null)
			{
				temp=str[i];
				str[i]=str[i+1];
				str[i+1]=temp;
				temp=pri[i];
				pri[i]=pri[i+1];
				pri[i+1]=temp;
				
			}
		}
	}
		
	
	public  void Exit() {
		System.out.println("Exit");
	}
	
	
	}
class User{
	Scanner s=new Scanner(System.in);
	public void User() {
		System.out.println("user");
		Signup();
	}
	public  void Signup() {
		System.out.println("Enter your name:________________ ");
		String uname=s.next();
		System.out.println("Enter your email id:_______________");
		String mail =s.next();
		System.out.println("Enter password it must be 8 letters");
		String upassword=s.next();
		int length=upassword.length();
		if(length==8){
		System.out.println("Conform password:______________");
		String conpass=s.next();
		if(conpass.equals(upassword))
		{
			System.out.println("your user id:"+uname+"your password:"+upassword);
			Login(uname,upassword);
		}
		else
		{
			System.out.println("password is wrong");	
			Signup();
		}
		}
		else
		{
			System.out.println("password is wrong");	
			Signup();
		}
	}
	public  void Login(String userid,String pass){
		System.out.println("Enter name");
		String id=s.next();
		System.out.println("Enter password");
		String password=s.next();
		String uname=userid;
		String upassword=password;
		if((userid.equals(id))&&(pass.equals(password))){
			System.out.println("Login success fully hello "+id);
			
			view();
		}	
		else {
			System.out.println("pass word invalid");
			Login(uname,upassword);
		}
		
	

	}

		public  void view() {
			String [] str=new String[20];
			String [] pri=new String[20];
			int [] arr=new int [20];
			int count2=0;
			int count=0;
			int count1=0;
			str[count++]="Books";
			str[count++]="Quran";
			str[count++]="Bhavathgitha";
			str[count++]="Bible";
			str[count++]="Thirukural";
			str[count++]="vedhas";
			pri[count1++]="Prize";
			pri[count1++]="Rs.1500";
			pri[count1++]="Rs.800";
			pri[count1++]="Rs.600";
			pri[count1++]="Rs.500";
			pri[count1++]="Rs.2500";
			arr[count2++]=8;
			arr[count2++]=10;
			arr[count2++]=10;
			arr[count2++]=10;
			arr[count2++]=10;
			arr[count2++]=10;

					
			for(int i=0;i<str.length;i++){
				if(i==0)
					System.out.println("s.no"+"|"+str[i]+"|"+pri[i]+"|"+"no.of.books");
				else if(str[i]!=null)
					System.out.println(i+"|"+str[i]+"|"+pri[i]+"|"+arr[i]);
				
			}
			System.out.println("1.Buy");
			Buy(str,arr);
			System.out.println("2.Read");
			Read();
		
	}
	
	public void Buy(String str[],int arr[]) {
		System.out.println("Enter book serial num to Update");
		int k=s.nextInt();

		for(int i=0;i<str.length-1;i++){
			//String temp=" ";
			if(i==k){
				
				arr[i]--;
			}
		}
	}
	public void Read() {
		
	}
}