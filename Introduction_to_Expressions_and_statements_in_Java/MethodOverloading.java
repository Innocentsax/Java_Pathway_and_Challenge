public class MethodOverloading {
    public static void main(String[] args){
        //calculateScore("Innocent", 50);
        int newScore = calculateScore("Innocent", 50);
        System.out.println("New score is " + newScore);

        calculateScore(300);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " Score " + score + " point");
        return score * 1000;
    }

    /*public static int calculateScore(int score){
        System.out.println("Unnamed player Score " + score + " point");
        return score * 1000;
    }*/
    public static int calculateScore(int score){
        return  calculateScore("Anonymous", score);
    }
    public static int calculateScore() {
        System.out.println("No player name, No player Score");
        return 0;
    }
}
