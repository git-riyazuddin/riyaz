import java.util.Scanner;
public class Alpha
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character:");
		String value=s.nextLine();
		char small='a';
		char cap='A';
		char num='0';
		for(int i=0;i<value.length();i++)
		{int temp;
		    if('a'<=value.charAt(i)&&'z'>=value.charAt(i))
		    {
		        temp='z'-value.charAt(i);
		    System.out.printf("%c", small+temp);
		    }
		    else if('A'<=value.charAt(i)&&'Z'>=value.charAt(i))
		    {
		        temp='Z'-value.charAt(i);
		    System.out.printf("%c", cap+temp);
		    }
		    if('0'<=value.charAt(i)&&'9'>=value.charAt(i)){
                         temp='9'-value.charAt(i);
                     System.out.printf("%c", num+temp);
                    }
		}
	}
}
