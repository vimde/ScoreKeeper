package com.score.keeper;

public enum Point {
	ONE(1), TWO(2), THREE(3);
	
	private int point;
	
	Point(int point) {
		this.point = point;
	}
	
	public int getValue() {
		return this.point;
	}
}
