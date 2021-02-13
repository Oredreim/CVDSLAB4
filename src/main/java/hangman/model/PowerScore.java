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
		result = (int) (result - (8*incorrectCount) + (Math.pow(5,correctCount)));

		if (result < 0 || result == 1 ){
			result = 0;
		} 
		if (result > 500 ){
			result = 500;
		}
		return result ;
	}
}