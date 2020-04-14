public class Main {

  // This function reads the demanded math operation and parses the two integers it is applied to.
  // It then exectues the operation - unless it is not implemented which then results in an error message
  static void calculation(String[] calcData) {

    // Creating an instance of StringBuilder used for formatting the output
    StringBuilder stringBuilder = new StringBuilder();

    // Declaration of Integers for the addition
    int firstNumber;
    int secondNumber;

    // Declaration and Initialization of String meant for displaying the result
    String output = "";

    // Parsing the Numbers from the String array into Integers
    firstNumber = Integer.parseInt(calcData[1]);
    secondNumber = Integer.parseInt(calcData[2]);

    // Check if math operation has been implemented and then exercise it or give Error message
    if (calcData[0].equals("add")) {
      stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);

    } else if (calcData[0].equals("sub")) {
      stringBuilder.append(firstNumber).append(" - ").append(secondNumber).append(" = ").append(firstNumber - secondNumber);

    } else if (calcData[0].equals("mul")) {
      stringBuilder.append(firstNumber).append(" * ").append(secondNumber).append(" = ").append(firstNumber * secondNumber);

    } else if (calcData[0].equals("div")) {
      stringBuilder.append(firstNumber).append(" / ").append(secondNumber).append(" = ").append(firstNumber / secondNumber);

    } else {
      stringBuilder.append(calcData[0]).append(" ist keine gültige Operation");
    }
    output = stringBuilder.toString();
    System.out.println(output);
  }

  public static void main(String[] args) {

    // TODO: Diese Aufgabe setzt auf aufgabe-006 auf. Erweitere den Code, sodass du Addition mit "add", Subtraktion
    // mit "sub", Multiplikation mit "mul" und Division mit "div" ausführen kannst.
    // Es muss jedes mal geprüft werden, ob es sich um "add", "sub", "mul" oder um "div" handelt. Ganz am Ende
    // soll es eine Ausgabe geben, für den Fall, dass es die Methode nicht ganz, etwa für "foo". Dort soll die
    // Fehlermeldung: "foo ist keine gültige Operation" ausgegeben werden.
    //
    // Die zu testenden Varianten:
    // add 5 4
    // sub 66 10
    // mul 3 4
    // div 12 4
    // foo 1 1

    // Ausgabe:
    // 5 + 4 = 9
    // 66 - 10 = 56
    // 3 * 4 = 12
    // div 12 / 4 = 3
    // foo ist keine gültige Operation

    // Declaration and Initialization of String arrays for the calculation parameters
    String[] addArray = { "add", "5", "4" };
    String[] subArray = { "sub", "66", "10" };
    String[] mulArray = { "mul", "3", "4" };
    String[] divArray = { "div", "12", "4" };
    String[] fooArray = { "foo", "1", "1" };

    // Applying the function to the arrays
    calculation(addArray);
    calculation(subArray);
    calculation(mulArray);
    calculation(divArray);
    calculation(fooArray);
  }
}
