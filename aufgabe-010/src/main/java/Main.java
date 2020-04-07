public class Main {

    public static void main(String[] args) {

        // TODO: Diese Aufgabe setzt auf aufgabe-009 auf. Was passiert, wenn beim Start zu wenig Parameter
        // übergeben werden? Sagen wir, es fehlt eine Zahl, oder anstatt einer Zahl wird ein Zeichen übergeben.
        // Um das abzufangen soll am Anfang der String "args" auf die Länge geprüft werden, ob es genau 3 ist.
        // Wenn das nicht der Fall ist, also mehr als 3 oder weniger als 3, dann soll die Fehlermeldung
        // "Zu wenig Parameter angebeben. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>"
        // bzw. bei zu vielen Parametern
        // "Zu viele Parameter angebeben. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>"
        // ausgegeben werden. Nach Ausgabe der Fehlermeldung muss das Programm beendet werden. Das kann mit
        // return; nach der Fehlerausgabe geschehen.
        //
        // Anschließend muss geprüft werden, dass der 2. und 3. Parameter ein Zahlenwert ist. Das kann mittels
        // Integer.parseInt(...) geschehen. Diese wirft eine sogenannte Exception. Das ist ein Mittel um
        // Fehler zu behandeln und diese an anderer Stelle abzufangen. Das funktioniert mit einem try-catch-Block.
        // Als Beispiel:
        // String eingabe = "Hallo";
        // int eingabeZahl;
        // try {
        //   eingabeZahl = Integer.parseInt(eingabe);
        // } catch(NumberFormatException e) {
        //   // Hier kommt man im Fehlerfall hin und kann z. B. Fehlermeldungen ausgeben.
        //   return; // Das muss gemacht werden, damit das Programm beendet wird.
        // }
        // Sollte Integer.parseInt(...) keine Exception erzeugen, wird der catch-Block übersprungen.
        // Integer.parseInt(...) wirft die NumberFormatException. Andere bekanntere Exceptions sind etwa
        // die NullPointerException. Diese kann man auch mittels try-catch fangen.
        // Im Fehlerfall, also wenn eine NumberFormatException geworfen wird, sollen die Fehlermeldungen kommen:
        // "Ungültige Eingabe. Benutzung: taschenrechner.jar <methode> <operand1> <operand2>"
        // "methode muss einer der folgenden Werte sein: add, sub, mul, div"
        // "operand1 und operand2 müssen ganze Zahlen sein"
        // Nach der Fehlerausgabe soll das Programm beenden. Das kann man mittels return; machen.
        //
        // Die Prüfung der Methode soll wie auch in der Voraufgabe zur folgenden Fehlermeldung führen:
        // "<methode> keine gültige Operation"

        // Ausgabe: wird wieder über Tests geprüft.

    }
}
