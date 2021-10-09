
public class RepeatedStrings {

	public static void main(String[]args) {
		String s="abcda";
		long n=99;
		long rp=0;
		long rpD=0;

		System.out.println(n/s.length());
		System.out.println(n%s.length());
		char[] ch =s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='a') {
				rp=rp+1;
			}
		}
		for(int i=0;i<(n%s.length());i++) {
			if(ch[i]=='a') {
				rpD=rpD+1;
			}
		}
		rp=rp*(n/s.length())+rpD;
		System.out.println(rp);
	}
	
}
