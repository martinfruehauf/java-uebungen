public class Main {

  public static void main(String[] args) {

    // TODO: Schreibe ein Programm, welches ein Array mit 3 Werten vom Typ String erzeugt. Das Array soll mit
    // folgenden Werten befüllt werden:
    // 0: "Hallo"
    // 1: "Hello"
    // 2: "Hallo"
    // Anschließend sollen die String jeweils vergleichen werden. Erst 0 mit 1, dann 0 mit 2, dann 1 mit 2.
    // Das soll mit if realisiert werden. Hier muss "equals" anstatt "==" zum Vergleich genutzt werden.
    // Stimmen die Grußtexte überein soll dies entsprechend mittels System.out.println ausgegeben werden, etwa:
    // "Hallo (0) und Hallo (2) sind gleich". In den Klammern sollen die Array-Indizes des jeweils Grußes
    // angezeigt werden.
    // Jedes if soll einen else-Block erhalten, der eine Fehlerausgabe macht in der Form:
    // "Hallo (0) und Hello (2) sind ungleich". Natürlich mit den entsprechenden Grußtexten an entsprechender Stelle.

    // Ausgabe:
    // Hallo (0) und Hello (1) sind ungleich
    // Hallo (0) und Hallo (2) sind gleich
    // Hello (1) und Hallo (2) sind ungleich

    // Declaration and Initialization of String Array
    String[] greetings = { "Hallo", "Hello", "Hallo" };
    String output = "";

    // Looping through the greetings array to each word and comparing the content
    for (int i = 0; i < greetings.length; i++) {
      for (int j = i; j < greetings.length; j++) {
        // avoiding the comparision of a word with itself
        if (i == j) {
          continue;
        }
        output = greetings[i] + " (" + i + ") und " + greetings[j] + " (" + j + ") sind ";
        if (greetings[i].equals(greetings[j])) {
          output += "gleich";
        } else {
          output += "ungleich";
        }
        System.out.println(output);
      }
    }

  }
}
