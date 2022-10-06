import java.util.*;
class Split{
	public static void main(String[]args){
	Split.midoff();
	}
	public static void midoff(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num of terms ur going to enter:");
		int n=s.nextInt();
		int []a=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	for(int i=0;i<n/2;i++){
		System.out.print(" "+a[i]);
	}
	System.out.println();
	for(int i=n/2;i<n;i++)
		System.out.print(" "+a[i]);
		
	}
}