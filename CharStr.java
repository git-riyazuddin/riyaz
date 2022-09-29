import java.util.Scanner;
public class CharStr{
public static void main(String []args){
	Scanner s=new Scanner(System.in);
	String word="";
	for(int i=0;i<=8;i++)
	{
	char c=s.next().charAt(8);
	word=word+c;
	}
	System.out.println(word);
}
}