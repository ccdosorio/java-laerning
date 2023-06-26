package com.cosorio.banco;

import java.math.BigDecimal;
import java.util.Scanner;

/*
    El programa que pida introducir una cantidad en euros y devuelva la conversión en US dólares
    El mensaje con el resultado será: ** euros equivales a ** US dólares
 */


public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor, introduzca una cantidad en euros y el programa le devolverá la conversión en US dólares");

        Scanner scanner = new Scanner(System.in);

        double euros = scanner.nextDouble();

        double dolares= 1.09 * euros;

        System.out.println(euros + " equivalen a " + dolares + " US dólares");

        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(euros + " euros equivalen a " + dolaresBigDecimal + " US dólares");

    }
}
