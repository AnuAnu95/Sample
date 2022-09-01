package for5_object;


public class Separate {
	public static void main(String[] args) {
		String word="phone";	
		if(word.length()%2==0) {
				System.out.println(word.substring(0,(word.length()/2))+"-"+word.substring(word.length()/2, word.length()));
			}
			else {
				System.out.println(word.substring(0,(word.length()/2))+"-"+word.charAt(word.length()/2)+"-"+word.substring((word.length()/2+1),word.length()));
			}
	}
}
        