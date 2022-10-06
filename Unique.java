import java.util.*;
class Unique{
	public static void main(String[]args){
		int a[]={1,2,3,4};
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]!=a[j])
				for(int k=0;k<a.length;k++){
					if(a[k]!=a[i]&&a[k]!=a[j]){
						System.out.println(a[i]+""+a[j]+""+a[k]);
					count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}