import java.util.Scanner;
public class Password{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter 0 for admin and 1 for user");
n=s.nextInt();

if(n == 1){
System.out.println("sign in");
}if(n == 0){
System.out.println("signup");
}
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
if(password[]>='a'

}