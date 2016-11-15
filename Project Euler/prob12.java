import java.math.BigInteger;


public class prob12 {

	public static BigInteger int2B(int in){
		BigInteger out = new BigInteger(Integer.toString(in));
		return out;
	}
		
	public static int tri(int input){
		
		int divisors = 0;
		
		int sum = (input*(input+1))/2;
		
		for (int i= 1; i <=sum;i++){
			if (sum % i ==0){
				divisors++;
			}
		}
		System.out.println(input + " "+ sum+" " + divisors);
		return divisors;
	}
	
	public static void main(String[] args) {
//		for(int i = 1;i < 8; i ++){
//			tri(i);
//		}
		int out= 0;
		int i=0;
		while(tri(i) < 500){
			i++;
		}
		
		
	}

}
