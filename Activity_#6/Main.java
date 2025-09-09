public class Main {

    public static void main(String[] args) {
        // Create a Player object
        Player player1 = new Player();
        player1.setName("Allanah");
        player1.setAge(19);

        // Create a LottoTicket object
        LottoTicket ticket1 = new LottoTicket();
        ticket1.setTicketNumber("LT-001");
        ticket1.setChosenNumber(15);

        // Link the Player to the LottoTicket
        ticket1.setPlayer(player1);

        // Display ticket information with player details
        System.out.println("======== Lotto Ticket ========");
        System.out.println("Ticket Number: " + ticket1.getTicketNumber());
        System.out.println("Chosen Number: " + ticket1.getChosenNumber());

        // Access Player details thru LottoTicket
        System.out.println("Player Name: " + ticket1.getPlayer().getName());
        System.out.println("Age: " + ticket1.getPlayer().getAge() + " yrs. old");
    }
}