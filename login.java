import java.util.Scanner;
class  Login{
	static Scanner s=new Scanner(System.in);
public static void main(String[]args){
	int ucount=0;
	int lcount=0;
	int spcount=0;
	int dcount=0;
	int numcase=1;
	int lcase=5;
	int ucase=1;
	int spcase=1;
	System.out.println("THE PASSWORD MUST CONTAIAN 1 UPPERCASE,5 LOWERCASE,1 NUMBER AND 1 SPECIAL CHARACTER");
	
	String input=s.nextLine();
	char p[]=input.toCharArray();
	int length=input.length();
	char ch[]=input.toCharArray();
	for(int i=0;i<length;i++)
	{
		//char ch=input.charAt(i);
		
		if(input.charAt(i)>=65&&input.charAt(i)<=90)
			ucount++;
		
		ch[i]=input.charAt(i);
		//System.out.println(ch[i]);
		if(input.charAt(i)>=97&&input.charAt(i)<=122)
			lcount++;
		if(input.charAt(i)>=48&&input.charAt(i)<=57)
			dcount++;
		if(input.charAt(i)>=33&&input.charAt(i)<=47||input.charAt(i)>=58&&input.charAt(i)<=64)
			
		spcount++;
			else
				System.out.println();
	}
	if(ucount>=ucase&&lcount>=lcase&&spcount>=spcase&&dcount>=numcase)
	{
		int a=conpassword(ch);
		System.out.println("Valid password");
}
	else{
		System.out.println("The PassWord didn't have enough of following case:");
	if(ucount!=ucase)
		System.out.println("Upper Case");
	if(lcount!=lcase)
		System.out.println("Lower Case");
	if(dcount!=numcase)
		System.out.println("Number Case");
	if(spcount!=spcase)
		System.out.println("Special Case");
}
}
public static int conpassword(char ch[]){
	int flag=1;
	String reinput=s.nextLine();
	char p[]=reinput.toCharArray();
	int length=reinput.length();
	char con[]=reinput.toCharArray();
	for(int i=0;i<length;i++)
	{
		con[i]=reinput.charAt(i);
		if(con[i]==ch[i])
			flag=1;
		else{
			flag=0;
			break;
		}
	}
	if(flag==1)
		return (flag) ;
	else{
		System.out.println("RE Enter the password");
		return (flag);
	}
}
}