import java.util.Scanner;
public class ArrayArangement{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
int temp[]=new int[n];
int k=0;
for(int i=0;i<a.length-1;i++)
if(a[i]==a[i+1]){
a[i]=a[i]+a[i+1];
a[i+1]=0;
}
for(int i=0;i<a.length;i++){
if(a[i]!=0)
temp[k++]=a[i];
}

for(int i=0;i<n;i++)
System.out.println(temp[i]+" ");}}
