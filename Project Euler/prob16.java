import java.math.BigInteger;




public class prob16 {
	
	public static BigInteger fact(){
		int walk = 100;
		BigInteger prod = new BigInteger("1");
		
		while(walk!= 1){
			String in = Integer.toString(walk);
			BigInteger multi = new BigInteger(in);
			prod = prod.multiply(multi); 
			walk--;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		//BigInteger sum = new BigInteger("2");
		//sum = sum.pow(1000);
		//System.out.print(sum);
		
		String in = fact().toString();
		//in = "1234";
		int a = in.length();
		
		int res = 0;
		
		while(a != 0){
			res = res + Integer.parseInt(in.substring(a-1,a));
			a--;
		}
		System.out.println(res);
	}
}
