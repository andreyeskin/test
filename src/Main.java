public class Main {



    /**
     * In diese Klasse finden Sie Lösungsmöglichkeiten für die Übungen von Woche 1
     * (SWE03) zum Thema Rekursion:
     * - istDreierPotenz (für die Überprüfung, ob eine Zahl eine Dreipotenz ist),
     * - ausgabe (für Morsecodes),
     * - anzahl2 (für Anzahl an Morsecodes)
     * - fibo (für Fibonacci)
     * Alle Methoden sind zufälligerweise als static definiert...
     */
    public class main {

        /**
         * Diese Methode wird alle andere Methoden testen/aufrufen
         * @param args command-line Argumente (nicht verwendet)
         */
        public static void main(String[] args) {
            System.out.println(String.format("%d: %b", 28, istDreierPotenz(28)));
            ausgabe(3, "");
            anzahl2(5);
            System.out.println(fibo(10));
        }

        /**
         * Überprüft, ob eine Zahl {@code test} eine Dreierpotenz ist.
         * @param test die Zahl, die überprüft sein sollte
         * @return ein boolescher Wert: true, wenn {@code test} eine Dreierpotenz ist,
         * false, andersfalls.
         */
        private static boolean istDreierPotenz(int test) {
            if (test == 1) {
                return true;
            }
            if (test == 0 || test % 3 != 0) {
                return false;
            }
            return istDreierPotenz(test / 3);
        }

        /**
         * Erzeugt alle Kombinationen von Morsecode, die mit {@code n} Zeiteinheiten
         * machbar sind. Die Kombinationen werden auf die Ausgabe geschrieben.
         * @param n die Anzahl an Zeiteinheiten
         * @param zeichenkette eine laufende Kombination von Morsecode
         */
        static void ausgabe(int n, String zeichenkette) {
            System.out.println(String.format("ausgabe(%d, '%s')", n, zeichenkette));
            if (n == 0) {
                // In einer neuen Zeile wird die bis hier zusammengesetzte Zeichenkette ausgegeben.
                // REKURSIONSANKER
                System.out.println(zeichenkette);
            } else {
                // Es stehen noch Zeiteinheiten zur Verfügung, also muss die Rekursion neu gestartet werden.
                System.out.print("ausgabe n-1 -> ");
                ausgabe(n - 1, zeichenkette + ".");
                if (n > 1) {
                    System.out.println("ausgabe n-2 -> ");
                    ausgabe(n - 2, zeichenkette + "-");
                }
            }
        }

        /**
         * Globales Attribut (Zähler) für die Speicherung von Ergebnissen zwischen
         * {@code anzahl2} und {@code anzahl}.
         */
        private static int result = 0;

        /**
         * Schreibt die Anzahl an Kombinationen von Morsecode,
         * die mit {@code n} Zeiteinheiten machbar sind.
         * @param n die Anzahl an Zeiteinheiten
         */
        static void anzahl2(int n) {
            result = 0;
            anzahl(n);
            System.out.println(result);
        }

        /**
         * Inkrementiert ein Zähler {@code result} jedes Mal, dass eine neue
         * Kombination von Morsecode, die mit {@code n} Zeiteinheiten machbar ist,
         * gefunden wurde.
         * Diese Methode ist eine abgespeckte Version (keine Speicherung der
         * Zeichenkette, keine Ausgaben) von {@code ausgabe}.
         * @param n die Anzahl an Zeiteinheiten
         */


        //Hello Daniela
        // Ich habe wirklich ein paar Veränderungen gemacht



        private static void anzahl(int n) {
            if (n == 0) {
                result++;
            } else {
                anzahl(n - 1);
                if (n > 1) {
                    anzahl(n - 2);
                }
            }

        }


        /**
         * Berechnet die {@code n}-te Fibonacci-Zahl
         * @param n das Grad der Fibonacci-Zahl
         * @return die berechnetete Fibonacci-Zahl
         */
        static int fibo(int n) {
            if (n >= 3)
                return fibo(n - 1) + fibo(n - 2);
            else
                return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println ("Hi Daniela");
    }

}