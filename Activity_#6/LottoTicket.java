class LottoTicket {
    //Private Attributes
    private String ticketNumber;
    private int chosenNumber;
    private Player player; // One-to-one relationship

    // Getter and Setter for ticketNumber
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    // Getter and Setter for chosenNumber
    public int getChosenNumber() {
        return chosenNumber;
    }

    public void setChosenNumber(int chosenNumber) {
        this.chosenNumber = chosenNumber;
    }

    //Getter and Setter for player 
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}