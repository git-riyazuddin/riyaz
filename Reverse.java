import java.util.Scanner;
public class Reverse{

public static void main(String [] args){
Scanner s=new Scanner(System.in);
String word=s.nextLine();
char a[]=word.toCharArray();

for(int x=0, y=a.length-1;x<y;x++,y--)
{
char temp=a[x];
a[x]=a[y];
a[y]=temp;
}int start=0;
for(int end=0;end<a.length;end++){
if(a[end]==' '){
for(;start<end-1;start++,end--)
{
char temp=a[start];
a[start]=a[end];
a[end]=temp;
}
start=end+1;
}
}
System.out.println(a);
}
}