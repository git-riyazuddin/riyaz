import java.util.Scanner;
class ArrayAdd{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int n,m,k;
int c=0;int s=0;int j,i;
n=s.nextInt();
m=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++){
a[i]=s.nextInt();
}
int b[]=new int[m];
for(j=0;j<m;j++)
{
a[j]=s.nextInt();
}
if(n>m)
k=n-1;
else
k=m-1;
b[-1]=0;
int sum[]=new int[k];
for(i=a.length-1;i>=0;i--){
s=a[i]+b[j]+c;
sum[k]=s%10;
c=s/10;
k--;
}
for(i=0;i<=k;i++)
System.out.print(sum[i]);
}
}


