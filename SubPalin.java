import java.util.Scanner;
public class SubPalin(){
public static void main(String []args){
Scanner s=new Scanner(System.in);
String str=s.next();
String word="";String rev = "";

for(int i=0;i<str.length();i++)
{if('a'<=str.charAt(i)&&str.charAt(i)<='z'||'A'<=str.charAt(i)&&str.charAt(i)<='Z')
word=word+str.charAt(i);
for(int i=word.length()-1;i>=0;i--)
rev=rev + word.charAt(i);
if(rev.equals(word))
}
}
}