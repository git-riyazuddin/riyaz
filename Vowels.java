import java.util.Scanner;

public class Vowels{
public static boolean isVowel(char c){
if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
return true;
return false;

private static ReverseVowels(String s){
char[]arr=s.toCharArray();
int i=0;
int j=arr.length-1;
while(i<j){
while(!isVowel(arr[i])){
i++;
}
while(!isVowel(arr[j])){
j--;
}
char temp= arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
return String.valueof(arr);
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
string input=scan.nextLine();
String rev=ReverseVowels(str);
Sysytem.out.println(rev);
}
}
