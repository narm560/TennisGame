package com.narm.game;

public class TennisGameImpl implements TennisGame {

	Player player1;
	Player player2;

	public TennisGameImpl(Player player1, Player player2) {
		super();
		this.player1 = player1;
		this.player2 = player2;
	}

	public TennisGameImpl(String player1Name, String player2Name) {
		super();
		Player player1 = new Player(player1Name);
		Player player2 = new Player(player2Name);
		this.player1 = player1;
		this.player2 = player2;
	}

	public void wonPoint(String playerName) {
		if(player1.getName().equals(playerName)){
			player1.setPoint(player1.getPoint()+1);
		} else {
			player2.setPoint(player2.getPoint()+1);
		}
	}

	public String getScore() {
		return getScore(this.player1, this.player2);
	}
	
	public String getScore(int point1, int point2) {
		Player player1 = new Player("Player1", point1);
		Player player2 = new Player("Player2", point2);
		return getScore(player1, player2);
	}

	public String getScore(Player player1, Player player2) {
		int p1 = player1.getPoint();
		int p2 = player2.getPoint();

		String playerName = player1.getName();
		if(p2>p1){
			playerName = player2.getName();
		}

//		String win = playerName + " " + Score.Won + "  the match.";
		String win = playerName + " " + Score.Won;
		String score = "";
		
		if(p1==p2){
			score = Score.Deuce.toString();
			if(p1<4){
				score = Score.values()[p1] + "-All";
			}
		} else if(p1<=3 && p2<=3){
			score = Score.values()[p1] + "-" + Score.values()[p2];
		} else {
			int minus = (p1-p2)*(p1-p2);
			if(minus==1){
				score = Score.Advantage + " " + playerName;				
			} else {
				score = win;
			}
		}
		System.out.println(p1 + "," + p2 + " : " + score);
		return score;
	}
	
}
