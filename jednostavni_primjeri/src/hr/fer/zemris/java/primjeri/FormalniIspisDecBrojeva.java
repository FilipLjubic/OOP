package hr.fer.zemris.java.primjeri;

import java.text.DecimalFormat;

/**
 * Potrebno je napisati program koji definira metodu koja prima polje double-ova i ispisuje ih na zaslon po zadanom formatu.
 * Napisati glavni program koji će brojeve ispisati na sljedeće načine:
 * • najmanje tri mjesta za cijelobrojni dio, dva mjesta za decimalni te
 * • dva + dva mjesta s obaveznim ispisom predznaka.
 *
 * Program  ćemo  nazvati  FormatiraniIspisDecBrojeva  i  smjestit  ćemo  ga  u  paket hr.fer.zemris.java.primjeri.
 * Rješenje je prikazano u nastavku
 */

public class FormalniIspisDecBrojeva {
    public static void ispis(double[] polje, String format){
        DecimalFormat formatter = new DecimalFormat(format);
        for (int i = 0; i < polje.length; i++){
            System.out.println("( " + i + " ) : " + formatter.format(polje[i]) );
        }
    }

    public static void main(String[] args){
        double[] brojevi = new double[] {
            3.712, 55.813, 55.816, -4.18
        };
        ispis(brojevi, "000.00");
        ispis(brojevi, "+00.00;-00.00");
    }
}
