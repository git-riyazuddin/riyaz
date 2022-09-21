import java.util.Scanner;
public class CountValue{
public static void main(String []args){
int n,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter n value");
n=s.nextInt();
int []a=new int[n];
for(i=0;i<n;i++)
{a[i]=s.nextInt();
}
for(i=0;i<a.length;i++)
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
int min=a[0];
for(i=0;i<a.length;i++){
int count=1;

for(int j=i+1;j<a.length;j++){

if(a[i]==a[j]){
++count;}
}
System.out.println(a[i]+"="+count);
}
}
}