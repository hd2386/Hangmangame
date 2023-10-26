
public class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() { // Getter Methode
        return name;
    }

    public static char randomchar() {
        char randomletter = (char) (Math.random() * 26 + 'a');
        return randomletter;
    }

}