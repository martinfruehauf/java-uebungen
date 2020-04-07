public class Main {

    public static void main(String[] args) {

        // TODO: Schreibe ein Programm, das ein Array von Zahlen erzeugt. Dieses Array soll vom Typ int sein und 10
        // Felder groß sein. Das Array soll mit den Zahlen 5, 4, 3, 2, 1, 0, 9, 8, 7, 6 gefüllt und mittels
        // System.out.println ausgeben werden. Die Ausgabe soll wie folgt aussehen:
        //
        // 5
        // 4
        // 3
        // 2
        // 1
        // 0
        // 9
        // 8
        // 7
        // 6

        int [] intArray = {5, 4, 3, 2, 1, 0, 9, 8, 7, 6};
        for(int x : intArray){
            System.out.println(x);
        }

        // TODO: Schreibe im zweiten Teil, sofern nicht schon erfolgt, die Ausgabe mitteln for-Schleife
    }
}
