import java.util.*;
class Bank{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        do{
			System.out.println("Enter 1.Admin \n 2.User");
            switch(n){
                case 1:
                    Admin a = new Admin();
                    a.Adm();

                case 2:
                    User u=new User();
                    u.User();
                case 3:
                    System.out.println("Exit");
                    break;
            }}while(true);



    }
}
class Detials {
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
    public Detials(){

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
}

class Admin extends Detials{
    String Admin_Id="MainUser";
    String password="usermain";
    static Scanner s=new Scanner(System.in);
    Admin o=new Admin();
    public void Adm(){
        System.out.println("Enter Admin Id");
        String id=s.next();
        if(Admin_Id.equals(id)){
            System.out.println("Enter Admin password");
            String pass=s.next();
            if(password.equals(pass)){
                int n=s.nextInt();
                System.out.println("Enter 1.GiftCard\n2.Topup\n3.Transaction history\n4.Block\n5.Logout");
                do{

                    switch(n){
                        case 1:
                            o.createGift();
                        case 2:
                            o.Topup();
                        case 3:
                            o.Transaction();
                        case 4:
                            o.Block();
                        case 5:
                            break;
                    }}
                while(n==5);
            }
        }


    }

    void createGift(){

        card[k]=car;
        pin[k]=p++;
        System.out.println("Your card id is:"+card[k]+"\n pin of card id:"+pin[k]);
    }
    void Topup(){
        System.out.println("Enter ur Giftcard num to topup");
        String e=s.next();
        int pi=s.nextInt();
        for(int i=0;i<card.length;i++)
        {
            if(card[i].equals(e)&&pin[i]==(pi)){
                System.out.println("Enter the amount to top up");
                int v=s.nextInt();
                amo[k]=amo[k]-v;
            }
            else
                System.out.println("Wrong card num");
        }
    }
    void Transaction(){

    }
    void Block(){
        System.out.println("enter ur card number");
        //int i;
    }
}
class User extends Detials{
    Scanner s=new Scanner(System.in);
	
    public void signup(){
        System.out.println("Enter ur name");
        name[k] =s.next();
        System.out.println("Eneter ur password");
        String password=s.next();
        System.out.println("Conform password");
        String cpass =s.next();
        if(cpass.equals(password))
        {
            id[k]=name[k];
            passw[k]=password;
            login(name,password);
        }
    }
    public void login(String[] name, String pass){
        String idname=s.next();
        String upassw=s.next();
        if(idname.equals(name)&&upassw.equals(pass))
             Detials();

        else
            signup();
    }
    public void User(){

        System.out.println("Enter 1.login\n2.Signup");
        int n=s.nextInt();
        switch(n){
            case 1:
                login(name,passw);
            case 2:
               signup();
        }



    }
}
class transactio extends Detials{
    public void transact(){
    }

}