public class Main {

    public static void main(String[] args) {

        final String daten = "1,2,3,4,5,6,7,8,9";

        // TODO: In dieser Aufgabe sollen Daten gelesen werden. Diese Daten sind mit einem Komma voneinander getrennt.
        // Die Daten sind über diesem Kommentar vorgeben und dürfen nicht geändert werden.
        // Die Daten sollen nun in ein int[] umgewandelt werden. Dazu müssen diese zuerst mit der String.split(...)
        // Methode aufgeteilt werden. Angenommen wir haben den String "Feuer:21" und möchten die Werte "feuer" und "21"
        // bekommen, können wir Split nutzen:
        //  String daten = "Feuer:21";
        //  String[] split = daten.split(":");
        // Nun ist in split[0] "Feuer" und in split[1] "21".
        //
        // Da wir nach dem Split ein String-Array haben, müssen wir das noch umwandeln. Dazu erzeugen wir uns ein int[]
        // mit entsprechender Größe. Die Größe von dem String Array kann mittels "split.length" herausgefunden werden.
        // Anschließend muss mit einer Schleife über das String-Array iteriert und in das neue int[] der jeweiligen
        // Zahlenwer gespeichert werden. Das kann man, wie wir schon vorher nutzten, mit "Integer.parseInt(zahl)"
        // erreichen.
        //
        // Abschließend sollen die Zahlen summiert und ausgegeben werden:
        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
        // Hier empfiehlt sich wieder der StringBuilder.

    }
}
