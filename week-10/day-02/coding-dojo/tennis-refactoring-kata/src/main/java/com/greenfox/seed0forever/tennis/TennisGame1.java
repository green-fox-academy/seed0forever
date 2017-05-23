package com.greenfox.seed0forever.tennis;

public class TennisGame1 implements TennisGame {


    private int scoreOfGame1 = 0;
    private int scoreOfGame2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            scoreOfGame1 += 1;
        else
            scoreOfGame2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (scoreOfGame1 == scoreOfGame2)
        {
            switch (scoreOfGame1)
            {
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
        }
        else if (scoreOfGame1 >=4 || scoreOfGame2 >=4)
        {
            int minusResult = scoreOfGame1 - scoreOfGame2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scoreOfGame1;
                else { score+="-"; tempScore = scoreOfGame2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}