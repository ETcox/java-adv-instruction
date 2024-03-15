import java.util.Random;

public class DiceRollerApp {

	public static void main(String[] args) {
		
	        int dice1 = rollDice();
	        int dice2 = rollDice();

	        System.out.println("Dice 1: " + dice1);
	        System.out.println("Dice 2: " + dice2);
	        System.out.println("Total: " + (dice1 + dice2));
	    }

	    // Method to simulate rolling a dice
	    public static int rollDice() {
	        Random random = new Random();
	        return random.nextInt(6) + 1; // Generates a random number between 1 and 6
	    }

	}


