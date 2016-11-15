
public class prob2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int temp = 0;
		int sum = 0;
		
		while(b < 4000000){
			temp = a + b;
			a = b;
			b = temp;
			System.out.println(b);
			if (b % 2 == 0){
				sum = sum + b;
			}
		}
		System.out.println(sum);
	}

}
