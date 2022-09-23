import java.util.Scanner;
public class Password{
public static String a[]=new String[10];
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=0;
System.out.println("Enter 0 for admin");
System.out.println("Enter 1 for user");
System.out.println("Enter 2 for exit");
n=s.nextInt();
switch(n){
case 0:
admin();
System.out.println("Hello Admin");
break;
case 1:
user();
System.out.println("welcome");
break;
case 2:
System.out.println("Thank you");

}}
public static void admin()
{
System.out.println("Enter 0 for signin");
System.out.println("Enter 1 for signup");
int n1=s.nextInt();
switch(n1){
case 0:
signin();
break;
case 1:
signup();
break;}
}
public static void user()
{
System.out.println("Enter 0 for signin");
System.out.println("Enter 1 for signup");
int n1=s.nextInt();
switch(n1){
case 0:
signin();
break;
case 1:
signup();
break;}
}
public static void signup(){
int flag=0;
System.out.println("Enter your name");
String name=s.nextLine();
a[0]=name;
SYstem.out.println("Enter your mail id");
String email=s.nextLine();
System.out.println("Enter password");
String password=s.nextLine();
a[1]=password;
char p[]=password.toCharArray();
for(int i=0;i<p.length;i++)
{
if('a'<=p.charAt(i)&&p.charAt(i)<='z'||'A'<=p.charAt(i)&&p.charAt(i)<='Z'||' '<=p.charAt(i)&&p.charAt(i)<='/'||'0'<=p.charAt(i)&&p.charAt(i)<='9')
p[i]=p.charAt(i);
else
System.out.println("Invalid words");
}
String repassword=s.nextLine();
char re[]=repassword.nextLine();
for(int i=0;i<re.length;i++){
if(p[i]==re[i])
flag=0;
else
flag=1;
}
if (flag==0)
{
System.out.println("your login created");
signin(String email,char p[],String name)
}
else{
System.out.println("reenter password");
}}
public static void signin(String email,char p[]){
int flag=0;
System.out.println("Enter your userid");
String userid=s.nextLine();
a[2]=userid;
if(userid.equals(email)){
System.out.println("Enter password");
String upassword=s.nextLine();
a[3]=upassword;
char cp[]=upassword.nextLine();
for(int i=0;i<re.length;i++){
if(p[i]==cp[i]){
flag=0;}
else{
flag=1;
break;}
if(flag==0){
System.out.println("Hello"+name);
}
else{
System.out.println("enter correct password");
}
}
else
{
System.out.println("Enter correct user id");
}


}