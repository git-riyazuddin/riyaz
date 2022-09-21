import java.util.Scanner;
public class Loopdemo{
	public static void main(String[] args) {
	    int i=0,sum=0,n,j=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the n value:");
	    n=s.nextInt();
	    while(++i<=n){while(j++<=i){
sum=i*j;
System.out.println("insideone loop="+sum);}

	    sum+=i;
		System.out.println(sum);

	    }
	    System.out.println("total sum="+sum);
	}
}
