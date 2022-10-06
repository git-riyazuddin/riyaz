import java.util.*;
class Sum{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int [n];
	int b[]=new int [n];
	int count =0;
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		
	}
	int t=s.nextInt();
	int sum=0;
	for(int i=0;i<n;i++)
	{
int k=0;
		for(int j=i;j<n;j++){
			sum+=a[i]+a[j];
				if(sum>t){
					
					break;
				}
				if(sum<=t)
				{
					b[++k]=a[j];
				}
				if(sum==t)
				{
					break;
				}
		}
		
		if(sum==t){
			b[0]=a[i];
			System.out.println(sum);
			break;
		}
		sum=0;
		
	}
	for(int i=0;i<n;i++)
		
		System.out.println(b[i]);
	
	}
}