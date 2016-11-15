import java.math.BigInteger;


public class prob5 {


	
	public static void main(String[] args) {
		
		
		BigInteger big = new BigInteger("982289");
		BigInteger walker = new BigInteger("1");
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		
		while (walker != big){
			if(big.mod(walker).compareTo(zero) == 0){
				System.out.println(walker);
			}
			//System.out.println(" " + walker);
			walker = walker.add(one);
			
		}
		;
	}
}
