package com.score.keeper;

public class Team {

	private int score;
	private String name;

	public Team(final String name) {
		this.name = name;
	}

	public void addScore(final Point point) {
		this.score += point.getValue();
	}
	
	@Override
	public String toString() {
		return String.format("%03d", this.score);
	}
}
