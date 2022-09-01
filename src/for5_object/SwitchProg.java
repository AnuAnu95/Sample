package for5_object;

import java.util.ArrayList;

public class SwitchProg {
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	ArrayList<Integer> val=new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		val.add(a[i]);
	}
	    val.forEach(x->{
			if(x==1) {
				for(int i=0;i<=25;i++) {
					System.out.println(i);
				}
			}
			else if(x==2) {
				for(int i=0;i<=25;i=i+2) {
					System.out.println(i);
				}
			}
			else if(x==3) {
				for(int i=0;i<=25;i=i+3) {
					System.out.println(i);
				}
			}
			else if(x==4) {
				for(int i=0;i<=25;i=i+4) {
					System.out.println(i);
				}
			}
			else if(x==5) {
				for(int i=0;i<=25;i=i+5) {
					System.out.println(i);
				}
			}
	});
}
}