import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList  locations = new ArrayList();

		GameHelper helper = new GameHelper();

		DotCom sld = new DotCom();

		int numOfGuesses = 0;

		int randomNum = (int) (Math.random()*5);					//COMPUTE a random number between 0 and 4

		locations.add(randomNum);									//MAKE an int array with the 3 cell locations, and
		locations.add(randomNum+1);
		locations.add(randomNum+2);

		sld.setLocationCells(locations);							//INVOKE setLocationCells on the dot com object

		boolean isAlive = true;

		while(isAlive){												//WHILE the dot com is still alive GET user input

			String guess = helper.getUserInput("Enter your number");

			String result = sld.checkYourself(guess);				//INVOKE checkYourself() on dot com

			numOfGuesses++;

			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}





























	/*int[] locations ={2,3,4};

	sld.setLocationCells(locations);


	String usersGuess = "2";

	String result = sld.checkYourself(usersGuess);

	String testResult = "Failed";

	if(result.equals("hit")){
	    testResult = "passed";
    }
        System.out.println(testResult);
    }

	 */
