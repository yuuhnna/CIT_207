import java.util.Random;

public class ColorGame {
    // Private attributes
    private String playerName;
    private String chosenColor;
    private String resultColor;

    // Constant list of valid colors
    private static final String[] VALID_COLORS = {"Red", "Green", "Blue", "Yellow"};

    // Getter and Setter for playerName
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter and Setter for chosenColor
    public String getChosenColor() {
        return chosenColor;
    }

    public void setChosenColor(String chosenColor) {
        // Setter includes validation (only accepts valid colors)
        for (String color : VALID_COLORS) {
            if (color.equalsIgnoreCase(chosenColor)) {
                this.chosenColor = color;
                return;
            }
        }
        // If invalid color = error
        throw new IllegalArgumentException("Invalid color! Must be Red, Green, Blue, or Yellow.");
    }

    // Getter for resultColor
    public String getResultColor() {
        return resultColor;
    }

    // Private setter (only the class can set the result)
    private void setResultColor(String resultColor) {
        this.resultColor = resultColor;
    }

    // Encapsulated method: plays one round of the game
    // This hides the random logic from Main
    public boolean playRound(int attempt) {
        Random rand = new Random();

        // Randomly generate a result color
        setResultColor(VALID_COLORS[rand.nextInt(VALID_COLORS.length)]);

        System.out.println("Result color: " + getResultColor() + " [Attempt " + attempt + " ]");

        // Check if chosen color matches results
        if (getResultColor().equalsIgnoreCase(getChosenColor())) {
            System.out.println("Congratulations " + getPlayerName() + "! You WIN!");
            System.out.println("It took you " + attempt + " attempt(s).");
            return true; // Win condition
        } else {
            System.out.println("Not a match. Press any key to try again...");
            return false; // Not yet win
        }
    }
}
