public class PasoPorReferencia {
    public static void main(String[] args) {
        int variable1 = 23;
        int variable2 = variable1;

        System.out.println("El valor de variable1 es " + variable1);
        System.out.println("El valor de variable2 es " + variable2);

        variable2 = 78;

        System.out.println("----");

        System.out.println("El valor de variable1 es " + variable1);
        System.out.println("El valor de variable2 es " + variable2);

        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.saldo = 23_500;

        CuentaBancaria cuentaDeAna = cuentaDeJuan;

        cuentaDeAna.saldo = 10_000;

        // Ambas variables estan guardando la referencia al mismo objeto
        // Cuando queremos crear un nuevo objeto, debemos usar un constructor de la clase a la cual queremos el objeto con el operador new
        // Si guardamos la referencia, ambas apuntarán al mismo objeto

        System.out.println("Saldo Juan: " + cuentaDeJuan.saldo); // 10,000

        System.out.println("Saldo Ana: " + cuentaDeAna.saldo); // 10,000
    }
}
