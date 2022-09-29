import java.util.*;
public class Add{
	public static Scanner s=new Scanner(System.in);
	public static void main(String [] args){
	String [] str=new String[10];
		str[0]="ponni";
		str[1]="tholkappiyam";
		str[2]="manimeegali";
		str[3]="thirukural";
		for(int j=0;j<str.length;j++){
			if(str[j]!=null){
		System.out.println(str[j]);
			}
	}
	for(int i=4;i<=str.length-1;i++){	
			str[i]=s.nextLine();
		}
	for(int j=0;j<str.length;j++){
			if(str[j]!=null){
		System.out.println(str[j]);
			}	
	}
}
class Insert{
	
}