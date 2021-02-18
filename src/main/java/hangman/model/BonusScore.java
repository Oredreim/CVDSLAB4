package hangman.model;

public class BonusScore implements GameScore{
	/***
	*@pos result = result + 10 * correctCount
	*@pos result = result -5 * incorrectCount
	*@pos result >= 0 
	**/			
	public int calculateScore(int correctCount , int incorrectCount){
		int result = 0; 
		result = result + 10*correctCount - 5*incorrectCount;
		if(result < 0 ) {
			result = 0 ;  
		}
		
		return result;
	}
	
	@Override
	public int reset() {
		return 0;
		
	}
	
}