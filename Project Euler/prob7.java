
public class prob7 {
	
	
	public static boolean chkPrime(int input){
		boolean res = true;
		
		for(int i = 2; i < input; i++){
			if (input % i != 0){
				res = res && true;
			}else{
				res = res && false;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		int resPrime = 0;
		int nthPrime = 0;
		int walker = 3;
		while(nthPrime != 10001){
			if(chkPrime(walker)){
				resPrime = walker;
				nthPrime++;
				System.out.println(nthPrime +" " +walker);
			}
			
			walker++;
		}
		
		System.out.println(resPrime);		
		
	}

}
