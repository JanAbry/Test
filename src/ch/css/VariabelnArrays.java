package ch.css;

import com.sun.org.apache.bcel.internal.util.ClassStack;
import java.util.Scanner;

public class VariabelnArrays {
    public static void main(String[] args){
        int height=180;
        int weight=70;
        String name= "Jan";
        String surname= "Abry";
        double calculation=2*3;

        int a=50;
        double b=a;

        double c=6;
        int d= (int) c;

        System.out.println("Grösse: "+height+"cm");
        System.out.println("Gewicht: "+weight+"kg");
        System.out.println("Name: "+name);
        System.out.println("Nebenstifte:");


        String[]people={"Yanic","Dawid", "Leonie"};
        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[people.length-1]);

        }



        }
