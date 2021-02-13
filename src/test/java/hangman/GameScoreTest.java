package hangman;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest{
	private OriginalScore o = new OriginalScore(); 

	@Test
	public void correctLetterPowerScore(){
		assertEquals(o.calculateScore(2,0),25);

	}
	@Test 
	public void incorrectLetterPowerScore(){
		assertEquals(o.calculateScore(2,1),17);
	}
	@Test
	public void initialScorePowerScore(){
		assertEquals(o.calculateScore(0,0),0);
	}

	@Test
	public void maxPointsPowerScore(){
		assertEquals(o.calculateScore(5,0),500); 
	}

	//+++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test
	public void correctLetterBonusScore(){
		assertEquals(o.calculateScore(1,0),10);

	}
	@Test 
	public void incorrectLetterBonusScore(){
		assertEquals(o.calculateScore(10,5),15);
	}
	@Test
	public void initialScoreBonusScore(){
		assertEquals(o.calculateScore(0,0),0);
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++

	@Test
	public void correctLetterOriginalScore(){
		assertEquals(o.calculateScore(10,0),100);

	}
	@Test 
	public void incorrectLetterOriginalScore(){
		assertEquals(o.calculateScore(0,5),50);
	}
	@Test
	public void initialScoreOriginalScore(){
		assertEquals(o.calculateScore(0,0),100);
	}

}