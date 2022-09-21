import java.util.Scanner;
public class Password{
public static String str[]=new String[10];
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=0;
System.out.println("Enter 0 for admin");
System.out.println("Enter 1 for user");
System.out.println("Enter 2 for exit");
n=s.nextInt();
switch(n){
case 0;
admin();
System.out.println("Hello Admin");
break;
case 1:
user();
System.out.println("welcome");
break;
case 2;
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
public static void signup(){
System.out.println("Enter your name");
String name=s.nextLine();
SYstem.out.println("Enter your mail id");
String email=s.nextLine();
System.out.println("Enter password");
String password=s.nextLine();
char a[]=password.nextLine();
for(int i=;i<a.length;i++)
{
if('a'<=a.charAt(i)&&a.charAt(i)<='z'||'A'<=a.charAt(i)&&a.charAt(i)<='Z'||' '<=a.charAt(i)&&a.charAt(i)<='/'||'0'<=a.charAt(i)&&a.charAt(i)<='9')


}*/