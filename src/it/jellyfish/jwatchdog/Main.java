package it.jellyfish.jwatchdog;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        if (args.length==0) {
            System.err.println("Error: you should pass at least one argument!");
            System.exit(1);
        }

        while (true) {
            ProcessBuilder pb = new ProcessBuilder(args);
            System.out.println("Starting the process...");
            Process p = pb.start();
            p.waitFor();
            System.out.println("WARNING: the process has exit!");
        }



    }





}
