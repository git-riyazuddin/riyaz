import java.util.*;
public class Strin{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		String []str=new String[10];
		int i=0;
		str[0]="ponni";
		str[1]="tholkappiyam";
		str[2]="manimeegali";
		str[3]="thirukural";
	for(int j=0;j<str.length;j++){
		System.out.println(str[j]);
	}
	System.out.println("Enter u need to add");
	int n=s.nextInt();
//System.out.println("Enter the name of book");
		for(i=4;i<=n;i++){
			str[i]=s.nextLine();
		}
		for(int j=0;j<str.length;j++){
		System.out.println(str[j]);
	}
	}
}