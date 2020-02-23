package hr.fer.zemris.java.primjeri;

import java.io.*;
import java.util.*;

/**
 * Program koji prikazuje više načina na koji možemo
 * učitati inpute s tipkovnice/filea
 */


public class NapredniInputi {
    public static void main(String[] args) throws IOException {
        String input = "1   abc  2 abc filip abc matej abc";
        regex(input);
    }
    /*
     * 1. način  -- čita redak, !!obično loša metoda!!
     */
    public static void read_line(){
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) break;
        double broj = Double.parseDouble(line);
        reader.close();
    }
    /*
     * 2. način  -- čita broj po broj s tipkovnice
     */
    public static void scan_int_by_int(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
    }

    /*
     *3. način  -- čita file
     */
    public static void scan_file("FILE_NAME"){
        Scanner sc = new Scanner(new File("FILE_NAME"));
        while (sc.hasNextInt()){
            int var = sc.nextInt();
        }
        sc.close();
    }
    /*
     *4. način  -- editanje unaprjed pripremljenog stringa
     */
    public static void regex(String input){
        Scanner s = new Scanner(input).useDelimiter("\\s*abc\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }
}
