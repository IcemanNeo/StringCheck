package sp.Main;

public class Main {
	public static void main(String[] args) {
		
		String chart[][] = new String[][] {{"D", "HHH"}, {"E", "HHK"}, {"C", "HKK"}};
		String testInput = "DEC";
		
		/** 
		 * 	How this works:
		 * 	First, we need to think about positions in array; "D" = [0][0], "HHH" = [0][1], 
		 *  "E" = [1][0], "HHK" = [1][1].. so on.
		 *  
		 *  The First loop i will count 0, 1, 2
		 *  The Second loop j will alternate between 0 and 1, we use chart.length, which is 3, minus 1
		 *  The Second loop will work for added items to the chart[][]
		 *  
		 *  We only want to the condition if j == 0, since any strings in position 1 are the value we will print
		 *  We check the character in the input string at i, if it's equal to the chart[i][j].charAt[0]..
		 *  
		 *  We need to only check the 0 position of the chart string because we are assuming there is only
		 *  one char we need to check.
		 *  
		 *  Print out the chart[i][j+1]; plus 1 because we need to print out the result.
		 */
		
		for(int i = 0; i < chart.length; i++) {
			for(int j = 0; j < chart.length - 1; j++) {
				if(j == 0) {
					if(testInput.charAt(i) == chart[i][j].charAt(0)) {
						System.out.print(chart[i][j+1]);
					}
				}
			}
		}
		
	}
}
