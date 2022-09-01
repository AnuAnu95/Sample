package for5_object;

public class StringInt {
	public static void main(String[] args) {
		String a="5547";
		char[] b=a.toCharArray();
		int c=0;
		for(int i=0;i<b.length;i++) {
			int d=Integer.parseInt(String.valueOf(b[i]));
			c=c+d;
		}
		System.out.println(c);
	}
}
