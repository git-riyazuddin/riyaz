import java.util.*;
import java.lang.*;
class SimpIntrest{
	public static Scanner s=new Scanner(System.in);
	public static void main(String[]args){
		SimpIntrest ci=new SimpIntrest();
		ci.Intrest();
	}
	public void Intrest(){
		double p=s.nextInt();
		double r=s.nextInt();
		double n=s.nextInt();
		
		for(int i=1;i<=n;i++){
			if(i==1)
				System.out.println("years"+"   "+"Future Value");
		double a=p*Math.pow((1+r/100),i);
		        System.out.println(i+"       "+a);
		//System.out.println(a);}
	}
}
}