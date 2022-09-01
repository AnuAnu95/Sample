package for5_object;

public class SplitString {
public static void main(String[] args) {
	String b="d|e|f|abc|jsj";
	//String[] a=b.split("[|]");
	String[] c=b.split("\\|");
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
}
}
