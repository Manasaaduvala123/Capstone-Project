
package day6_Assessment;
public class KnowledgeLevelDemo {
    public static void main(String[] args) {
        int[] testScores = {0, 3, 4, 6, 7, 9, 10, -1, 11};
        for (int score : testScores) {
            try {
                KnowledgeLevel level = KnowledgeLevel.fromScore(score);
                System.out.println("Score: " + score + " → Level: " + level);
            } catch (IllegalArgumentException e) {
                System.out.println("Score: " + score + " → " + e.getMessage());
            }
        }
    }
    enum KnowledgeLevel {
        BEGINNER, ADVANCED, PROFESSIONAL, MASTER;
        public static KnowledgeLevel fromScore(int score) {
            if (score >= 0 && score <= 3) {
                return BEGINNER;
            } else if (score >= 4 && score <= 6) {
                return ADVANCED;
            } else if (score >= 7 && score <= 9) {
                return PROFESSIONAL;
            } else if (score == 10) {
                return MASTER;
            } else {
                throw new IllegalArgumentException("Invalid score: " + score);
            }
        }
    }
}
