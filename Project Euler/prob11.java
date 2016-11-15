import java.io.*;
import java.util.StringTokenizer;

public class prob11 {
	public static String fileRead(String pathName){
		String output = "";
		try{
		    // Open the file that is the first 
		    // command line parameter
		    FileInputStream fstream = new FileInputStream(pathName);
		    // Get the object of DataInputStream
		    DataInputStream in = new DataInputStream(fstream);
		        BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String strLine;
		    //Read File Line By Line
		    while ((strLine = br.readLine()) != null)   {
		      // Print the content on the console
		      output = output + " " + (strLine);
		    }
		    //Close the input stream
		    in.close();
		    }catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		    }
  
		return output;
	}
	
	public static int maxProd(int[][] grid, int i, int j){
		int prod = 0;
		if( (grid[i][j]* grid[i-1][j]* grid[i-2][j]* grid[i-3][j])  > prod ){
			prod = (grid[i][j]* grid[i-1][j]* grid[i-2][j]* grid[i-3][j]);
		}
		if( (grid[i][j]* grid[i][j-1]* grid[i][j-2]* grid[i][j-3])  > prod ){
			prod =  (grid[i][j]* grid[i][j-1]* grid[i][j-2]* grid[i][j-3]);
		}
		if( (grid[i][j]* grid[i+1][j+1]* grid[i+2][j+2]* grid[i+3][j+3])  > prod ){
			prod =  (grid[i][j]* grid[i+1][j+1]* grid[i+2][j+2]* grid[i+3][j+3]);
		}
		if( (grid[i][j]* grid[i+1][j]* grid[i+2][j]* grid[i+3][j])  > prod ){
			prod = (grid[i][j]* grid[i+1][j]* grid[i+2][j]* grid[i+3][j]) ;
		}
		if( (grid[i][j]* grid[i+1][j+1]* grid[i+2][j+2]* grid[i+3][j+3])  > prod ){
			prod = (grid[i][j]* grid[i+1][j+1]* grid[i+2][j+2]* grid[i+3][j+3]) ;
		}
		if( (grid[i][j]* grid[i][j+1]* grid[i][j+2]* grid[i][j+3])  > prod ){
			prod =  grid[i][j]* grid[i][j+1]* grid[i][j+2]* grid[i][j+3];
		}
		if( (grid[i][j]* grid[i-1][j-1]* grid[i-2][j-2]* grid[i-3][j-3])  > prod ){
			prod =  (grid[i][j]* grid[i-1][j-1]* grid[i-2][j-2]* grid[i-3][j-3]);
		}
		if( (grid[i][j]* grid[i-1][j+1]* grid[i-2][j+2]* grid[i-3][j+3])  > prod ){
			prod = (grid[i][j]* grid[i-1][j+1]* grid[i-2][j+2]* grid[i-3][j+3]) ;
		}	
		
		return prod;
	}
	
	public static void main(String[] args) {
		String input = fileRead("C:\\Documents and Settings\\zcbrian\\Desktop\\euler.txt");
		System.out.println(input);
		int[][] grid = new int[20][20];
		 StringTokenizer st = new StringTokenizer(input);
	     while (st.hasMoreTokens()) {
	    	 for(int i = 0; i < 20;i++){
	    		 for(int j = 0; j < 20;j++){
	    			 grid[i][j] = Integer.parseInt(st.nextToken());
	    		 }
	    	 }
	     }
		
//	     for(int i = 0; i < 20;i++){
//    		 for(int j = 0; j < 20;j++){
//    			 System.out.print(grid[i][j] + " ");
//    		 }
//    		 System.out.println();
//	     }
		
	    int max = 0;
	     for(int i = 3; i < 16;i++){
    		 for(int j = 3; j < 16;j++){
    			 if(maxProd(grid, i, j) > max){
    				 max = maxProd(grid, i, j);
    		 		}
    		 }
	     }
	     
	     System.out.println(max);
	
	}

}
