import java.util.Scanner;

public class Banking {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
		System.out.println("Enter 1.Admin /n 2.User /n 3.Exit");
        int n = s.nextInt();
        switch (n) {
            case 1:
                Admin a = new Admin();
                a.Adm();

            case 2:
                User u = new User();
                u.Us();
            case 3:
                System.out.println("Exit");
                break;
        }
    }
}
class Data{
    String name;
    int age;
    String gender;
    String account;
    String mobile;
    int amo;
    String card;
    public Data(String name,int age,String gender,String account,String mobile,int amo,String card){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.account=account;
        this.mobile=mobile;
        this.amo=amo;
        this.card=card;

    }

    public String toString() {
        return "name"+name+"\nage"+age+"\ngender"+gender+"\n" +account+"\n"+mobile+"\n"+amo+"\n"+card;
    }
}

/*class Detials {
    Scanner s=new Scanner(System.in);
    static int k=0;
    String name[]=new String[5];
    int age[]=new int[5];
    String gender[]=new String[5];
    String Accoun[]=new String[5];
    String mobie[]=new String[5];
    int amo[]=new int[5];

    String id[]=new String[5];
    String passw[]=new String[5];
    int pin[]=new int[5];
    String card[]=new String[5];
    String car="3411"+k;
    static int p=8251;
    public void Detial(){

        System.out.println("ENter name:");
        name[k] = s.next();
        System.out.println("Enter age");
        age[k] = s.nextInt();
        System.out.println("Enter Gender:");
        gender[k] = s.next();
        System.out.println("Enter Accountnum:");
        Accoun[k]=s.next();
        System.out.println("Enter mobie:");
        mobie[k]=s.next();
        System.out.println("Enter amount:");
        amo[k]=s.nextInt();
        card[k]=car;
        pin[k]=p++;
        System.out.println("your gift card numbr is");

        System.out.println("pin for the giftcard is:");


        k=k+1;
    }
}*/
class Admin{
	String
	public void Adm(){
	}
}
class User{
	public void Us(){
	}
}

