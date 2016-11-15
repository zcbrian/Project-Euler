import java.math.BigInteger;


public class prob10 {

	public static boolean chkPrime(int input){
		boolean res = true;
		if (input % 2 == 0 && input !=2 ){
			res = res && false;
		}
		
		int i = 3;
		while(i < input){
			if (input % i != 0){
				res = res && true;
			}else{
				res = res && false;
			}
		
			i=i+2;
		}
		return res;
	}
	
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("2");
		int i = 3;
		while(i <2000000){
			System.out.println(i);
			if(chkPrime(i)){
				String in = Integer.toString(i);
				BigInteger val = new BigInteger(in);
				sum =sum.add(val);
				System.out.println("----------------------"+sum);	
			}
			
			i = i+2;
		}
		
		System.out.println("------------------------"+sum);

		//System.out.println(chkPrime(5));
		
		
	}

}
