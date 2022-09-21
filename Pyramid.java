import java.util.Scanner;
class Pyramid{
public static void main(String [] args){
int n;
Scanner scan=new Scanner(System.in);
System.out.println("enter n value");
n=scan.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
//System.out.print("*");
System.out.print(i+j+1);
}
System.out.println(" ");
}
}}