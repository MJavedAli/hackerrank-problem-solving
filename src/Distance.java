
public class Distance {
	public static void main(String arg []) {
    	int c = Solution.solve("x...o.x...o");
    	System.out.println(c/2);
    	
    }
}
class Solution {
	    public static int solve(String A) {
	        char[] ch = A.toCharArray();
	        int dist = Integer.MAX_VALUE;
	        for(int i=0;i<A.length();i++) {
	        	if(ch[i]=='o') {
	        		for(int j=i+1;j<A.length();j++) {
	        			if (('o'==ch[i] && 'x'==ch[j]
	                            || 'o'==ch[i] && 'x'== ch[j])
	                           && dist > Math.abs(i - j))
	                           dist = Math.abs(i - j);
	        		}
	        	}
	        }
	        for(int i=0;i<A.length();i++) {
	        	if(ch[i]=='x') {
	        		for(int j=i+1;j<A.length();j++) {
	        			if (('x'==ch[i] && 'o'==ch[j]
	                            || 'x'==ch[i] && 'o'== ch[j])
	                           && dist > Math.abs(i - j))
	                           dist = Math.abs(i - j);
	        		}
	        	}
	        } 
	        if (dist > A.length()) {
	            return -1;
	        }
	        return dist;
	        
	    }
	}
