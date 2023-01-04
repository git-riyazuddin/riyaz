import java.util.*;
class Parkinglot{
	static Scanner s=new Scanner(System.in);
	static List<List<String>>list=new ArrayList<>();
	static List<List<Integer>>list1=new ArrayList<>();
	static List<List<String>>bike=new ArrayList<>();
	static List<List<String>>car=new ArrayList<>();
	static List<List<String>>truck=new ArrayList<>();
	static boolean b=false;
	public static void main(String[]args){
	System.out.println("Enter number of floors u need");
	int n=s.nextInt();
	System.out.println("Enter no of Bike space");
	int b=s.nextInt();
	System.out.println("Enter no car space");
	int c=s.nextInt();
	System.out.println("Enter no of truck space");
	int t=s.nextInt();
	int full=b+c+t;
	for(int i=0;i<n;i++){
	list.add(new ArrayList(full));
	list1.add(new ArrayList(full));
	bike.add(new ArrayList(b));
	car.add(new ArrayList(c));
	truck.add(new ArrayList(t));
	
	}
	int ca[]=new int[full];
	int bi[]=new int[full];
	int tr[]=new int[full];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<full;j++)
		{
			list.get(i).add("free");
			bike.get(i).add("free");
			car.get(i).add("free");
			truck.get(i).add("free");
		}
	}
	if(b==false)

	System.out.println("Eneter 1.book 2.view 3.cancel");
	int n1=s.nextInt();
	if(n1==1)
	{
		Book.book(bi,ca,tr,c,b,t,n);
	}
	if(n1==2){
		View.view(bi,ca,tr,c,b,t,n);
	}
	if(n1==3){
	  Cancel.cancel(bi,ca,tr,c,b,t,n);
	}
	
}
}
class Book extends Parkinglot{
	public static void book(int bi[],int ca[],int tr[],int c,int b,int t,int n){
	System.out.println("Enter 1.bike 2.car 3.truck");
	int n1=s.nextInt();
	if(n1==1)
	{
		bike(bi,b,n);
	}
	if(n1==2){
		car(ca,c,n);
	}
	if(n1==3){
		truck(tr,t,n);
	}
	}
	public static void bike(int bi[],int b,int n){
		for(int i=0;i<n;i++)
		{
			if(bi[i]<=b){
		String str=s.nextLine();		
		bike.get(i).add(str);
		list.get(i).add(str);
		System.out.println(bi[i]*10+i);
		bi[i]+=1;
		break;
		}
		}
		Parkinglot.main(null);
		
	}
	public static void car(int ca[],int c,int n){
		for(int i=0;i<n;i++)
		{
			if(ca[i]<=c){
		String str=s.nextLine();		
		car.get(i).add(str);
		list.get(i).add(str);
		System.out.println(ca[i]*10+i);
		ca[i]+=1;
		break;
		}
		}
		Parkinglot.main(null);
			}
	public static void truck(int tr[],int t,int n){
		for(int i=0;i<n;i++)
		{
			if(tr[i]<=t){
		String str=s.nextLine();		
		truck.get(i).add(str);
		list.get(i).add(str);
		System.out.println(tr[i]*10+i);
		tr[i]+=1;
		break;
			}}
			Parkinglot.main(null);
		
	}
	
}

class Cancel extends Book{
	public static void cancel(int bi[],int ca[],int tr[],int c,int b,int t,int n){
		System.out.println("Enter 1.bike 2.car 3.truck");
	int n1=s.nextInt();
	if(n1==1)
	{
		bike(bi,b,n);
	}
	if(n1==2){
		car(ca,c,n);
	}
	if(n1==3){
		truck(tr,t,n);
	}
	}
	public static void bike(int bi[],int b,int n){
	String bik=s.nextLine();
	for(int i=0;i<n;i++){
		for(int j=0;j<b;j++){
		if((bike.get(i).get(j)).equals(bik)){
		bike.get(i).remove(j);
		bike.get(i).add("free");
		bi[i]-=1;
		}			
		}
	
	}
	Parkinglot.main(null);
	}
	public static void car(int ca[],int c,int n){
		String ca1=s.nextLine();
		for(int i=0;i<n;i++){
		for(int j=0;j<c;j++){
		if((bike.get(i).get(j)).equals(ca1)){
		car.get(i).remove(j);
		car.get(i).add("free");
		ca[i]-=1;
		}			
		}
		}
		Parkinglot.main(null);
	}
	public static void truck(int tr[],int t,int n){
		String truc=s.nextLine();
		for(int i=0;i<n;i++){
		for(int j=0;j<t;j++){
		if((truck.get(i).get(j)).equals(truc)){
		truck.get(i).remove(j);
		truck.get(i).add("free");
		tr[i]-=1;
		}			
		}
		}
		Parkinglot.main(null);
	}
	
	
}
class View extends Book{
	public static void view(int bi[],int ca[],int tr[],int c,int b,int t,int n){
	System.out.println("Enter 1.bike 2.car 3.truck");
	int n1=s.nextInt();
	int i=n-1;
	while(i<n){
		bike(bi,b,n);
		car(ca,c,n);
		truck(tr,t,n);
		i++;
	}
	Parkinglot.main(null);
	}
	public static void bike(int bi[],int b,int n){
		avai(bi,b,n);
		occ(bi,b,n);
		
	}
	public static void car(int ca[],int c,int n){
		avai(ca,c,n);
		occ(ca,c,n);
	}
	public static void truck(int tr[],int t,int n){
		avai(tr,t,n);
		occ(tr,t,n);
	}
	public static void avai(int a[],int si,int n){
		
		for(int i=0;i<n;i++){
			System.out.print("free slots in "+i+"is");
		for(int j=0;j<si;j++){
		if((truck.get(i).get(j)).equals("free")){
			System.out.print(j+" ");
		}
		}
		System.out.println();
		}
	}
	public static void occ(int a[],int si,int n){
		
		for(int i=0;i<n;i++){
			System.out.print("booked slots in "+i+"is ");
		for(int j=0;j<si;j++){
		if(!(truck.get(i).get(j)).equals("free")){
			System.out.print(j+" ");
		}
		}
		System.out.println();
		}
	}
}