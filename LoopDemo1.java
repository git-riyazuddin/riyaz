import java.util.Scanner;
class LoopDemo1{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int i=0,n,j;
System.out.println("Enter n value");
n=s.nextInt();
do{System.out.print("\nhi ");
j=1;
do{

System.out.print("hello ");
j++;}
while(j<n);
i++;
}while(i<n);
System.out.println("\n"+i);
}
}
