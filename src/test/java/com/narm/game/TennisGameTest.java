package com.narm.game;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TennisGameTest {

	private String player1Name = "Player1";
	private String player2Name = "Player2";
	private int player1Score;
	private int player2Score;
	private String expectedScore;
	
	public TennisGameTest(int player1Score, int player2Score,
			String expectedScore) {
		super();
		this.player1Score = player1Score;
		this.player2Score = player2Score;
		this.expectedScore = expectedScore;
	}
//	public TennisGameTest(int player1Score, int player2Score,
//			String player1Name, String player2Name, String expectedScore) {
//		super();
//		this.player1Score = player1Score;
//		this.player2Score = player2Score;
//		this.player1Name = player1Name;
//		this.player2Name = player2Name;
//		this.expectedScore = expectedScore;
//	}

	@Parameters
	public static Collection<Object[]> getAllScores() {
		return Arrays.asList(new Object[][]{
				{ 0, 0, "Love-All" },
//				{ 0, 0, "PL1", "PL1", "Love-All" },
				{0, 0,  "Love-All"},
				{5, 5,  "Deuce"},
				{4, 0,  "Player1 Won"},
				{4, 5,  "Advantage Player2"},
				{1, 0,  "Fifteen-Love"},
				{2, 0,  "Thirty-Love"},
				{3, 0,  "Forty-Love"},
				{4, 0,  "Player1 Won"},
				{0, 1,  "Love-Fifteen"},
				{0, 2,  "Love-Thirty"},
				{0, 3,  "Love-Forty"},
				{0, 4,  "Player2 Won"},
				{2, 1,  "Thirty-Fifteen"},
				{3, 1,  "Forty-Fifteen"},
				{4, 1,  "Player1 Won"},
				{1, 2,  "Fifteen-Thirty"},
				{1, 3,  "Fifteen-Forty"},
				{1, 4,  "Player2 Won"},
				{3, 2,  "Forty-Thirty"},
				{4, 2,  "Player1 Won"},
				{2, 3,  "Thirty-Forty"},
				{2, 4,  "Player2 Won"},
				{4, 3,  "Advantage Player1"},
				{3, 4,  "Advantage Player2"},
				{5, 4,  "Advantage Player1"},
				{4, 5,  "Advantage Player2"},
				{15, 14,  "Advantage Player1"},
				{14, 15,  "Advantage Player2"},
				{6, 4,  "Player1 Won"},
				{4, 6,  "Player2 Won"},
				{16, 14,  "Player1 Won"},
				{14, 16,  "Player2 Won"},
				{18, 16,  "Player1 Won"}
		});
	}
	
	@Test
	public void checkAllScores() {
		TennisGame game = new TennisGameImpl(player1Name, player2Name);
		validateAllScores(game);
	}

	private void validateAllScores(TennisGame game) {
		int maxScore = Math.max(player1Score, player2Score);
		for (int i = 0; i < maxScore; i++) {
			if(i<player1Score){
				game.wonPoint(player1Name);
			}
			if(i<player2Score){
				game.wonPoint(player2Name);
			}
		}
		Assert.assertEquals(game.getScore(), expectedScore);
	}
}
