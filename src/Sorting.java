
public class Sorting {

	public static void main(String[] args) {
		int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;			
				}
			}
			System.out.print(arr[i]+"\t");
		}	
	}

}
