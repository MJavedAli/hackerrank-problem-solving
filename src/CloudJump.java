import java.util.Arrays;
import java.util.List;

public class CloudJump {

	public static void main(String[] args) {
		List<Integer> c = Arrays.asList(0,1,0,0,0,1,0);
		int noOfJumps = 0, i = 0;
		while(true) {
			if(i + 2 < c.size() && c.get(i+2)== 0) {
				i += 2;
			} else if(i + 1 < c.size()) {
				i++;
			} else {
				break;
			}
			noOfJumps++;
		}
		
		System.out.println(noOfJumps);
	}

}
