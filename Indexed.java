import java.util.Scanner;
class Indexed{
	public static Scanner s=new Scanner(System.in);
public static void main(String[]args){
	String []str={"Fizz","Buzz"};
	System.out.println("Enter number of values");
	int n=s.nextInt();
	System.out.print("[");
	for(int i=1;i<=n;i++)
	{
		if(i%3==0&&i%5==0)
			System.out.print("'"+str[0]+str[1]+"'");
		else if(i%3==0)
			System.out.print("'"+str[0]+"'");
		else if(i%5==0)
		    System.out.print("'"+str[1]+"'");
		else
			System.out.print("'"+i+"'");
		if(i<n)
			System.out.print(",");
	}
	System.out.print("]");
}

}