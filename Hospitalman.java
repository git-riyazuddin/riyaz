import java.util.*;

public class Hospitalman{
   public static void main(String []args){
     Scanner s=new Scanner(System.in);
        data d=new data();
     int n=s.nextInt();
     for(int i=0;i<n;i++) {
                 d.data();
     }
	 d.result();
    }

}
class EDetials{
    Scanner s=new Scanner(System.in);
    String pid="10";
    String Id;
    String Name;
    String phone;
    float in;
    float time;
    float out;
    float pout;
    float wait;
    float docter;
    String Discription;
    public EDetials(String Id,String Name,float in,float time,float out,float pout,float wait,float docter,
    String Disciption,String phone) {
        this.Id = Id;
        this.Name = Name;
        this.in = in;
        this.time = time;
        this.out = out;
        this.pout = pout;
        this.phone=phone;
        this.wait = wait;
        this.docter = docter;
        this.Discription=Disciption;
    }
    public String toString() {
        return Id+"\t"+Name+"\t"+in+"\t"+docter+"\t"+out+"\t"+wait+"\t"+Discription;
    }
}


class data {
    
    String pid = "10";
    String Id;
    String Name;
    String phone;
    float in;
    float time;
    float out;
    float pout;
   static float wait = 0;
    float docter;
   static int k = 0;
   String Discription;

    public void data() {
        Scanner s = new Scanner(System.in);
        EDetials detials[] = new EDetials[20];
 System.out.println("please enter ur name");
         Name = s.next();
         System.out.println("please enter ur phone number");
         phone = s.next();

            Id = pid + k;
           
            System.out.println("please enter entry time in in 24 hours");
            in = s.nextFloat();
            time = in * 3600;
            System.out.println("enter doctor visiting time in min");
            docter = s.nextFloat();
            System.out.println("please enter exit time in in 24 hours ");
            out = s.nextFloat();
            pout = out * 3600;
            float duration = time + (docter * 60) + (15 * 60) + wait;
            wait = time + duration - pout;
            if (wait > 0)
                Discription = "sorry";
			else
				Discription=" ";
            detials[k++] = new EDetials(Id, Name, in, time, out, pout, wait, docter, Discription, phone);

        }
		public void result(){
for(int i=0;i<k;i++)
    System.out.println(detials[i].Id+"\t"+detials[i].Name+"\t"+detials[i].phone+"\t"+detials[i].in+"\t"+detials[i].out+"\t"+detials[i].Discription);


    }
}