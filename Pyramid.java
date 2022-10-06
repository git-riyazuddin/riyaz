import java.util.Scanner;
class Pyramid{
public static void main(String [] args){
int n,j;
Scanner scan=new Scanner(System.in);
System.out.println("enter n value");
n=scan.nextInt();
for(int i=0;i<n;i++){
for( j=0;j<=i;j++){
//System.out.print("*");
System.out.print(i+j+1);
}
System.out.println(" ");
}
for(int i=n;i>0;i--){
	System.out.print(i+j+1);
for( j=i;j>=i;j--){
//System.out.print("*");
System.out.print(" ");
}
System.out.println();

}

}}