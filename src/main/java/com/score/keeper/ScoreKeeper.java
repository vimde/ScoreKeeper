package com.score.keeper;

public class ScoreKeeper {

	private Team teamA;
	private Team teamB;
	
	public ScoreKeeper() {
		teamA = new Team("A");
		teamB = new Team("B");
	}

	public void scoreTeamA1() {
		teamA.addScore(Point.ONE);
	}

	public void scoreTeamA2() {
		teamA.addScore(Point.TWO);
	}

	public void scoreTeamA3() {
		teamA.addScore(Point.THREE);
	}

	public void scoreTeamB1() {
		teamB.addScore(Point.ONE);
	}

	public void scoreTeamB2() {
		teamB.addScore(Point.TWO);
	}

	public void scoreTeamB3() {
		teamB.addScore(Point.THREE);
	}

	public String getScore() {
		return teamA.toString() + ":" + teamB.toString();
	}
}
