import java.math.BigInteger;


public class prob25 {

	public static BigInteger bint(int in){
		BigInteger out = new BigInteger(Integer.toString(in));
		return out;
	}
	
	public static void main(String[] args) {
		BigInteger a = bint(1);
		BigInteger b = bint(1);
		BigInteger c = bint(1);
		int i = 1;
		while(a.toString().length() < 1000){
			c = b;
			b= b.add(a);
			a = c;
			i++;
			System.out.println(i + "\t" + a.toString().length() +"\t" +a);
		}

	}

}
