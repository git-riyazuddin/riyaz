import java.util.Scanner;
public class Palindrome{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a string value");
String str=s.nextLine();
String word="";String rev = "";

for(int i=0;i<str.length();i++)
{if('a'<=str.charAt(i)&&str.charAt(i)<='z'||'A'<=str.charAt(i)&&str.charAt(i)<='Z')
word=word+str.charAt(i);
for( i=word.length()-1;i>=0;i--)
rev=rev + word.charAt(i);
boolean flag[]=new boolean[str.length()];
for( i=0;i<word.length();i++){
if(word.charAt(i)==rev.charAt(i))
flag[i]=true;
}
for( i=0;i<flag.length;i++){
if(flag[i]==false){
System.out.println("it is  not palindrome"+word);
break;
}
else
{
System.out.println("it  is palindrome");
break;
}}
}
}}