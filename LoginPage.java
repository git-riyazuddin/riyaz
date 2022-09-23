import java.util.Scanner;
public class LoginPage{
public static String a[]=new String[10];
public static Scanner s=new Scanner(System.in);
public static void main(String args[]){

int n=0;
System.out.println("Enter 0 for admin");
System.out.println("Enter 1 for user");
System.out.println("Enter 2 for exit");
n=s.nextInt();
switch(n){
case 0:
admin(n);
System.out.println("Hello Admin");
break;
case 1:
user(n);
System.out.println("welcome");
break;
case 2:
System.out.println("Thank you");

}}
public static void admin(int n1)
{
System.out.println("Enter 0 for signin");
System.out.println("Enter 1 for signup");
n1=s.nextInt();
switch(n1){
case 0:
String name="Mohamed";
String email="mohaed@gmail.com";
String password="MOha@001";
char p[]=password.toCharArray();
for(int i=0;i<p.length;i++)
{
	p[i]=password.charAt(i);
}
signin(name,p,email);
break;
case 1:
signup(n1);
break;}
}
public static void user(int n1)
{
System.out.println("Enter 0 for signin");
System.out.println("Enter 1 for signup");
n1=s.nextInt();
switch(n1){
case 0:
String name="Deen";
String email="deen@gmail.com";
String password="Deen@001";
char p[]=password.toCharArray();
for(int i=0;i<p.length;i++)
{
	p[i]=password.charAt(i);
}
signin(name,p,email);
break;
case 1:
signup(n1);
break;}
}
public static void signup(int n){
//int flag=0;
System.out.println("Enter your name");
String name=s.nextLine();
System.out.println("Enter your mail id");
String email=s.nextLine();
password(name,email);
}
public static void password(String name,String email){

	int ucount=0;
	int lcount=0;
	int spcount=0;
	int dcount=0;
	int numcase=1;
	int lcase=5;
	int ucase=1;
	int spcase=1;
	System.out.println("THE PASSWORD MUST CONTAIAN 1 UPPERCASE,5 LOWERCASE,1 NUMBER AND 1 SPECIAL CHARACTER");
	
	String input=s.nextLine();
	char p[]=input.toCharArray();
	int length=input.length();
	char ch[]=input.toCharArray();
	for(int i=0;i<length;i++)
	{
		//char ch=input.charAt(i);
		
		if(input.charAt(i)>=65&&input.charAt(i)<=90)
			ucount++;
		
		ch[i]=input.charAt(i);
		//System.out.println(ch[i]);
		if(input.charAt(i)>=97&&input.charAt(i)<=122)
			lcount++;
		if(input.charAt(i)>=48&&input.charAt(i)<=57)
			dcount++;
		if(input.charAt(i)>=33&&input.charAt(i)<=47||input.charAt(i)>=58&&input.charAt(i)<=64)
			
		spcount++;
			else
				System.out.println();
	}
	if(ucount>=ucase&&lcount>=lcase&&spcount>=spcase&&dcount>=numcase)
	{
		int a=conpassword(ch);
		System.out.println("Valid password");
		signin(name,ch,email);
}
	else{
		System.out.println("The PassWord didn't have enough of following case:");
	if(ucount!=ucase)
		System.out.println("Upper Case");
	if(lcount!=lcase)
		System.out.println("Lower Case");
	if(dcount!=numcase)
		System.out.println("Number Case");
	if(spcount!=spcase)
		System.out.println("Special Case");
}
}
public static int conpassword(char ch[]){
	int flag=1;
	String reinput=s.nextLine();
	char p[]=reinput.toCharArray();
	int length=reinput.length();
	char con[]=reinput.toCharArray();
	for(int i=0;i<length;i++)
	{
		con[i]=reinput.charAt(i);
		if(con[i]==ch[i])
			flag=1;
		else{
			flag=0;
			break;
		}
	}
	if(flag==1)
		return (flag) ;
	else{
		System.out.println("RE Enter the password");
		return (flag);
	}
}

public static void signin(String name,char p[],String email){
int flag=0;
System.out.println("Enter youro userid");
String userid=s.nextLine();
a[2]=userid;
if(userid.equals(email)){
System.out.println("Enter password");
String upassword=s.nextLine();
a[3]=upassword;
char cp[]=upassword.toCharArray();
for(int i=0;i<cp.length;i++){
if(p[i]==cp[i]){
flag=0;}
else{
flag=1;
break;}
}
if(flag==0){
System.out.println("Hello"+name);
}
else{
System.out.println("enter correct password");
signin(name,p,email);
}
}
else
{
System.out.println("Enter correct user id");
}

}
}
