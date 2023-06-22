package src.MyPakage;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerChoice, computerChoice;
        int computerInt;

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors): ");
        playerChoice = input.nextLine().toLowerCase();
        input.close();

        computerInt = (int) (Math.random() * 3) + 1;

        switch (computerInt) {
            case 1:
                computerChoice = "rock";
                break;
            case 2:
                computerChoice = "paper";
                break;
            case 3:
                computerChoice = "scissors";
                break;
            default:
                computerChoice = "invalid";
                break;
        }

        System.out.println("Computer chose " + computerChoice + ".");

        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You win! Rock beats scissors.");
            } else {
                System.out.println("You lose! Paper beats rock.");
            }
        } else if (playerChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You win! Paper beats rock.");
            } else {
                System.out.println("You lose! Scissors beats paper.");
            }
        } else if (playerChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You win! Scissors beats paper.");
            } else {
                System.out.println("You lose! Rock beats scissors.");
            }
        } else {
            System.out.println("Invalid choice. Please enter either Rock, Paper, or Scissors.");
        }
    }
}
