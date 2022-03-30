
public class Fibanocci {

	public static void main(String[] args) {
		
		//2. Write a program to find the first 10 fibonacci numbers that are also prime
        int n=10;
		int n1=2,n2=3,n3;
		System.out.print(n1+ " "+ n2+ " ");
		
		int i=2;
		
		while(i<n) {
			n3=n1+n2;
			int m=n3/2;
			int k=0;
			for(int j=2;j<=m;j++) {
				if(n3%j==0) {
					k=1;
					break;
				
				}
			}
			if(k==0) {
				System.out.print(n3+" ");
				i++;
				
			}
			
			n1=n2;
			n2=n3;
			
		}
		

	}

}
