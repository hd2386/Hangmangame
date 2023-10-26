public class HangmanMain {

    public static void main(String[] args) {

        System.out.println("Mit wie viele Spieler möchten Sie spielen?");
        int playerCount = Input.readInt();

        Player[] spielerarray = new Player[playerCount + 1];

        System.out.println("Geben Sie ihre Name!");

        String name = Input.readString();

        spielerarray[0] = new Player(name);

        // Register every player to the array with names
        for (int i = 0; i < playerCount; ++i) {
            spielerarray[i + 1] = new Player("PC " + Integer.toString(i));
        }

        // print every player names
        System.out.println("Die Spieler: ");
        for (int i = 0; i < spielerarray.length; ++i) {
            System.out.println(spielerarray[i].getName());
        }

        HangmanGame.logic(spielerarray); // spielerarray == playerArray(game)

    }
}