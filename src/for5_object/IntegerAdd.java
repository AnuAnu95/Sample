package for5_object;

public class IntegerAdd {
	public static void main(String[] args) {
		int a=5478;
		int sum=0;
		int temp;
		while(a>0) {
			temp=a%10;
			sum=sum+temp;
			a=a/10;
		}
		System.out.println(sum);
	}
}
