public class CuentaBancaria {
    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;

    /*public static final String TIPO_AHORRO = "ahorro";
    public static final String TIPO_NOMINA = "nomina";*/

    static final double COMISION = 1.2;

    CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }

    CuentaBancaria(String titular, double saldo) {
       this(titular, TipoDeCuenta.AHORRO, saldo);
    }

    CuentaBancaria() {
        this("", TipoDeCuenta.AHORRO, 0);
    }

    void sacarDinero(double cantidad) {

        if (cantidad < 0) {
            return;
        }

        double comision = calcularComision();
        saldo -= cantidad;
        saldo -= comision;
    }

    double calcularComision() {
        return switch (tipoDeCuenta) {
            case AHORRO -> COMISION;
            case NOMINA -> 0.0;
            default -> 0;
        };
    }

    void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo() {
        return saldo;
    }
}
