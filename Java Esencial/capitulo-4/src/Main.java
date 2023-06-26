public class Main {
    public static void main(String[] args) {
        /*CuentaBancaria cuentaDeJuan = new CuentaBancaria();

        cuentaDeJuan.titular = "Juan Martínez";
        cuentaDeJuan.tipoDeCuenta = "Nómina";
        cuentaDeJuan.saldo = 23_500;*/

        /*System.out.println("Cual es el saldo de la cuenta de Juan? " + cuentaDeJuan.saldo);

        cuentaDeJuan.sacarDinero(500);

        System.out.println("Ahora cuenta de juan tiene " + cuentaDeJuan.saldo);

        cuentaDeJuan.ingresarDinero(1000);

        System.out.println("Despues de ingresar dinero, cuenta de juan tiene " + cuentaDeJuan.saldo);

        cuentaDeJuan.cambiarTipoDeCuenta("ahorro");*/

        /*double saldo = cuentaDeJuan.obtenerSaldo();

        System.out.println("El saldo de Juan es " + saldo);

        cuentaDeJuan.sacarDinero(-1000);

        System.out.println("El saldo de juan tras sacar una cantidad negativa es " + cuentaDeJuan.obtenerSaldo());*/

        /*Calculadora calculadora = new Calculadora();

        double radio = 4.0;
        double area = calculadora.calcularAreaCirculo(radio);
        System.out.println("El area de un circulo de radio 4 es " + area);

        System.out.println("El volumen de un prisma de 5 * 4 * 8 es " + calculadora.calcularVolumenPrismaRectangular(5,4,8));

        double media = calculadora.calcularMedia(2.6, 2, 5,9, 8);

        System.out.println("La media es " + media);*/

        //CuentaBancaria cuentaDeJuan = new CuentaBancaria("Juan Martinez" , "Ahorro", 23_500);


        //CuentaBancaria cuentaDeMaria = new CuentaBancaria("Maria Perez", CuentaBancaria.TIPO_NOMINA, 12000);


        // CuentaBancaria cuentaDeAna = new CuentaBancaria("Ana Garcia", TipoDeCuenta.AHORRO, 23_500);

        Informador informador = new Informador();
        informador.mostrarPorPantalla(3);

        byte unByte = 2;
        informador.mostrarPorPantalla(unByte); // aqui se aplico la regla de promocion byte -> int
        informador.mostrarPorPantalla(5.3);
        informador.mostrarPorPantalla("Hola", Informador.COLOR_ROJO);
        informador.mostrarPorPantalla("Hola");
    }
}