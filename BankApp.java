import java.util.*;
class BankApp{
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args){
		Data d=new Data();
		BankApp b=new BankApp();
		System.out.println("Enter 1 for new account \n 2 for view\n 3 Transaction \n 5 for exit");
		int n=s.nextInt();
		if(n==1){
			b.signup();
		}
			if(n==2){
				d.view();
			}
			if(n==3){
				System.out.println("how much u need to transfer");
				double da=s.nextDouble();
				Transaction(da);
			}
		if(n==5)
			System.out.println("exit");
	}
	public static String Encryption(String str){
		String Encrption="";
		char[]c=new char[str.length()];
		for(int i=0;i<str.length();i++){
		c[i]=str.charAt(i);
			if((c[i]>='a'&&c[i]<'z')||(c[i]>='A'&&c[i]<'Z')||(c[i]>='0'&&c[i]<'9')){
				
				c[i]=(char)(c[i]+1);
			Encrption+=c[i];
			}
			if((c[i]=='z')||(c[i]=='Z')){
				
				c[i]=(char)(c[i]-25);
			Encrption+=c[i];
		}
		if(c[i]=='9')
		{
			c[i]=(char)(c[i]-9);
			Encrption+=c[i];
		}
		}
		return Encrption;
		
	}
	public static void Transaction(double da){
		Data d=new Data();
		String usid=s.next();
		String pas=s.next();
		String enc=Encryption(pas);
		int t=0;
		for(int i=0;i<=20;i++)
		{
			if(i<20)
			if(usid.equals(d.custid[i])&&enc.equals(d.Encrypt[i]))
			{  
				
			
				System.out.println("whom u need to transfer");
				String sp=s.next();
				for(int j=0;j<=20;j++){
					if(j!=20){
						if(d.custid[j].equals(sp))
							d.bal[j]=d.bal[j]+da;
						d.bal[i]=d.bal[i]-da;
						t=1;
						break;
						
					}
					if(j==20)
						System.out.println("Account not found");
					BankApp.main(null);
				}
				
			
			}
			
			if(i==20){
				System.out.println("user id are password wrong");
				Transaction(da);
			}
			if(t==1)
				break;
			
		}
	}
	public void signup(){
		Data d=new Data();
		String Encrp="";
		String name=s.next();
		String password=s.next();
		String Repass=s.next();
		if(password.equals(Repass))
		Encrp=Encryption(password);
		else
			signup();
		d.data(name,Encrp);
	}
}
class Data{
	Scanner s=new Scanner(System.in);
	static String custid[]=new String[20];
	static String Accno[]=new String[20];
	static String[]name=new String[20];
	static Double[]bal=new Double[20];
	static String []Encrypt=new String[20];
	int count=0;
	int count1=3;
	public void data(String id,String encrypt){
				int i=4;
		String str=""+ ++i + i;
		custid [++count1]=str;
		String acc=str+"0"+str;
		Accno[count1]=acc;	
		name[count1]=id;
		double balance=10000;
		bal[count1]=balance;
		Encrypt[count1]=encrypt;
		BankApp.main(null);
	}
	public void view(){
		custid[count]="11";
	 Accno[count]="11011";
	 name[count]="kumar";
	 bal[count]=10000D;
	 Encrypt[count]="ApipNbjm";
	  custid[++count]="22";
	 Accno[count]="22022";
	 name[count]="Madhu";
	 bal[count]=20000D;
	 Encrypt[count]="Cboljoh";
	 custid[++count]="33";
	 Accno[count]="33033";
	 name[count]="Rahul";
	 bal[count]=30000D;
	 Encrypt[count]="dbnqvt";
	 custid[++count]="44";
	 Accno[count]="44044";
	 name[count]="Robin";
	 bal[count]=40000D;
	 Encrypt[count]="kbwb22";

		for(int i=0;i<20;i++){
			if(custid[i]!=null)
	 System.out.println(custid[i]+"\t"+Accno[i]+"\t"+name[i]+"\t"+bal[i]+"\t"+Encrypt[i]);
		}
		BankApp.main(null);
	}
}
