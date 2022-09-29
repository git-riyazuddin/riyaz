import java.util.*;
public class StringRep{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string value");
		String str=s.next();
		System.out.println("Enter number of times repeat");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(str);
		
		}
	}
}