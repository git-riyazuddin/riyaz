import java.util.Scanner;
public class Daimond{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();int k=0;
		for(int i=1;i<=n;i++){
			for(int j=-n;j<n;j++){
				if(-i<j&&j<i){
				System.out.print(k++  );
				
				}
			else
				System.out.print("  ");
			}
		System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=-n;j<n;j++){
				if(-(n-i)<j&&j<(n-i))
				System.out.print("*");
			else
				System.out.print("  ");
			}
		System.out.println();
		}
		
		
	}
}
		
				