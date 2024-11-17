package org.programacion3.nominavacana;

public class BancoBHD {
    private String nombreEmpleado;
    private String cuentaEmpleado;
    private String referencia;
    private Float montoPago;
    private String concepto;

    public BancoBHD(){}

    public BancoBHD(String nombreEmpleado, String cuentaEmpleado, String referencia, Float montoPago, String concepto) {
        this.nombreEmpleado = nombreEmpleado;
        this.cuentaEmpleado = cuentaEmpleado;
        this.referencia = referencia;
        this.montoPago = montoPago;
        this.concepto = concepto;
    }



    @Override
    public String toString() {
        return "Transaccion Bhd{" + "NombreEmpleado= " + nombreEmpleado +
                "CuentaEmpleado= " +cuentaEmpleado + "referencia= " + referencia + "MontoPago= " + montoPago + "Concepto= "
                + concepto + '}' + "\n";
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCuentaEmpleado() {
        return cuentaEmpleado;
    }

    public void setCuentaEmpleado(String cuentaEmpleado) {
        this.cuentaEmpleado = cuentaEmpleado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public float getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(float montoPago) {
        this.montoPago = montoPago;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
