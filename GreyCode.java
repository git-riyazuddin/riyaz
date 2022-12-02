import java.util.*;

public class GreyCode {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c[]=str.toCharArray();
       con(0,c);
    }
    public static void con(int i, char c[]){
        if(i==c.length)
            return ;
        if(i==0)
        {
            System.out.print(c[i]);
            con(i + 1, c);
        }
        else if(c[i]!=c[i-1])
        {
            System.out.print("1");
            con(i + 1, c);
        }
        else if(c[i]==c[i-1])
        {
            System.out.print("0");
            con(i + 1, c);
        }
    }
}
