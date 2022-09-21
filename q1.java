import java.util.Scanner;
public class Q1{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("input a number");
int num = in.nextInt();
for(int i=1;i<=10;i++){
System.out.println(num+"*"+i+"="+(num*i));
}
}
}