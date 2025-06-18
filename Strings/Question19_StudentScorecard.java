import java.util.Random;

public class Question19_StudentScorecard {
    
    public static void main(String[] args) {
        int[][] scores = generateRandomScores(10);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; 
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(101); 
            scores[i][1] = random.nextInt(101); 
            scores[i][2] = random.nextInt(101); 
        }
        
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; 
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; 
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        
        return results;
    }

    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];         
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A";
            } else if (percentage >= 80) {
                grades[i][0] = "B";
            } else if (percentage >= 70) {
                grades[i][0] = "C";
            } else if (percentage >= 60) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Grade");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10s%n", 
                (i + 1), 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                results[i][0], 
                grades[i][0]);
        }
    }
}