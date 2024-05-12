import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        int computerChoiceIndex;
        String computerChoice;
        String playerChoice;
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            computerChoiceIndex = random.nextInt(choices.length);
            computerChoice = choices[computerChoiceIndex];
            
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            playerChoice = scanner.nextLine();
            
            if (!playerChoice.equalsIgnoreCase("Rock") && 
                !playerChoice.equalsIgnoreCase("Paper") && 
                !playerChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }
            
            System.out.println("Computer's choice: " + computerChoice);
            
            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine();
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
