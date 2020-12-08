package clean_code_and_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int minusScore1, int minusScore2) {
        String score;
        if (minusScore1 == minusScore2) {
            score = CheckSpecial(minusScore1);
        }
        else if (minusScore1 >= 4 || minusScore2 >= 4) {
            score = CheckSpecial(minusScore1,minusScore2);
        }
        else {
           score = CheckNormal(minusScore1,minusScore2);
        }
        return score;
    }

    private static String CheckSpecial(int minusScore) {
        String score;
        switch (minusScore)
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
        return score;
    }

    private static String CheckSpecial(int minusScore1, int minusScore2) {
        String score;
        int minusResult = minusScore1-minusScore2;
        if (minusResult ==1) {
            score ="Advantage player1";
        }
        else if (minusResult ==-1){
            score ="Advantage player2";
        }
        else if (minusResult >=2){
            score = "Win for player1";
        }
        else {
            score ="Win for player2";
        }
        return score;
    }

    private static String CheckNormal(int minusScore1, int minusScore2){
        String score;
        String[] scores = {"Love","Fifteen","Thirty","Forty"};
        score = scores[minusScore1] + "-" + scores[minusScore2];
        return score;
    }
}