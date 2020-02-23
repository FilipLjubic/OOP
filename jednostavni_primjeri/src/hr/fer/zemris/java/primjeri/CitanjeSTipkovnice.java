package hr.fer.zemris.java.primjeri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CitanjeSTipkovnice {
    public static void main(String[] args) throws IOException {
        System.out.println("Racunanje pozitivnih brojeva: ");
        double suma = 0.0;

        //declareanje readera pomocu cijih metoda mozemo dobivati stream s tipkovnice
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String input = reader.readLine();
            if (input == null) break;
            double broj = Double.parseDouble(input);
            if (broj < 0) break;
            suma += broj;
        }

        System.out.println("Suma je: " + suma);
        reader.close();
    }
}
