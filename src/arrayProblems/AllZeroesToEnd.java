package arrayProblems;

public class AllZeroesToEnd {

	public static void main(String[] args) {

		int [] arr = {1,0,7, 2, 0, 0, 0, 3, 6};
		int[] temp=new int[arr.length];
		int c=0;int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(temp[i]+"\t");
		}
	}

}
