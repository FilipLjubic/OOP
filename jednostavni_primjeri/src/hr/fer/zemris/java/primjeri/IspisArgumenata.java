package hr.fer.zemris.java.primjeri;


public class IspisArgumenata {
    public static void main(String[] args){
        int num = args.length;
        for (int i = 0; i < num; i++){
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}