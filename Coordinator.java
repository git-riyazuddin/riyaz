import java.util.Scanner;
class Coordinator{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the n number");
int n=s.nextInt();
int i;
int []a=new int[n];

System.out.println("Enter a number of arrays");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int maxvalue=a[0];
for(i=a.length-1;i>0;i--)
{
if(maxvalue<=a[i]){
if(a[i]>=a[i-1]){
System.out.println("output"+a[i]);
maxvalue=a[i];}
}
else{
maxvalue=a[i];
}}
}}