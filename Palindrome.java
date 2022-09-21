import java.util.Scanner;
public class Palindrome{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String word,rev = "";
System.out.println("Enter a string value");
word=s.nextLine();
int length=word.length();
for(int i=(length-1);i>=0;--i)
{rev=rev+word.charAt(i);}

if(word==rev){
System.out.println("it is palindrome");
}else
{System.out.println("it  is not palindrome");
}}
}