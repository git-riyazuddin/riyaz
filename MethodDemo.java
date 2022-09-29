class MethodDemo{
	static int boxVolume(int length,int breadth,int height){
		int vol;
		vol=length*breadth*height;
		return vol;
	}
		
	public static void main(String [] args){
		System.out.println(boxVolume(10,20,5));
	}
}
	