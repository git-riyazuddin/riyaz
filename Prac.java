import java.util.*;
public class Prac {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
String [] str=new String[20];
	String [] pri=new String[20];
	int count=0;
	int count1=0;
	str[count++]="Books";
	str[count++]="Quran";
	str[count++]="Bhavathgitha";
	str[count++]="Bible";
	str[count++]="Thirukural";
	str[count++]="vedhas";
	pri[count1++]="Prize";
	pri[count1++]="Rs.1500";
	pri[count1++]="Rs.800";
	pri[count1++]="Rs.600";
	pri[count1++]="Rs.500";
	pri[count1++]="Rs.2500";
	for(int i=0;i<str.length;i++){
		if(i==0)
			System.out.println("s.no"+"|"+str[i]+"|"+pri[i]);
		else if(str[i]!=null)
			System.out.println(i+"|"+str[i]+"|"+pri[i]);
	}
	/*System.out.println("Add Book");
	System.out.println("Enter number of books add");
	int d=s.nextInt();
	for(int i=0;i<d;i++){
		str[count++]=s.next();
		pri[count1++]=s.next();
	}
	for(int i=0;i<str.length;i++){
		if(i==0)
			System.out.println("s.no"+"|"+str[i]+"|"+pri[i]);
		else if(str[i]!=null)
			System.out.println(i+"|"+str[i]+"|"+pri[i]);
	}*/
	int k=s.nextInt();
	
	for(int i=0;i<str.length-1;i++){
		String temp=" ";
		if(i==k){
			str[i]=s.next();
			pri[i]=s.next();
		}
		if(str[i]==null&&pri[i]==null)
		{
			temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
			temp=pri[i];
			pri[i]=pri[i+1];
			pri[i+1]=temp;
			
		}
	}
	for(int i=0;i<str.length;i++){
		if(i==0)
			System.out.println("s.no"+"|"+str[i]+"|"+pri[i]);
		else if(str[i]!=null)
			System.out.println(i+"|"+str[i]+"|"+pri[i]);
	}
	/*int d=s.nextInt();
	
	for(int i=0;i<str.length-1;i++){
		String temp=" ";
		if(i==d){
			str[i]=temp;
			pri[i]=temp;
		}
		if(str[i]==null&&pri[i]==null)
		{
			temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
			temp=pri[i];
			pri[i]=pri[i+1];
			pri[i+1]=temp;
			
		}
	}
	for(int i=0;i<str.length;i++){
		if(i==0)
			System.out.println("s.no"+"|"+str[i]+"|"+pri[i]);
		else if(str[i]!=null)
			System.out.println(i+"|"+str[i]+"|"+pri[i]);
	}
}
}*/
}
}

