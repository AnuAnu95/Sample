package for5_object;


public class Adding {
	public static void main(String[] args) {
		int a=167;
		String b= Integer.toString(a);
		char c[]=b.toCharArray();
		int d=0;
	for(int i=0;i<c.length;i++) {
		int f=Integer.parseInt(String.valueOf(c[i]));
		d=d+f;
	}
	System.out.println(d);
	}
}
