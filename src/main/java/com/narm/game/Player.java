package com.narm.game;

public class Player {
	
	private String name;
	private int point;
	private String score;
	
	public Player(String name) {
		super();
		this.name = name;
	}

	public Player(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}


}
