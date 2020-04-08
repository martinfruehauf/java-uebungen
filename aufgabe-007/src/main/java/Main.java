public class Main {

    public static void main(String[] args) {

        // TODO: Diese Aufgabe setzt auf aufgabe-006 auf. aufgabe-006 soll um einen Check erweitert werden, der prüft
        // ob in dem String Array das erste Element ungleich "add" ist. Falls ja, soll die Meldung:
        // "<methode> ist noch nicht implementiert" ausgegeben.
        // Dann teste die Varianten durch, wo du den ersten String des Arrays ersetzt durch folgende Strings:
        //   add
        //   sub
        //   div
        //   mul
        //   foo
        // Nutze im if-Block dynamisch den ersten Wert aus dem Array. Sprich, wenn dein Array "String[] daten" heißt,
        // nutze für die Fehlerausgabe "daten[0]".
        // Für "add" soll die Ausgabe "add ist implementiert" erscheinen.

        // Ausgabe:
        // add ist implementiert
        // sub ist noch nicht implementiert
        // div ist noch nicht implementiert
        // mul ist noch nicht implementiert
        // foo ist noch nicht implementiert

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
            //stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
            stringBuilder.append(calculations[0]).append(" ist implementiert");
        } else {
            stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
        }
        output = stringBuilder.toString();
        System.out.println(output);

        stringBuilder.setLength(0);
        calculations[0] = "sub";
        if (calculations[0].equals("add")) {
            //stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
            stringBuilder.append(calculations[0]).append(" ist implementiert");
        } else {
            stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
        }
        output = stringBuilder.toString();
        System.out.println(output);

        stringBuilder.setLength(0);
        calculations[0] = "div";
        if (calculations[0].equals("add")) {
            //stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
            stringBuilder.append(calculations[0]).append(" ist implementiert");
        } else {
            stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
        }
        output = stringBuilder.toString();
        System.out.println(output);

        stringBuilder.setLength(0);
        calculations[0] = "mul";
        if (calculations[0].equals("add")) {
            //stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
            stringBuilder.append(calculations[0]).append(" ist implementiert");
        } else {
            stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
        }
        output = stringBuilder.toString();
        System.out.println(output);

        stringBuilder.setLength(0);
        calculations[0] = "foo";
        if (calculations[0].equals("add")) {
            //stringBuilder.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
            stringBuilder.append(calculations[0]).append(" ist implementiert");
        } else {
            stringBuilder.append(calculations[0]).append(" ist noch nicht implementiert");
        }
        output = stringBuilder.toString();
        System.out.println(output);

    }
}
