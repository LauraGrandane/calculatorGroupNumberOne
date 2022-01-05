package com.kvstarter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.print("Ievadi pirmo ciparu un nospied Enter: ");
        num1 = input.nextInt();

        System.out.print("Ievadi otro ciparu un nospied Enter: ");
        num2 = input.nextInt();

        System.out.print("Ievadi vēlamo operāciju(+,-,/,*): ");
        operation = input.next();

        if (operation.equals("+"))
        {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        if  (operation.equals("-"))
        {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        if (operation.equals("*"))
        {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println("ERROR 404!!! Mēģini vēlreiz!");
        }
    }
}

