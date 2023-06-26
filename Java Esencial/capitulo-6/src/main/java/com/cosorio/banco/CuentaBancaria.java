package com.cosorio.banco;

public class CuentaBancaria {
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;

    private static final double COMISION = 1.2;

    public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, double saldo) {
        this(titular, TipoDeCuenta.AHORRO, saldo);
    }

    public CuentaBancaria() {
        this("", TipoDeCuenta.AHORRO, 0);
    }

    public void sacarDinero(double cantidad) {

        if (cantidad < 0) {
            return;
        }

        double comision = calcularComision();
        saldo -= cantidad;
        saldo -= comision;
    }

    private double calcularComision() {
        return switch (tipoDeCuenta) {
            case AHORRO -> COMISION;
            case NOMINA -> 0.0;
            default -> 0;
        };
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    protected void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
