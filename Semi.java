import java.util.*;
public class Semi{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(count+++"*");
			}
			System.out.println();
		}
		
		for(int i=n;i>0;--i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(--count+"*");
			}
			System.out.println();
		}
	}
}