import java.util.*;
 
/**
 *
 * @author Javed
 */
public class SockMerchant {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of socks");

        int n = in.nextInt();
        System.out.println("Enter socks color codes");

        int c[] = new int[n];
       
        for(int c_i=0;c_i<n;c_i++) {
        	c[c_i]=in.nextInt();  	
        }
        Arrays.sort(c);
        int total =0;
        for(int i=0;i<n-1;i++) {
        	if(c[i]==c[i+1]) {
        		total++;
        		i=i+1;
        	}
        }
        System.out.println(total);
}
}