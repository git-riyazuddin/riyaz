import java.util.Scanner;
public class Demo{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		String word="";
		for(int i=0;i<8;i++)
		{
			char []a=s.next().toCharArray();
		word= word+a[i];}
		System.out.println(word);
	}
}