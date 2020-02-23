package hr.fer.zemris.java.primjeri;

/**
 * Ovaj program izračunava e^x uz Taylorov red i to koristeći prvih 10 članova tog reda
 */

public class SumaReda{
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Program mora imati 1 argument!");
            System.exit(1);
        }

        double broj = Double.parseDouble(args[0]);
        System.out.println("Računam sumu za broj " + broj);

        double rezultat = racunajSumu(broj);
        System.out.println("Rezultat je " + rezultat);
    }

    private static double racunajSumu(double broj) {
        double suma = 1.0;
        double potencija = 1.0;
        double faktorijela = 1.0;

        for (int i = 1; i < 10; i++){
            potencija = potencija * broj;
            faktorijela = faktorijela * i;
            suma += potencija/faktorijela;
        }

        return suma;
    }
}