package com.score.keeper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ScoreKeeperTest {

	private ScoreKeeper scoreKeeper;

	@Before
	public void setup() {
		scoreKeeper = new ScoreKeeper();
	}

	@Test
	public void teamAScores1PointInASingleShot() {
		scoreKeeper.scoreTeamA1();
		assertEquals("001:000", scoreKeeper.getScore());
	}

	@Test
	public void teamAScores2PointsInASingleShot() {
		scoreKeeper.scoreTeamA2();
		assertEquals("002:000", scoreKeeper.getScore());
	}

	@Test
	public void teamAScores3PointsInASingleShot() {
		scoreKeeper.scoreTeamA3();
		assertEquals("003:000", scoreKeeper.getScore());
	}

	@Test
	public void teamBScores1PointInASingleShot() {
		scoreKeeper.scoreTeamB1();
		assertEquals("000:001", scoreKeeper.getScore());
	}

	@Test
	public void teamBScores2PointsInASingleShot() {
		scoreKeeper.scoreTeamB2();
		assertEquals("000:002", scoreKeeper.getScore());
	}

	@Test
	public void teamBScores3PointsInASingleShot() {
		scoreKeeper.scoreTeamB3();
		assertEquals("000:003", scoreKeeper.getScore());
	}

	@Test
	public void teamAScoresMoreThan10PointsInTheGame() {
		for(int i = 0; i < 5; i++) {
			scoreKeeper.scoreTeamA3();
		}
		assertEquals("015:000", scoreKeeper.getScore());
	}
	
	@Test
	public void teamBScoresMoreThan100PointsInTheGame() {
		for(int i = 0; i < 50; i++) {
			scoreKeeper.scoreTeamB3();
		}
		assertEquals("000:150", scoreKeeper.getScore());
	}
	
	@Test
	public void teamA_AndBScoreEqualNumberOfPointsInTheGame() {
		scoreKeeper.scoreTeamA2();
		scoreKeeper.scoreTeamB1();
		scoreKeeper.scoreTeamA1();
		scoreKeeper.scoreTeamB3();
		scoreKeeper.scoreTeamA3();
		scoreKeeper.scoreTeamB2();
		assertEquals("006:006", scoreKeeper.getScore());
	}
}
