import java.util.*;
public class Frequency {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string frequency");
		String str=s.next();
		System.out.println("Enter the number of repeated frequency");
		int k=s.nextInt();
		int count=0;
		boolean []seen=new boolean[str.length()];
		for(int i=0;i<str.length();i++){
			if(seen[i]==true)
				continue;
			int count1=1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count1++;
					seen[j] = true;
				}
			}
			if(count1>=k){
				count=count+count1;
			}
		
			
	}
	System.out.println(count);
}
}
