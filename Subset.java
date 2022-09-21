import java.util.Scanner;
public class Subset{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter sum value");
		int sum=s.nextInt();

		System.out.println("Enter number of values");
		for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<n;i++){
			temp=a[i];
			for(int j=a.length-1;j>=0;j--)
			{
				if(a[j]!=temp){
					if(temp<sum){
					temp+=a[j];
					break;
					}
					//System.out.println(temp);
				}
				else if(temp==sum){
					System.out.println("since there is subset");
					break;
				}

			}/*
	System.out.println("since no subset");
	break;*/
		}
}
}