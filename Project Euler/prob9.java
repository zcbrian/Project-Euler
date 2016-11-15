
public class prob9 {

	
	public static void main(String[] args) {
		int a =0, b=0, c=0;
		
		for(a = 0; a < 998; a++){
			for(b = 1; b < 998; b++){
				c = 1000 - a -b;
				//System.out.println(a+ " " +b+ " "+c);
				if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)){
					System.out.println(a*b*c);
				}
			}
		}
		
		
		
	}

}
