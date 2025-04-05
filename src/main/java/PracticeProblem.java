public class PracticeProblem {

	public static int sumOfDigits(int x) {
		x= Math.abs(x);
		if(x==0){
			return 0;
		}
		return (x%10) + sumOfDigits(x/10);
		

	}

	public static int factorial(int n){
		
		if(n==0){
			return 1;
		}

		if(n<0){
			return 0;
		}
		return n*factorial(n-1);
	}
}
