package com.cosorio.cajero;

import java.util.Scanner;

/*
    Programa que emula la interfaz de un cajero automatico. El programa presentara las siguientes opciones:

    Elija una de las siguientes opciones:

        Escriba 1 para consultar su saldo
        Escriba 2 para ingresar dinero
        Escriba 3 para sacar dinero
        Escriba 4 para consultar sus ultimos movimientos
      Una vez escrita la opcion, pulse Enter

      Una vez el usuario ha elegido la opcion, el programa le mostrara por pantalla el numero correspondiente a la opcion elegida
 */


public class Interfaz {

    public static void main(String[] args) {


        System.out.println("Por favor introduzca su numero de identificacion");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Por favor introduzca su contrasena");
        String contrasena = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasena);

        int opcionSeleccionada;

        do {

            System.out.println("Bienvenido al Cajero Automatico: ");
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Consultar ultimos movimientos");
            System.out.println("5. Consultar las condiciones legales");
            System.out.println("Para salir escriba cualquier otro numero");
            opcionSeleccionada = scanner.nextInt();


            switch (opcionSeleccionada) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCondicionesLegales();
                    break;
                default:
                    cajero.salir();
                    break;

            }

        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4 || opcionSeleccionada == 5);

    }
}
