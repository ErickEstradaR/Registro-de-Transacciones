package org.programacion3.nominavacana;

public class BanReservas {
    private String moneda;
    private String numCuenta;
    private String numCuentaBeneficiario;
    private float cantidad;
    private String concepto;

    public BanReservas() {
    }

    public BanReservas(String moneda, String numCuenta, String numCuentaBeneficiario, float cantidad, String concepto) {
        this.moneda = moneda;
        this.numCuenta = numCuenta;
        this.numCuentaBeneficiario = numCuentaBeneficiario;
        this.cantidad = cantidad;
        this.concepto = concepto;

    }

    @Override
    public String toString() {
        return "Transaccion BanReservas {Moneda=" + moneda +" numCuenta=" + numCuenta + " numCuentaBeneficiario= "
                + numCuentaBeneficiario
                + " cantidad= " + cantidad + " concepto=" + concepto + "}" + "\n" ;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumCuentaBeneficiario() {
        return numCuentaBeneficiario;
    }

    public void setNumCuentaBeneficiario(String numCuentaBeneficiario) {
        this.numCuentaBeneficiario = numCuentaBeneficiario;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
