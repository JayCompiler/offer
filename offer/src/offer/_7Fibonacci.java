package offer;

public class _7Fibonacci {

	public static void main(String[] args) {

	}
	 public int Fibonacci(int n) {
		 if(n==1) {
			 return 1;
		 }
		 if(n==2) {
			 return 1;
		 }
		 int first=1;
		 int second=1;
		 int reS=0;
		 for(int i=3;i<=n;i++) {
			 reS=first+second;
			 first=second;
			 second=reS;
		 }
		 return reS;
	 }
}
