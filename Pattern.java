import java.util.*;
class Pattern{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int i,j,k,n,count=0;
		System.out.println("enter a number:");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=n-1;k>i;k--)
			{
			System.out.print(" ");	
			}
			for(j=1;j<i;j++)
			{
				System.out.print(" "+ ++count+" ");
			}
			System.out.println();
		}
		for(i=0;i<count;i++)
		{
			for(k=count-1;k>=i;k--)
			{
			System.out.print(" ");	
			}
			for(j=i;j>0;j--)
			{
				System.out.print(" "+ count--+" ");
			}
			System.out.println();
		}
		
	}
}