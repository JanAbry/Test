package ch.css;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

import java.util.Random;

public class ZahlErraten {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 10;
        int int_random = rand.nextInt(upperbound);
        int tries = 1;
        System.out.println("Errate eine Zahl zwischen 0 und 30");
        while (tries > 0) {
            System.out.println(tries + ". Rateversuch");
            Scanner input1 = new Scanner(System.in);
            int firstInput = input1.nextInt();
            if (firstInput < int_random) {
                System.out.println("Die Zufallszahl ist höher");
                tries += 1;

            }
            if (firstInput > int_random) {
                System.out.println("Die Zufallszahl ist tiefer");
                tries += 1;
            }

            if (tries == 9) {
                System.out.println("Game over");
                System.exit(1);
            }
            if (firstInput == int_random) {
                System.out.println("Du hast die Zahl gefunden!");
                System.exit(0);
            }

        }
    }
}

