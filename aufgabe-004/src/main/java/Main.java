public class Main {

  public static void main(String[] args) {

    // TODO: Schreibe ein Programm, das eine von Zahlen erzeugt. Dieses Array soll vom Typ int sein und 5
    // Felder groß sein. Das Array soll mit den Werten 1, 2, 3, 4, 5 befüllt und anschließend in einer Zeile
    // ausgegeben werden, anstatt ein Wer pro Zeile. Die Zahlen sollen mittels StringBuilder vorbereitet und
    // anschließend mittels System.out.println ausgegeben werden.
    //
    // Beispiel:
    // StringBuilder builder = new StringBuilder();
    // builder.append(2).append(" "); // fügt "2 " hinzu
    // builder.append(4).append(" "); // fügt "4 " hinzu
    // builder.append(8).append(" "); // fügt "8 " hinzu
    // String ausgabe = builder.toString(); // fügt die Strings oben zusammen zu "2 4 8 "

    // Ausgabe:
    // 1 2 3 4 5

    // Declaration and Initilization of the demanded array
    int[] intArray = new int[5];
    for (int i = 0; i < 5; i++) {
      intArray[i] = i + 1;
    }

    // creating an instance of StringBuilder
    StringBuilder stringBuilder = new StringBuilder();

    //Creating the output-String from the array in the demanded manner using StringBuilder
    for (int x: intArray) {
      stringBuilder.append(x).append(" ");
    }
    String output = stringBuilder.toString();

    //Displaying the output in the terminal
    System.out.println(output);
  }
}
