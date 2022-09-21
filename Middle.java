import java.util.Scanner;
class Middle{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int n=(str.length()-1)*2;
char [] arr=new char[str.length()];
int j=0;
for(int i=str.length()/2;i<str.length();i++)
{
arr[j]=str.charAt(i);
j++;
}
for(int i=0;i<str.length()/2;i++)
{
arr[j]=str.charAt(i);
j++;
}
for(int i=0;i<str.length();i++){
if(n>0)
System.out.print(" ");
for(int k=0;k<i+1;k++)
{
System.out.print(arr[k]);
}
System.out.println("\n");
n=n-2;
}
}
}