package arrayProblems;

public class NewYearChaos {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6,7,8,9,12,10,11};
		int b = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1 && arr[i]-(i+1)>2) {
				b=arr[i]-i-1;
				System.out.println(b);
				System.out.println("Too chaotic");
			}else if(arr[i]!=i+1 && arr[i]-(i+1)<=2 && arr[i]-(i+1)>0)  {

				b=arr[i]-i-1;
				System.out.println(b);
				break;

			}
		}
				
		
	}

}
