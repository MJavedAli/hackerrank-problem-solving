package arrayProblems;

public class ArrayRotation {

	public static void main(String[] args) {

		int [] arr = {121, 232, 33, 43 ,5};
		Result.leftRotateByOne(arr,2);	
		System.out.println();
		Result.rightRotateByOne(arr, 2);
	}
}

class Result{
public static void leftRotateByOne(int[] arr, int d) {
	int [] temp=new int[arr.length];
	int c=0;
	for(int i=d;i<arr.length;i++) {
		temp[c]=arr[i];
		c++;
	}
	for(int i=0;i<d;i++) {
		temp[arr.length-d+i]=arr[i];
	}
	
	for(int i=0;i<arr.length;i++) {
		
		System.out.print(temp[i]+"\t");
	}
	}

public static void rightRotateByOne(int[] arr, int d) {
	int [] temp=new int[arr.length];
	int c=0;
	
	for(int i=arr.length-d;i<arr.length;i++) {
		temp[c]=arr[i];
		c++;
	}
	for(int i=0;i<arr.length-d;i++) {
		temp[c]=arr[i];
		c++;
	}
	
	for(int i=0;i<arr.length;i++) {
		
		System.out.print(temp[i]+"\t");
	}
	}
}