public class Main {

  // This function reads the demanded math operation and parses the two integers it is applied to.
  // It then exectues the operation - unless it is not implemented which then results in an error message
  static void calculation(String[] calcData) {

    // Creating an instance of StringBuilder used for formatting the output
    StringBuilder stringBuilder = new StringBuilder();

    // Declaration of Integers for the addition
    int firstNumber;
    int secondNumber;

    // Parsing the Numbers from the String array into Integers
    firstNumber = Integer.parseInt(calcData[1]);
    secondNumber = Integer.parseInt(calcData[2]);

    // Check if math operation has been implemented and then exercise it or give Error message
    switch (calcData[0]) {
    case "add":
      stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
      break;
    case "sub":
      stringBuilder.append(firstNumber).append(" - ").append(secondNumber).append(" = ").append(firstNumber - secondNumber);
      break;
    case "mul":
      stringBuilder.append(firstNumber).append(" * ").append(secondNumber).append(" = ").append(firstNumber * secondNumber);
      break;
    case "div":
      stringBuilder.append(firstNumber).append(" / ").append(secondNumber).append(" = ").append(firstNumber / secondNumber);
      break;
    default:
      stringBuilder.append(calcData[0]).append(" ist keine gültige Operation");
    }
    System.out.println(stringBuilder.toString());
  }

  public static void main(String[] args) {

    // TODO: Diese Aufgabe setzt auf aufgabe-008 auf. Lösche dein String Array sowie dessen Zuweisunge, *aber*
    // behalte die vergleiche in den if-Bedingungen. Ändere den genutzten Namen in den if Bedingungen zu "args".
    // Wenn dein String Array "args" heißt, und du folgende if Bedingungen hast, lösche es an den markierten
    // Stellen:
    // String[] args = new String[3]; // löschen
    // args[0] = "add"; // löschen
    // args[1] = "5"; // löschen
    // args[2] = "4"; // löschen
    // if (args[0].equals("add")) { // args[0] gegen args[0] austauschen.
    // // ....
    // }

    // Was ist "args"?
    // args sind die Programmparameter. Sie wie bei etwa Minecraft die Parameter -Xmx, -Xms und so weiter.
    // Die Idee ist, dass wir das Programm von der Kommandozeile etwa wie folgt aufrufen können:
    // java -jar taschenrechner.jar add 5 4

    // In IntelliJ können die Parameter über die Run Configuration angepasst werden. Für eine Demo:
    // https://youtu.be/Y95we9oXaD8
    // Wenn das Program funktioniert, kann es wie im vorherigen Abschnitt auch erzeugt werden. Dazu
    // in IntelliJ auf der rechten Seite das "Maven" Menü aufmachen. Dort "aufgabe-009" öffnen,
    // "Lifecycle" öffnen, mit Steuerung "clean" und "package" auswählen und oben auf den grünen Play-
    // Button klicken. Anschließend am unteren Rand das Terminal aufmachen und folgendes eingeben:
    // java -jar target/tarschenrechner.jar add 44 33
    // Hier eine Demo: a

    // Ausgabe je nach Programmparameter:
    // 5 + 4 = 9
    // 66 - 10 = 56
    // 3 * 4 = 12
    // div 12 / 4 = 3
    // foo ist keine gültige Operation
    // Die Testklasse prüft alle vier Varianten durch.


    // Applying the function to the args Parameter
    calculation(args);
  }
}
