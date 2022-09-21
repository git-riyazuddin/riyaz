import java.util.Scanner;
class SumofArray{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the n value");
int n=scan.nextInt(),sum=0,i;
int a[]=new int[n];
for(i=0;i<n;i++)

a[i]=scan.nextInt();
for(i=0;i<n;i++){
sum+=a[i];
}
System.out.println("sumof array:"+sum);
}}