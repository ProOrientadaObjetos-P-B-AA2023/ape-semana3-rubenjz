package com.mycompany.problema3;
class InstitucionesEducativas{
    private String nombre;
    private String tipo;
    private int nAlumnos;
    private int nDocentes;
    private int nSedes;
    private double gastosEstud;
    private double presupuesto;
    public InstitucionesEducativas() {}   
    public InstitucionesEducativas(String nombre,
            String tipo,
            int nAlumnos,
            int nDocentes,
            int nSedes,
            double gastosEstud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nAlumnos = nAlumnos;
        this.nDocentes = nDocentes;
        this.nSedes = nSedes;
        this.gastosEstud = gastosEstud;
    }
    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNAlumnos(int nAlumnos) {
        this.nAlumnos = nAlumnos;
    }
    public void setNDocentes(int nDocentes) {
        this.nDocentes = nDocentes;
    }
    public void setNSedes(int nSedes) {
        this.nSedes = nSedes;
    }
    public void setGastosEstud(double gastosEstud) {
        this.gastosEstud = gastosEstud;
    }
    //calcular presupuesto
    public void calcularPresupuesto(){
        this.presupuesto = this.nAlumnos * this.gastosEstud;
    }
    //get
    public String getNombre() {
        return this.nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    public int getNAlumnos() {
        return this.nAlumnos;
    }
    public int getNDocentes() {
        return this.nDocentes;
    }
    public int getNSedes() {
        return this.nSedes;
    }
    public double getGastosEstud() {
        return this.gastosEstud;
    }
    public double getPresupuesto() {
        return this.presupuesto;
    }
    public String toString(){
        String msj=String.format("Institucion Educativa"
                + "%nNombre de la institucion: %s"
                + "%nTipo de institucion: %s"
                + "%nNumero de alumnos: %d"
                + "%nNumero de docentes: %d"
                + "%nNumero de sedes: %d"
                + "%nGastos por estudiante: %.2f"
                + "%nPresupuesto: %.2f",
                this.getNombre(),this.getTipo(),this.getNAlumnos(),this.getNDocentes(),this.getNSedes(),this.getGastosEstud(),this.getPresupuesto());
        return msj;
    }
}

public class Problema3 {

    public static void main(String[] args) {
        InstitucionesEducativas institucion1 = new InstitucionesEducativas("Comil-5", "fiscomisional", 1300, 60, 1,90);
        institucion1.calcularPresupuesto();
        System.out.println(institucion1);
    }
}
