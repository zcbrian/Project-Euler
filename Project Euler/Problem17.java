public class P17 {

/*
 * Thought about creating a function that would essentially change
 * a number into English. ex. 
 * 
 * public String int2Eng (int number){
 * 	...
 *	return English 
 * }
 * int2Eng(345);// returns:threehundredandfourtyfive
 * 
 * Instead, I would parse the number into denomations and have a
 * function figure out the number of characters directly. ex.
 * 
 * public int numOfEngInt (int number){
 * 	...
 * 	return numberOfCharactersOfThe 
 * }
 * numOfEngInt(345);// returns: 25
 * 
 * 3|4|5 
 * numOfEngInt(300) = 15
 * numOfEngInt(40) = 6
 * numOfEngInt(5) = 4
 * 15 + 6 + 4
 */	
	
	static int[] baseCases1to9 =		{0,3,3,5,4,4,3,5,5,4};
	static int[] baseCases10to19 =		{3,6,6,8,8,7,7,9,8,8};
	static int[] baseCasesTens20to90 =	{0,0,6,6,6,5,5,7,6,6};
		
	/*
	 * 	baseCases1to9. ex. 4 = four = 5 -> baseCases1to9[4]=5 
	 	001 = one = 3
		002 = two = 3
		003 = three = 5
		004 = four = 4
		005 = five = 4
		006 = six = 3
		007 = seven = 5
		008 = eight = 5
		009 = nine = 4
		
		baseCases10to19. ex. 17 = seventeen = 7 -> (10+7)use the seven :baseCases10to19[7]=7 
		010 = ten = 3
		011 = eleven = 6
		012 = twelve = 6
		013 = thirteen = 8
		014 = fourteen = 8
		015 = fifteen = 7
		016 = sixteen = 7
		017 = seventeen = 9
		018 = eighteen = 8
		019 = nineteen = 8
		
		baseCasesTens20to90. ex. 30 = thirty = 6 -> (10*3)use the three :baseCasesTens20to90[3]=6
		020 = twenty = 6
		030 = thirty = 6
		040 = fourty = 6
		050 = fifty = 5
		060 = sixty = 5
		070 = seventy = 7
		080 = eighty = 6
		090 = ninety = 6
	
	*/
	
	public static int intToEnglish(int input){
		//takes a number and outputs the the length of the number's English equivalent 
		
		int output = 0;//keeps running out of characters
		int [][] inputArray = new int [1][3];//place to store number->array
		
		
		if(input > 999){//checks if a number is more than 999
			output += 11; //onethousand = 11
		}else{
			inputArray[0][0] = (((int)(input * .01)) % 10);
			inputArray[0][1] = (((int)(input * .1)) % 10);
			inputArray[0][2] = (((int)(input * 1)) % 10);
		}
		
		
		if( inputArray[0][0] == 0){
			//if hundreds place is zero, do nothing
		}else{
			output += baseCases1to9[inputArray[0][0]];
			//add ones place (is same as hundreds) ex. 790->7->5  
			output += 7;//add 7 for the word "hundred"
			if( inputArray[0][0] == 0 &&  inputArray[0][1] == 0){//checks zeros in tens and ones
				//do nothing
			}else{
				output+= 3;//for the word "and"
			}
		}
		
		if (inputArray[0][1] == 1){//checks if 10 to 19
			output += baseCases10to19[inputArray[0][2]];//takes the ones place
		}else{
			output += baseCasesTens20to90[inputArray[0][1]];//is 20 to 90
		}
		
		if (inputArray[0][1] == 1){//make sure to not overlap with ten's place
			//do nothing, already handled above
		}else{
			output += baseCases1to9[inputArray[0][2]];//handle ones place
		}
			
		return output;
	}
	
	
	public static void main(String[] args) {
		int a = (((int)(23*.1)) % 10);
		System.out.println(a);
		System.out.println(intToEnglish(152));
	}

}
//342=23
//115=20