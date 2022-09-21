import java.util.Scanner;
public class SumofNum{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter n value");
int n=s.nextInt();
int []a=new int[n];
System.out.println("Enter a number of arrays");
for(int i=0;i<n;i++){
a[i]=s.nextInt();}
System.out.println("Enter sum value");
int sum=s.nextInt();
int count=0;
for(int i=0;i<a.length-1;i++)
for(int j=i+1;j<a.length;j++)
if(a[i]+a[j]==sum){
++count;
System.out.printf("(%d,%d),",a[i],a[j]);
}
System.out.println(count);}}