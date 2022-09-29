import java.util.*;
public class Lexico{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean []seen=new boolean[str.length()];
		for(int i=0;i<str.length();i++){
			if(seen[i]==true)
				continue;
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i)==str.charAt(j))
					seen[j] = true;
				System.out.print(str.charAt(i));
		}
			
	}
}