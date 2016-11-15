import java.math.BigInteger;

public class prob48 {
	
	public static BigInteger bint(int in){
		BigInteger out = new BigInteger(Integer.toString(in));
		return out;
	}
	
	public static void main(String[] args) {
		BigInteger sum = bint(0);
		int counter = 1;
		while(counter <= 1000){
			sum = sum.add(bint(counter).pow(counter) );			
			
			System.out.println(counter + "\t"+ sum);
			counter++;
		}
	
	}
	
}
