public class AbstactDemo{
	public static void main(String [] args) {
		Students s1=new Students();
		Teacher t1=new Teacher();
		//Member m1=new Students();
		
	}
}
abstract class Member {
	private String name;
	abstract void WelcomeMessage();
	
}
class Students extends Member{
	void WelcomeMessage() {
		System.out.println("Hello Student...");
	}
}
class Teacher extends Member{
	void WelcomeMessage() {
		System.out.println("Hello Teacher...");
	}
}
