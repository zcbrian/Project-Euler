
public class prob3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumsq= 0;
		int sqsum = 0;
		
		for(int i = 0; i <= 100; i ++){
			sumsq = sumsq + (int)(Math.pow(i,2));
			sqsum = (int)(Math.pow(5050, 2));
		}
		System.out.println(sumsq);
		
		System.out.println(sqsum - sumsq);

	}

}
