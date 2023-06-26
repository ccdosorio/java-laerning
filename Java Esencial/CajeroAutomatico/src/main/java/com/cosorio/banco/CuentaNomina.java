package com.cosorio.banco;

public class CuentaNomina extends CuentaBancaria {

    public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo) {
        super(titular, tipo, saldo);
    }

    public CuentaNomina(String titular, double saldo) {
        super(titular, saldo);
    }

    public CuentaNomina() {
        super();
    }

    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones legales de la cuenta de ahorro de NOMINA ***");
        System.out.println("Segun el acuerdo firmado por usted ....");
        System.out.println("Mientras mantenga las condiciones de su cuenta, usted no tendra comision.  ");
    }
}
