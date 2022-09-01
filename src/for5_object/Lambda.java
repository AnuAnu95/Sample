package for5_object;

import java.util.ArrayList;

public class Lambda {

	public static void main(String [] args) {
		int a=8;
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(a);
		nums.forEach(i->{
			if(i%2==0) {
				System.out.println(i+"is even");
			}
			else {
				System.out.println(i+"is odd");
			}
		});	
	}
}
