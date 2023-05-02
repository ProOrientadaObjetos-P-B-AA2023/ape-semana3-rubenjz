package com.mycompany.problema4;
class Sistema{
    private String sistemaOp;
    private double tamanioPantalla;
    private double costoInicial;
    private double porcentajeIva;
    private double costoFinalIva;
    private String direccionMac;
    private int imei;
    public Sistema(){}
    public Sistema(String sistemaOp, 
            double tamanioPantalla, 
            double costoInicial, 
            String direccionMac, 
            int imei) {
        this.sistemaOp = sistemaOp;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.direccionMac = direccionMac;
        this.imei = imei;
    }
    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }
    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }
    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }
    public void setPorcentajeIva(double ivaPorcentaje) {
        this.porcentajeIva = porcentajeIva;
    }
    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }
    public void setImei(int imei) {
        this.imei = imei;
    }
    //calcular IVA
    public void calcularIVA(){
        this.porcentajeIva = this.costoInicial * 12 / 100;
    }
    public void calcularCostoFinal(){
        this.costoFinalIva = this.porcentajeIva + this.costoInicial;
    }
    public String getSistemaOp() {
        return this.sistemaOp;
    }
    public double getTamanioPantalla() {
        return this.tamanioPantalla;
    }
    public double getCostoInicial() {
        return this.costoInicial;
    }
    public double getPorcentajeIva() {
        return this.porcentajeIva;
    }
    public double getCostoFinalIva() {
        return this.costoFinalIva;
    }
    public String getDireccionMac() {
        return this.direccionMac;
    }
    public int getImei() {
        return this.imei;
    }
    public String toString(){
        String mjs = String.format("Dispositivo Samsung Galaxy A30: "
                + "%nSistema operativo: %s"
                + "%nTamaño de pantalla: %.2f"
                + "%nCosto inicial: %.2f"
                + "%nDireccion Mac: %s"
                + "%nIMEI: %d"
                + "%nIVA: %.2f"
                + "%nCOSTO FINAL: %.2f",
                this.getSistemaOp(),this.getTamanioPantalla(),this.getCostoInicial(),this.getDireccionMac(),this.getImei(),this.getPorcentajeIva(),this.getCostoFinalIva());
        return mjs;
    }
}
public class Problema4 {

    public static void main(String[] args) {
        Sistema dispositivo1 = new Sistema("Android", 6.4,300,"00:1B:44:11:3A:B7", 12332121);
        dispositivo1.calcularIVA();
        dispositivo1.calcularCostoFinal();
        System.out.println(dispositivo1);
    }
}
