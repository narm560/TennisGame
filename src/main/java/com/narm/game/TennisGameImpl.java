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
	
	public static void main(String[] args) {
//		System.out.println(Score.Love.ordinal());
//		System.out.println(Score.Fifteen.ordinal());
//		System.out.println(Score.values()[0]);
//		System.out.println(Score.values()[1]);
		TennisGameImpl tennisGame = new TennisGameImpl("Player1", "Player2");
		tennisGame.getScore(0,0);
		tennisGame.getScore(5,5);
		tennisGame.getScore(4,0);
		tennisGame.getScore(4,5);

		tennisGame.getScore(1, 0);
		tennisGame.getScore(2, 0);
		tennisGame.getScore(3, 0);
		tennisGame.getScore(4, 0);
		tennisGame.getScore(0, 1);
		tennisGame.getScore(0, 2);
		tennisGame.getScore(0, 3);
		tennisGame.getScore(0, 4);

		tennisGame.getScore(2, 1);
		tennisGame.getScore(3, 1);
		tennisGame.getScore(4, 1);
		tennisGame.getScore(1, 2);
		tennisGame.getScore(1, 3);
		tennisGame.getScore(1, 4);

		tennisGame.getScore(3, 2);
		tennisGame.getScore(4, 2);
		tennisGame.getScore(2, 3);
		tennisGame.getScore(2, 4);
		tennisGame.getScore(4, 3);
		tennisGame.getScore(3, 4);

		tennisGame.getScore(5, 4);
		tennisGame.getScore(4, 5);
		tennisGame.getScore(15, 14);
		tennisGame.getScore(14, 15);
		tennisGame.getScore(6, 4);
		tennisGame.getScore(4, 6);
		tennisGame.getScore(16, 14);
		tennisGame.getScore(14, 16);
	}

//	return Arrays
//			.asList(new Object[][] { { 0, 0, "Love-All" },
//					{ 1, 1, "Fifteen-All" }, { 2, 2, "Thirty-All" },
//					{ 3, 3, "Forty-All" }, { 4, 4, "Deuce" },
//
//					{ 1, 0, "Fifteen-Love" }, { 0, 1, "Love-Fifteen" },
//					{ 2, 0, "Thirty-Love" }, { 0, 2, "Love-Thirty" },
//					{ 3, 0, "Forty-Love" }, { 0, 3, "Love-Forty" },
//					{ 4, 0, "Win for player1" },
//					{ 0, 4, "Win for player2" },
//
//					{ 2, 1, "Thirty-Fifteen" }, { 1, 2, "Fifteen-Thirty" },
//					{ 3, 1, "Forty-Fifteen" }, { 1, 3, "Fifteen-Forty" },
//					{ 4, 1, "Win for player1" },
//					{ 1, 4, "Win for player2" },
//
//					{ 3, 2, "Forty-Thirty" }, { 2, 3, "Thirty-Forty" },
//					{ 4, 2, "Win for player1" },
//					{ 2, 4, "Win for player2" },
//
//					{ 4, 3, "Advantage player1" },
//					{ 3, 4, "Advantage player2" },
//					{ 5, 4, "Advantage player1" },
//					{ 4, 5, "Advantage player2" },
//					{ 15, 14, "Advantage player1" },
//					{ 14, 15, "Advantage player2" },
//
//					{ 6, 4, "Win for player1" },
//					{ 4, 6, "Win for player2" },
//					{ 16, 14, "Win for player1" },
//					{ 14, 16, "Win for player2" }, });
}
