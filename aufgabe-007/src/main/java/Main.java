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

        String[] daten = new String[1];

        daten[0] = "add";
        if (daten[0].equals("add")) {
            System.out.println(daten[0] + " ist implementiert");
        } else {
            System.out.println(daten[0] + " ist noch nicht implementiert");
        }

        daten[0] = "sub";
        if (daten[0].equals("add")) {
            System.out.println(daten[0] + " ist implementiert");
        } else {
            System.out.println(daten[0] + " ist noch nicht implementiert");
        }

        daten[0] = "div";
        if (daten[0].equals("add")) {
            System.out.println(daten[0] + " ist implementiert");
        } else {
            System.out.println(daten[0] + " ist noch nicht implementiert");
        }

        daten[0] = "mul";
        if (daten[0].equals("add")) {
            System.out.println(daten[0] + " ist implementiert");
        } else {
            System.out.println(daten[0] + " ist noch nicht implementiert");
        }

        daten[0] = "foo";
        if (daten[0].equals("add")) {
            System.out.println(daten[0] + " ist implementiert");
        } else {
            System.out.println(daten[0] + " ist noch nicht implementiert");
        }
    }
}
