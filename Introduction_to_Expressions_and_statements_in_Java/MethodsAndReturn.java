public class MethodsAndReturn {
    public static void main(String[] arg){

        int highScore = calculateScore(true, 80, 5, 100);
        System.out.println("Your Score is = " + highScore);
        System.out.println("The next high score " + calculateScore(true, 1000, 8,200));

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        /* boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200; */
        int finalScore = score;

        if(gameOver == true){
            finalScore += (levelCompleted * bonus);
            /*System.out.println("Your final score is " + finalScore);*/
        }
        return finalScore;
    }
}
