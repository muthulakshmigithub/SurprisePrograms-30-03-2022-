public class NoOfPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4,5,6,9};
		int k=5;
		int sum=0;
		int n= arr.length;
		int count =0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum= arr[i]+arr[j];
				if(sum%k==0) {
					System.out.println(arr[i]+" "+arr[j]+" ");
					count++;
				}
			}
		}
		System.out.println("\nThere are "+count+" Pairs");
		
	}

}
