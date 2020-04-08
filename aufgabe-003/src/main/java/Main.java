public class Main {

  public static void main(String[] args) {

    // TODO: Schreibe ein Programm, das eine von Zahlen erzeugt. Dieses Array soll vom Typ int sein und 5
    // Felder groß sein. Das Array soll mit den Werten 1, 2, 3, 4, 5 befüllt und anschließend in einer Zeile
    // ausgegeben werden, anstatt ein Wer pro Zeile. Hierzu soll System.out.print genutzt werden.
    //
    // Ausgabe:
    // 1 2 3 4 5

    // Declaration and Initilization of the demanded array
    int[] intArray = new int[5];
    for (int i = 0; i < 5; i++) {
      intArray[i] = i + 1;
    }

    // Displaying the content of the array in the demanded manner
    for (int x: intArray) {
      System.out.print(x + " ");
    }

  }
}
