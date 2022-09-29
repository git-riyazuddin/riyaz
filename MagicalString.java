import java.util.*;
public class MagicalString{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		String mag="12211212212211211221";
		System.out.println("Enter number of values:");
		int n=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			if(mag.charAt(i)=='1')
				count=count+1;
		}
		
			System.out.println(count);
	}
}