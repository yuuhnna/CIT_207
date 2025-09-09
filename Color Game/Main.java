import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a ColorGame object (encapsulation in action)
        ColorGame game = new ColorGame();

        // Set player details using setters
        game.setPlayerName("Yana");
        game.setChosenColor("Blue");

        System.out.println("*** Welcome " + game.getPlayerName() + " ! Let's play Color Game ***\n");
        System.out.println("You have chosen: " + game.getChosenColor());

        int attempts = 0;
        boolean won = false;

        // Loop until the player wins
        while (!won) {
            attempts++;


            // Call the game’s method 
            won = game.playRound(attempts);

            if (!won) {
                // Wait for user input before next attempt
                while (System.in.read() != '\n') {
                    // clear buffer
                }   
            }
        }
    }
}
