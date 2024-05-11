import java.util.Random;

public class HangmanGame {

  public static String[] words = {
      "softwareentwicklung",
      "praktikum",
      "uxd",
      "methode",
      "klasse",
      "integer",
      "value",
      "boolean",
      "typecast",
      "ingolstadt",
      "hochschule",
      "thi",
      "java",
      "byte",
      "objekt",
      "attribut",
      "parameter",
      "break",
      "while",
      "kahoot",
      "return",
      "literal",
      "konstante",
      "programmieren",
      "code"
  };

  private static String[] getWords() {
    return words;
  }

  private static int getIndex() {
    Random rand = new Random();
    int index = rand.nextInt(words.length);
    return index;
  }

  private static String randomWord(int index) {
    String[] randomwords = getWords();
    String randomword = randomwords[getIndex()];
    return randomword;
  }

  public static void Ersteszeichen() {
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("__|__");
    System.out.println();

  }

  public static void Zweiteszeichen() {
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println(" __|__");

  }

  public static void Dritteszeichen() {
    System.out.println("   _________");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   | ");
    System.out.println(" __|__");

  }

  public static void Vierteszeichen() {
    System.out.println("   _________");
    System.out.println("   |       |");
    System.out.println("   |       O");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println(" __|__");
  }

  public static void Funftezeichen() {
    System.out.println("   _________");
    System.out.println("   |       |");
    System.out.println("   |       O");
    System.out.println("   |       |");
    System.out.println("   |");
    System.out.println("   |");
    System.out.println(" __|__");

  }

  public static void Sechstezeichen() {
    System.out.println("   _________");
    System.out.println("   |       |");
    System.out.println("   |       O");
    System.out.println("   |       |");
    System.out.println("   |      / \\");
    System.out.println("   |");
    System.out.println(" __|__");
  }

  public static void Siebtezeichen() {
    System.out.println("   _________");
    System.out.println("   |       |");
    System.out.println("   |       O");
    System.out.println("   |      /|\\");
    System.out.println("   |      / \\");
    System.out.println("   |");
    System.out.println(" __|__");

  }

  public static void logic(Player[] playerArray) {

    int index = getIndex();
    String word = randomWord(index);
    int fehler_count = 0;
    boolean hit = false;
    boolean success = false;
    Player winner;
    char[] leer = new char[word.length()];

    for (int i = 0; i < word.length(); i++) {
      leer[i] = '-';

    }
    System.out.println();
    System.out.println(leer);

    while (!word.equals(String.valueOf(leer)) && fehler_count < 7) {

      for (int i = 0; i < playerArray.length; ++i) {
        hit = false;
        System.out.println();
        System.out.println(playerArray[i].getName() + " du bist dran bitte gib eine Buchstabe");
        char userinput = Input.readChar();
        for (int j = 0; j < word.length(); ++j) {
          if (word.charAt(j) == userinput) {
            leer[j] = userinput;
            hit = true;
          }
        }

        if (word.equals(String.valueOf(leer))) {
          winner = playerArray[i];
          success = true;
          System.out.println(word);
          if (success) {
            System.out.println(String.format(winner.getName() + " DU HAST GEWONNEN!!"));
            break;
          }
        }
        if (!hit) {
          fehler_count++;
        }
        System.out.println(leer);

        if (fehler_count == 1) {
          Ersteszeichen();

        } else if (fehler_count == 2) {
          Zweiteszeichen();

        } else if (fehler_count == 3) {
          Dritteszeichen();

        } else if (fehler_count == 4) {
          Vierteszeichen();

        } else if (fehler_count == 5) {
          Funftezeichen();

        } else if (fehler_count == 6) {
          Sechstezeichen();

        } else if (fehler_count == 7) {
          Siebtezeichen();
          System.out.println();
          success = false;
          System.out.println("GAME OVER!!");
          System.out.println();
          return;
        }
        System.out.println();

      }
    }

    System.out.println();

  }

}
