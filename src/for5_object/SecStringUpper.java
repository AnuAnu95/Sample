package for5_object;

public class SecStringUpper {
	public static void main(String[] args) {
		String a="UniverSity";
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {	  
			if(i==1) {
				String e=String.valueOf(b[i]);
	    System.out.println(e.toUpperCase());
	}
			else if(i==5) {
				String f=String.valueOf(b[i]);
				System.out.println(f.toUpperCase());
			}
			else if (i!=1&&i!=5) {
			 String d=String.valueOf(b[i]);
		        System.out.println(d.toLowerCase());
	}
}
}
}