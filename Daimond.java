import java.util.Scanner;
class Daimond{
public static void main(String []args){

Scanner s=new Scanner(System.in);
int i,j,n,l,count=0;
n=s.nextInt();
for(i=-n;i<=n;i++){
if(i<0)
l=-i;
else
l=i;
for(j=0;j<2*n-l+1;j++)
{
if(j<l)
System.out.print(" ");
else
System.out.print(++count+" ");
}
System.out.print("\n");
}}}