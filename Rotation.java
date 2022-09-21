import java.util.Scanner;
class Rotation{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the n value");
int n=scan.nextInt();
int a[]=new int[n];
int i,j;
System.out.println("Enter the number of array");
for(i=0;i<n;i++)
a[i]=scan.nextInt();
for(i=0;i<1;i++){
int temp=a[n-1];
for(j=n-1;j>0;j--){
a[j]=a[j-1];
}
a[0]=temp;
}
System.out.println("Array of rotation:");
for(i=0;i<n;i++)
System.out.println(a[i]+" ");

}}
