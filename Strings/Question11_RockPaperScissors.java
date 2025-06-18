import java.util.Random;
import java.util.Scanner;

public class Question11_RockPaperScissors {
    private static final String[] CHOICES = {"Rock", "Paper", "Scissors"};
    private static int playerWins = 0;
    private static int computerWins = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numberOfGames = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String playerChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);
            displayResult(playerChoice, computerChoice, winner);
        }

        displayStats();
        scanner.close();
    }

    private static String getComputerChoice() {
        Random random = new Random();
        return CHOICES[random.nextInt(CHOICES.length)];
    }

    private static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                   (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                   (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            playerWins++;
            return "Player";
        } else {
            computerWins++;
            return "Computer";
        }
    }

    private static void displayResult(String playerChoice, String computerChoice, String winner) {
        System.out.println("Player choice: " + playerChoice);
        System.out.println("Computer choice: " + computerChoice);
        System.out.println("Winner: " + winner);
        System.out.println();
    }

    private static void displayStats() {
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        int totalGames = playerWins + computerWins;
        if (totalGames > 0) {
            double playerWinPercentage = (double) playerWins / totalGames * 100;
            double computerWinPercentage = (double) computerWins / totalGames * 100;
            System.out.printf("Player Win Percentage: %.2f%%\n", playerWinPercentage);
            System.out.printf("Computer Win Percentage: %.2f%%\n", computerWinPercentage);
        } else {
            System.out.println("No games played.");
        }
    }
}