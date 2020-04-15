public class Main {

  public static void main(String[] args) {

    final String daten = "Jenny:21,Max:18,Larissa:28,John:31";

    // TODO: In dieser Aufgabe haben wir wieder ein Datenstring vorgeben. Es enthält Paaren:
    // * einen Namen
    // * und ein Alter
    // Die Paare sind durch einen ":" getrennt, während die Daten selbst nochmal durch ein "," getrennt sind.
    // Also sie entsprechen dem Format:
    // Name:Alter,Name:Alter,Name:Alter,...
    //
    // Im ersten Schritt sollen die Datensätze voneinander getrennt werden. Es soll also mit dem "," gesplittet
    // werden. Danach sollen die Namen ausgegeben werden ohne das Alter. Hierzu kann auch wieder split verwendet
    // werden.
    //
    // Die Ausgabe soll mit System.out.println erfolgen und wie folgt aussehen:
    // Namen:
    // Jenny
    // Max
    // Larissa
    // John

    // Converting the String into an array of Name Age Pairs
    String[] datenArray = daten.split(",");

    // Outputting the names
    System.out.println("Namen:");
    for (String x: datenArray) {
      System.out.println(x.split(":")[0]);
    }

  }
}
