public class MethodsCont {

    public static void main(String[] arg){

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Innocent", playerPosition);

        playerPosition = calculateHighScorePosition(999);
        displayHighScorePosition("Charles", playerPosition);

        playerPosition = calculateHighScorePosition(499);
        displayHighScorePosition("UDO", playerPosition);

        playerPosition = calculateHighScorePosition(99);
        displayHighScorePosition("EKEMINI", playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition("BEN", playerPosition);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " in the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        int score = playerScore;

        if (score >= 1000){
            return 1;
        }
        else if (score >= 500 && score < 1000){
            return 2;
        }
        else if (score >= 100 && score < 500) {
            return 3;
        }
        else{
            return 4;
        }
    }
}
