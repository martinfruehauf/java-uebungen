public class Main {

  public static void main(String[] args) {

    // TODO: Schreibe ein Programm, das ein String Array besitzt. Fülle dieses Array mit 3 Elementen:
    // 0: "add"
    // 1: "3"
    // 2: "7"
    //
    // Nun prüfe in ob das erste Element des Arrays ein "add" ist. Wenn das zutrifft, sollen die Werte an der 2.
    // und 3. Stelle zusammenaddiert werden.
    // Da "3" und "7" String sind, müssen diese vorher in Integer umgewandelt werden. Dazu kann die Funktion
    // Integer.parseInt("42") genutzt werden.
    // Für die Ausgabe empfiehlt sich ein StringBuilder.
    //
    // Fülle das Array anschließend erneut mit folgenden Werten:
    // 0: "sub"
    // 1: "17"
    // 2: "7"
    //
    // Da "sub" noch nicht implementiert ist, soll die Meldung "sub ist noch nicht implementiert" ausgegeben werden.

    // Ausgabe:
    // 3 + 7 = 10
    // sub ist noch nicht implementiert

    // Declaration and Initialization of String array for the calculation parameters
    String[] calculations = { "add", "3", "7" };

    // Creating an instance of StringBuilder used for formatting the output
    StringBuilder stringBuilder = new StringBuilder();

    // Declaration of Integers for the addition
    int firstNumber;
    int secondNumber;

    // Declaration and Initialization of String meant for displaying the result
    String output = "";

    // Parsing the Numbers from the String array into Integers
    firstNumber = Integer.parseInt(calculations[1]);
    secondNumber = Integer.parseInt(calculations[2]);

    // Check if math operation has been implemented and then exercise it or give Error message
    if (calculations[0].equals("add")) {
      stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);

    } else {
      stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
    }
    output = stringBuilder.toString();
    System.out.println(output);

    // Assigning new values to calculation array
    calculations[0] = "sub";
    calculations[1] = "17";
    calculations[2] = "7";

    // Clear / Empty out the stringbuilder instance
    stringBuilder.setLength(0);
    // Try the implemented Math operation again
    if (calculations[0].equals("add")) {
      stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);

    } else {
      stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
    }
    output = stringBuilder.toString();
    System.out.println(output);

  }
}
