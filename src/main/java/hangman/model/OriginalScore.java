package hangman.model;
public class OriginalScore implements GameScore{

	/**
	*@pos result = 100 - 10*incorrectCount
	*@pos result >= 0 
	*@return result
	**/
	
	public int calculateScore(int correctCount , int incorrectCount){
		int result = 100; 
		result = result -  10*incorrectCount;
		return result;
	}
	
	@Override
	public int reset() {
		return 100;
		
	}
}
