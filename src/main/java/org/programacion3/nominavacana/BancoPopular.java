package org.programacion3.nominavacana;

import com.google.gson.annotations.Expose;

public class BancoPopular {

    private String TipoRegistro;
    private String IDcompania;
    private String NombreCompania;
    private String secuencia;
    private String secuenciatrans;
    private String cuentadestino;
    private String TipoCuentadestino;
    private int monedaDestino;
    private int codBancoDestino;
    private float montoTransaccion;
    private String nombrebeneficiario;


    public BancoPopular(String tipoRegistro, String IDcompania, String nombreCompania, String secuencia, String secuenciatrans, String cuentadestino, int monedaDestino, int codBancoDestino, float montoTransaccion, String nombrebeneficiario) {
        TipoRegistro = tipoRegistro;
        this.IDcompania = IDcompania;
        NombreCompania = nombreCompania;
        this.secuencia = secuencia;
        this.secuenciatrans = secuenciatrans;
        this.cuentadestino = cuentadestino;
        this.monedaDestino = monedaDestino;
        this.codBancoDestino = codBancoDestino;
        this.montoTransaccion = montoTransaccion;
        this.nombrebeneficiario = nombrebeneficiario;
    }

    @Override
    public  String toString() {
        return "Registro Transaccion{"  + "TipoRegistro=" + TipoRegistro + " IDcompania=" + IDcompania + " NombreEmpresa= " + NombreCompania
        + " Secuencia= " + secuencia + " Secuencia Trans= " + secuenciatrans + " Cuenta destino= " + cuentadestino +
                " Tipo cuenta destino= " + TipoCuentadestino + " MonedaDestino= " + monedaDestino + " CodBancoDestino= " + codBancoDestino +
                " MontoTransaccion= " + montoTransaccion + " Nombrebeneficiario= " + nombrebeneficiario + '}' + "\n";
    }

    public String getTipoRegistro() {
        return TipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        TipoRegistro = tipoRegistro;
    }

    public String getIDcompania() {
        return IDcompania;
    }

    public void setIDcompania(String IDcompania) {
        this.IDcompania = IDcompania;
    }

    public String getNombreCompania() {
        return NombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        NombreCompania = nombreCompania;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getSecuenciatrans() {
        return secuenciatrans;
    }

    public void setSecuenciatrans(String secuenciatrans) {
        this.secuenciatrans = secuenciatrans;
    }

    public String getCuentadestino() {
        return cuentadestino;
    }

    public void setCuentadestino(String cuentadestino) {
        this.cuentadestino = cuentadestino;
    }

    public String getTipoCuentadestino() {
        return TipoCuentadestino;
    }

    public void setTipoCuentadestino(String tipoCuentadestino) {
        TipoCuentadestino = tipoCuentadestino;
    }

    public int getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(int monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public int getCodBancoDestino() {
        return codBancoDestino;
    }

    public void setCodBancoDestino(int codBancoDestino) {
        this.codBancoDestino = codBancoDestino;
    }

    public float getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(float montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public String getNombrebeneficiario() {
        return nombrebeneficiario;
    }

    public void setNombrebeneficiario(String nombrebeneficiario) {
        this.nombrebeneficiario = nombrebeneficiario;
    }
}
