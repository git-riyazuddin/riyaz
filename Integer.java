import java.util.*;
class Integer{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0
		;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int max=a[n-1];
		int min=a[0];
		for(int i=0;i<n;i++){
			int temp=0;
			for(int j=1;j<n;j++)
			{if(a[i]==a[j])
				{
					count =1;
				}
				else if(a[i]>a[j]){
				
					temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
			
			if(max<a[i]){
				temp=max;
				max=a[i];
				a[i]=temp;
			}
			if(min>a[i])
			{
				temp=min;
				min=a[i];
				a[i]=temp;
			}
				
		}
		}
		
		a[n-1]=max;
		a[0]=min;
		if (count==1)
			System.out.println("the array does notcontain");
		else
			System.out.println("the array does contain integer");
	}
}
		