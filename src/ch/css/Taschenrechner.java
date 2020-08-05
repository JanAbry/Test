package ch.css;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        System.out.println("Was möchten sie berrechnen");
        System.out.println("1. Fläche");
        System.out.println("2. Volumen");

        int fläche = 1;
        int volumen = 2;

        Scanner input1 = new Scanner(System.in);
        int firstInput = input1.nextInt();
        if (firstInput == 1) {
            System.out.println("1.Viereck");
            System.out.println("2.Dreieck");
            System.out.println("3.Kreis");
            int secondInput = input1.nextInt();
            if (secondInput == 1) {
                System.out.println("geben sie die erste Seitenlänge ein");
                double inputLenghtA = input1.nextInt();
                System.out.println("geben sie die zweite Seitenlänge ein");
                double inputLenghtB = input1.nextInt();
                System.out.println("Resultat= " + (inputLenghtA * inputLenghtB));
            }

            if (secondInput == 2) {
                System.out.println("geben sie die Grundseite ein");
                double inputLenghtA = input1.nextInt();
                System.out.println("geben sie die Höhe ein");
                double inputLenghtB = input1.nextInt();
                System.out.println("Resultat= " + (inputLenghtA * inputLenghtB / 2));
            }

            if (secondInput == 3) {
                System.out.println("geben sie den Radius ein");
                double inputLenghtA = input1.nextInt();
                System.out.println("Resultat= " + (inputLenghtA * inputLenghtA) * 3.14159265359);


            }

        } else if (firstInput == 2) {
            System.out.println("1. Würfel");
            System.out.println("2.Quader");
            System.out.println("3.Kugel");
            int secondInput = input1.nextInt();
            if (secondInput == 1) {
                System.out.println("geben sie eine erste Seitenlänge ein");
                double inputLenghtA = input1.nextInt();
                System.out.println("Resultat= " + (inputLenghtA * inputLenghtA * inputLenghtA));
            }
            if (secondInput == 2) {
                System.out.println("geben sie die erste Seitenlänge ein");
                double inputLenghtA = input1.nextInt();
                System.out.println("geben sie die zweite Seitenlänge ein");
                double inputLenghtB = input1.nextInt();
                System.out.println("geben sie die Höhe ein");
                double inputLenghtC = input1.nextInt();
                System.out.println("Resultat= " + (inputLenghtA * inputLenghtB * inputLenghtC));
            }


        } else {
            System.out.println("ERROR");
        }
    }
}
