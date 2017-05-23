package com.greenfox.seed0forever.tennis;

import com.greenfox.seed0forever.tennis.model.Player;

public class TennisGame1 implements TennisGame {

  private Player player1;
  private Player player2;

  public TennisGame1(String player1Name, String player2Name) {
    player1 = new Player(player1Name);
    player2 = new Player(player2Name);
  }

  public void wonPoint(String playerName) {
    if (player1.hasNameIgnoreCase(playerName)) {
      player1.increaseScore();
    } else {
      player2.increaseScore();
    }
  }

  public String reportCurrentScore() {
    String score;

    if (areScoresEqual()) {
      score = reportWhenEqualScores();

    } else if (isAnyScoreOverThree()) {
      score = reportWhenAdvantageOrWin();

    } else {
      score = reportWhenDifferentAndUnderFour();
    }

    return score;
  }

  private boolean areScoresEqual() {
    return player1.getScore() == player2.getScore();
  }

  private boolean isAnyScoreOverThree() {
    return player1.getScore() >= 4 || player2.getScore() >= 4;
  }

  private String reportWhenDifferentAndUnderFour() {
    int tempScore = 0;
    String scoreReport = "";

    for (int i = 1; i <= 2; i++) {

      if (i == 1) {
        tempScore = player1.getScore();
      } else {
        scoreReport += "-";
        tempScore = player2.getScore();
      }

      scoreReport += convertToScoreName(tempScore);
    }

    return scoreReport;
  }

  private String convertToScoreName(int score) {
    String scoreName = "";

    switch (score) {
      case 0:
        scoreName = "Love";
        break;
      case 1:
        scoreName = "Fifteen";
        break;
      case 2:
        scoreName = "Thirty";
        break;
      case 3:
        scoreName = "Forty";
        break;
      default:
        scoreName = null;
    }
    return scoreName;
  }

  private String reportWhenAdvantageOrWin() {
    String score;
    int scoreDifference = player1.getScore() - player2.getScore();

    if (scoreDifference == 1) {
      score = "Advantage player1";
    } else if (scoreDifference == -1) {
      score = "Advantage player2";
    } else if (scoreDifference >= 2) {
      score = "Win for player1";
    } else {
      score = "Win for player2";
    }
    return score;
  }

  private String reportWhenEqualScores() {
    String score;
    switch (player1.getScore()) {
      case 0:
        score = "Love-All";
        break;
      case 1:
        score = "Fifteen-All";
        break;
      case 2:
        score = "Thirty-All";
        break;
      case 3:
        score = "Forty-All";
        break;
      default:
        score = "Deuce";
        break;
    }
    return score;
  }
}
