import java.util.*;
class VowelCount{
	public static Scanner s=new Scanner(System.in);
	public static void main(String []args){
		VowelCount vc=new VowelCount();
		vc.vcount();
	}
	public void vcount(){
		String str = s.next();
		int count=0;
		char[]c=str.toCharArray();
		for(int i=0;i<str.length();i++){
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
			count++;
		}
		}
		System.out.println("the number of vovels in string is:"+count);
	}
}