import java.util.Scanner;
class MaxandMin{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number if arrays");
int n= scan.nextInt();
int a[]=new int [n];
int i;

System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{a[i]=scan.nextInt();
}
int max=a[n-1];
int min=a[0];
for(i=0;i<n;i++){
if(a[i]<min){
min=a[i];
}
if(a[i]>max){
max=a[i];}
}
System.out.println("maximum value"+max+"minimum value"+min);
}
}