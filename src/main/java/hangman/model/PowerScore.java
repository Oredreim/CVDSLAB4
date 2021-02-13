package hangman.model;

public class PowerScore implements GameScore{
	/**
	*@pos result = result + 5**correctCount
	*@pos result = result - 8 ** incorrectCount 
	*@pos result >= 0 
	*@pos result <= 500 
	**/
	public int calculateScore(int correctCount , int incorrectCount){
		int result = 0;
		result = result - (8*incorrectCount) + (5**correctCount)

		if (result < 0){
			result = 0;
		} 
		if (result > 500 ){
			result = 500;
		}
		return result ;
	}
}