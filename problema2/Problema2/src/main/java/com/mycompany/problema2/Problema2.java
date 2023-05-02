package com.mycompany.problema2;

class EquivalenteHora{
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    public EquivalenteHora(){}
    public EquivalenteHora(double horas) {
        this.horas = horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void calcularDias(){
        this.dias = this.horas/24;
    }
    public void calcularMin(){
        this.minutos = this.horas*60;
    }
    public void calcularSeg(){
        this.segundos = this.horas*3600;
    }
    public double getHoras() {
        return this.horas;
    }
    public double getMinutos() {
        return this.minutos;
    }
    public double getSegundos() {   
        return this.segundos;
    }
    public double getDias() {
        return this.dias;
    }
    public String toString(){
        String mjs=String.format("Conversor de tiempo"
                + "%n %.2f horas son:"
                + "%n %.2f dias"
                + "%n %.2f min"
                + "%n %.2f seg",
            this.getHoras(),this.getDias(),this.getMinutos(),this.getSegundos());
        return mjs;
    }
}

public class Problema2 {
    public static void main(String[] args) {
        EquivalenteHora hora1=new EquivalenteHora(24);
        hora1.calcularDias();
        hora1.calcularMin();
        hora1.calcularSeg();
        System.out.println(hora1);   
    }
}
