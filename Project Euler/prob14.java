import java.math.BigInteger;


public class prob14 {

	public static BigInteger int2B(int in){
		BigInteger out = new BigInteger(Integer.toString(in));
		return out;
	}
	
	
	public static int newChain(int in){
		int chnLen = 1;
		BigInteger currentTerm = new BigInteger(Integer.toString(in));		
		while( !((currentTerm.compareTo(int2B(1))) == 0)){
		
			if (currentTerm.mod(int2B(2)).compareTo(int2B(0)) == 0){
				currentTerm = currentTerm.divide(int2B(2));
			}else{
				currentTerm = currentTerm.multiply(int2B(3)).add(int2B(1)) ;
			}
			chnLen++;
		}
		return chnLen;
	}	
	public static void main(String[] args) {
		int max = 0;
		int temp = 0;
		
		for (int i = 2; i < 1000000;i ++){
			temp = newChain(i);
			System.out.println(i + "\t\t" + temp);
			if (temp == 525){break;}
			if (max < temp){
				max = i;
			}
		}

		//System.out.println("Chain Length "+ newChain(13));
		System.out.println("Chain Length "+ max);
	}

}
