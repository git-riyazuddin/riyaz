import java.util.*;
public class Library{
	public static void main(String []args]{
		Library obj=new Library();
		Scanner s=new Scanner(System.in);
		String userid="Mohmed";
		String password="Riyaz@25";
		System.out.println("login");
		System.out.println("signup");
	public static void Login(String userid,String pass){
		String id=s.next();
		String password=s.next();
		if((userid.equals(id))&&(pass.equals(password))){
			System.out.println("Login success fully hello "+id);
			obj.Admin();
		}	
		else if((uid.equals(id))&&(upass.equals(password))){
			System.out.println("Login successfully hello"+id);
			obj.User();
		}
		else{
			System.out.println("password invalid");
			
		}
	}
	}
	public static void signup(){
		System.out.println("Enter your name:________________ ");
	String uid=s.next();
	System.out.println("Enter your email id:_______________");
	String mail =s.next();
	System.out.println("Enter password it must be 8 letters");
	String upass=s.next();
	int length=8;
	if(password.length().equals(length)){
	System.out.println("Conform password:______________");
	String conpass=s.next();
	if(conpass.equals(password))
	{
		System.out.println("your user id:"+name+"your password:"+password);
		Login(name,password);
	}
	}
	else
	{
		System.out.println("password is wrong");
			obj.signup();
	}

	}
}
class View{
	String [] str=new String[20];
	String [] pri=new String[20];
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
	for(int i=0;i<str.length;i++){
		if(i==0)
			System.out.println("s.no"+"|"+str[i]+"|"+pri[i]);
		else if(str[i]!=null)
			System.out.println(i+"|"+str[i]+"|"+pri[i]);
	}
	
}
class Admin{
	
	System.out.println("******ADMIN PAGE**********");
	System.out.println("view");
	System.out.println("add");
	System.out.println("upadte");
	System.out.println("delete");
	public void Add(){
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
public void Upadte()
	{
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
public void Delete(){
	System.out.println("Delete book");
	System.out,println("Enter serial num of book to delete"); 
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


class User{
	System.out.println("******USER PAGE**********");
	User us=new User();
	System.out.println("view");
	System.out.println("buy");
	System.out.println("read");
	String select=s.next();
	if(select.equals(view)){
		us.View();
	}
	public void Buy(){
		System.out.println("Enter book serial num to buy");
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
		System.out.println("Book brougth");
}
	}
	public void Read(){
		System.out.println("This book has good quality ");
	}
/*class Buy extends User{
	System.out.println("Enter book serial num to buy");
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
System.out.println("Book brougth");
}
class content extends user{
	System.out.println("This book has good quality ");
}*/
/*class Add extends Admin{
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
	class Delete extends Admin{
	System.out.println("Delete book");
	System.out,println("Enter serial num of book to delete"); 
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
class update extends Admin{
	System.out.println("Enter book serial num to Update");
	int k=s.nextInt();
	
	for(int i=0;i<str.length-1;i++){
		String temp=" ";
		if(i==k){
			str[i]=s.next();
			pri[i]=s.next();
		}
}

}*/

