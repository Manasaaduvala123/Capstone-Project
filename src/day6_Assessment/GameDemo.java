package day6_Assessment;
public class GameDemo {
    public static void main(String[] args) {
        Game easyGame = new Game(Difficulty.EASY);
        Game mediumGame = new Game(Difficulty.MEDIUM);
        Game hardGame = new Game(Difficulty.HARD);
    }
}

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Game {
    private int bullets;

    public Game(Difficulty diff) {
        switch (diff) {
            case EASY:
                bullets = 3000;
                break;
            case MEDIUM:
                bullets = 2000;
                break;
            case HARD:
                bullets = 1000;
                break;
            default:
                bullets = 0;
        }
        System.out.println("Game started with difficulty: " + diff + ", Bullets: " + bullets);
    }
}


/*
 * output:
 Game started with difficulty: EASY, Bullets: 3000
Game started with difficulty: MEDIUM, Bullets: 2000
Game started with difficulty: HARD, Bullets: 1000
*/


