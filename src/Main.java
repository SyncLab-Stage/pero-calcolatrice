import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        Calcolatrice calc = new Calcolatrice();

        System.out.println("Inserisci il primo numero:");
        double primoNumero = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero:");
        double secondoNumero = scanner.nextDouble();

        System.out.println("Scegli operazione:");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");

        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                double risultatoSomma = calc.somma(primoNumero, secondoNumero);
                System.out.println("Risultato somma: " + risultatoSomma);
                break;

            case 2:
                double risultatoSottrazione = calc.sottrazione(primoNumero, secondoNumero);
                System.out.println("Risultato sottrazione: " + risultatoSottrazione);
                break;

            case 3:
                double risultatoMoltiplicazione = calc.moltiplicazione(primoNumero, secondoNumero);
                System.out.println("Risultato moltiplicazione: " + risultatoMoltiplicazione);
                break;

            case 4:
                try {
                    double risultatoDivisione = calc.divisione(primoNumero, secondoNumero);
                    System.out.println("Risultato divisione: " + risultatoDivisione);
                } catch (DivisionePerZeroException e) {
                    System.err.println("Impossibile eseguire il calcolo: " + e.getMessage());
                }
                break;

            default:
                System.out.println("Scelta non valida");
        }
        scanner.close();
    }
}

