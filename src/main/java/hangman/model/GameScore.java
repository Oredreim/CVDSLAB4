package hangman.model;
public interface GameScore{
	/***
	*@pre los parametros de entrada son enteros 
	*@param correctCount 
	*@param incorrectCount 
	*@throws correctCount < 0 
	*@throws incorrectCount < 0 
	***/
	int calculateScore(int correctCount,int incorrectCount);

	int reset(); 
}
