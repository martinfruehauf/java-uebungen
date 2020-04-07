public class Main {

    public static void main(String[] args) {

        // TODO: In dieser Aufgabe wollen wir unsere erste Funktion schreiben. Zuerst prüfen wir ob args die Größe 2
        // hat. Wenn nicht soll die Fehlermeldung "args muss 2 Parameter haben" ausgegeben werden. Danach soll das
        // Programm mittels "return" beendet werden.
        // Anschließend sollen args[0] und args[1] in int Variablen gespeichert werden. Sollte einer der beiden nicht
        // vom Typ "int" sein, wirft Integer.parseInt(...) eine Exception. Diese soll mittels try-catch-Block abgefangen
        // werden. Es soll eine Fehlermeldung erscheinen "args[0] ist unültig." bzw. "args[1] ist ungültig" erscheinen.
        // Anstatt das Programm in eimem Fehlerfall mit "return" zu beenden wie zuvor, soll anstatt des args-Wertes
        // der Zahlenwert 0 benutzt werden.
        // Zum Beispiel:
        // int operand1;
        // try {
        //   operand1 = Integer.parseInt(args[0]);
        // } catch(NumberFormatException e) {
        //   operand1 = 0;
        // }
        // Somit bricht das Programm nicht ab und berechnet dennoch etwas.
        //
        // Nun soll eine neue Funktion "static int addiere(int operand1, int operand2)" hinzugefügt werden. Sie soll ein
        // return enthalten, wo die beiden Operanden addiert werden.
        // Diese kann dann in der main wie auch andere Methoden aufgerufen werden: addiere(1, 2); Sie gibt einen
        // int-Wert zurück, der dann für die Ausgabe genutzt werden kann.
        // Entsprechend soll die addiere-Methode mit den beiden Zahlenwerten aus args ausgeführt und die Addition
        // ausgegeben werden.
        //
        // Die Ausgabe soll wie folgt aussehen:
        // operand1 + operand2 = summe
        //
        // Zum Beispiel, wenn args[0] = 34 und args[1] = 66 ist, soll die Ausgabe wie folgt sein:
        // 34 + 66 = 100

    }

    static int addiere(int o1, int o2) {
        return o1 + o2;
    }
}
