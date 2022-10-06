import java.util.*;

class Svmethod{
	public static Scanner s=new Scanner(System.in);
	public static void main(String[]args){
	
	System.out.println("The Smallest Value is"+Small());
	}
	public static float Small(){
		System.out.println("Enter 1st number");
		float a=s.nextInt();
		System.out.println("Enter 2nd number");
		float b=s.nextInt();
		System.out.println("Enter 3rd number");
		float c=s.nextInt();
		if(a<b&&a<c){
				return a;
		}
		else if(b<c){
			return b;
		}
		else{
			return c;
		}
	}
}