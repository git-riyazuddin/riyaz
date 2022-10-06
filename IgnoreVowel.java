import java.util.*;
class IgnoreVowel{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[]c=str.toCharArray();
		for(int i=0;i<str.length()-1;i++){
			if(c[i+1]==c[i])
				i=i+2;
			else if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U')
				c[i]='0';
		}
		for(int i=0;i<c.length;i++)
		if(c[i]!='0')	
		System.out.print(c[i]);
	}
}
	