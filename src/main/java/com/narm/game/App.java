package com.narm.game;

/**
 * Tennis Game test
 *
 */
public class App 
{

	public static void main(String[] args) {
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
//		System.out.println(Score.Fifteen.ordinal());
	}

}
