import java.util.Scanner;
public class TwistedPrime{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int orgnum,rev=0,cnum,sum=0,flag=0;
orgnum=s.nextInt();
cnum=orgnum;
for(int i=2;i<=orgnum/2;i++){
if(orgnum%i==0){
System.out.println("it is not a prime number");
flag=1;break;
}

}
if(flag==0){
while(orgnum!=0){
sum=cnum%10;
rev=rev*10+sum;
orgnum=orgnum/10;
}
for(int i=2;i<=orgnum/2;i++){
if(orgnum%i==0){
System.out.println("it is not a prime number");
flag=1;
}}

if(flag==0){
System.out.println(cnum+"is a twisted prime number");
}
else{
System.out.println(cnum+"is not a twisted prime number");}
}
}}