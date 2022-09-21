import java.util.Scanner;
class Alphabet{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
char start=s.next().charAt(0);
char end='z';
if(start=='a')
{System.out.format("%c"+('a'+25));
}
if(start=='A')
{
System.out.format("%c"+('A'+25));
}
}
}
