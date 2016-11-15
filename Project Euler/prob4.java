
public class prob4 {

	public static boolean isPal(int input){
		boolean pass = true;
		String in = Integer.toString(input);
		int head = 0;
		int tail = in.length()-1;
		
		//System.out.println(in);
		
		while( head != tail && head < tail){
			if(		in.charAt(head) == (in.charAt(tail))	){
				pass = pass && true;
			}else{
				pass = pass && false;
			}
	
			head++;
			tail--;		
		}
	
		return pass;
	}
	
	
	public static void main(String[] args) {
		int res=0;
		for(int i = 999; i > 100; i--){
			for(int j = 999; j > 100; j--){
				if(i*j> res && isPal(i*j)){
					res = i*j;
				}
			}
		}
		System.out.println(res);
		String a = "dfaddsdfdasf";
		if(a.contains("fadf")){
			System.out.println("NO DONES");
		}
		
		
		
	}

}
