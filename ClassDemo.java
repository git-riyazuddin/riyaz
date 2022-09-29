public class ClassDemo{
		public static void main(String[]args){
		Box blackBox;
		blackBox=new Box(10,8,6);
	/*	blackBox.length=10;
		blackBox.breadth=8;
		blackBox.height=6;*/
		blackBox.set(5,4,9);
		int v=blackBox.volume();
		System.out.println(v);
	/*	int v=blackBox.volume();
		System.out.println(v);*/
	}
}
class Box{
	int length;
	int breadth;
	int height;
		Box (int l,int b,int h){
			length=l;
			breadth=b;
			height=h;
		}
			void set(int l,int b,int h){
			length=l;
			breadth=b;
			height=h;
		}
	int volume(){
		
	
		return length*breadth*height;
	}
	
}
