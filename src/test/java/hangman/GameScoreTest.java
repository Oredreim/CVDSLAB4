package hangman;
import junit.framework.*; 
import hangman.model.*; 
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest{
	 

	@Test
	public void correctLetterPowerScore(){
		PowerScore o = new PowerScore();
		Assert.assertEquals(o.calculateScore(2,0),25);
	}

	@Test 
	public void incorrectLetterPowerScore(){
		PowerScore o = new PowerScore();
		Assert.assertEquals(o.calculateScore(2,1),17);
	}
	@Test
	public void initialScorePowerScore(){
		PowerScore o = new PowerScore();
		Assert.assertEquals(o.calculateScore(0,0),0);
	}

	@Test
	public void maxPointsPowerScore(){
		PowerScore o = new PowerScore();
		Assert.assertEquals(o.calculateScore(5,0),500); 
	}

	//+++++++++++++++++++++++++++++++++++++++++++++++++++
	
	@Test
	public void correctLetterBonusScore(){
		BonusScore o = new BonusScore();
		Assert.assertEquals(o.calculateScore(1,0),10);
	}

	@Test 
	public void incorrectLetterBonusScore(){
		BonusScore o = new BonusScore();
		Assert.assertEquals(o.calculateScore(1,6),0);
	}

	@Test
	public void initialScoreBonusScore(){
		BonusScore o = new BonusScore();
		Assert.assertEquals(o.calculateScore(0,0),0);
	}
	//+++++++++++++++++++++++++++++++++++++++++++++++++++

	@Test
	public void correctLetterOriginalScore(){
		OriginalScore o = new OriginalScore();
		Assert.assertEquals(o.calculateScore(10,0),100);

	}
	@Test 
	public void incorrectLetterOriginalScore(){
		OriginalScore o = new OriginalScore();
		Assert.assertEquals(o.calculateScore(0,5),50);
	}
	@Test
	public void initialScoreOriginalScore(){
		OriginalScore o = new OriginalScore();
		Assert.assertEquals(o.calculateScore(0,0),100);
	}

}