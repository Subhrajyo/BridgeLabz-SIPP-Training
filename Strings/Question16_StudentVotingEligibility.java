import java.util.Random;

public class Question16_StudentVotingEligibility {

    public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] votingEligibility = checkVotingEligibility(ages);
        displayVotingEligibility(votingEligibility);
    }

    public static int[] generateRandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(100); 
        }
        return ages;
    }

   
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]);
            eligibility[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return eligibility;
    }

   
    public static void displayVotingEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("-------------------------");
        for (String[] entry : eligibility) {
            System.out.printf("%-10s %-15s%n", entry[0], entry[1]);
        }
    }
}