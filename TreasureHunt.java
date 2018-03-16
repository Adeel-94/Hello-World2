
public class TreasureHunt {
 
	
	public static void main(String[] args) {
		
		System.out.println("You find yourself in a messy room");
		
		System.out.println("walk around room to 'look' for hints around the room");
		
		// scanner 
		//please look
		System.out.println("you will find a magic compass, pick it up");
		
		System.out.println("open device and check for readings");
		
		System.out.println("follow the readinings on device to get to the treasure box");
		
		System.out.println("you find the treasure, you win, the game end");
		
		String twoDArray[][] = {{"[]", "[]", "[]"}, {"[]", "[]", "[]"}, {"[]", "[]", "[]"}};
		// columns
		for (int i = 0; i < twoDArray.length; i++) {
		// rows
		for (int j = 0; j < twoDArray[i].length; j++) {
		System.out.print(twoDArray[i][j]);
		}
		// after each row, print a new line
		System.out.println();
		}}}

	
	
	
	
	
	

	

	
	
	
