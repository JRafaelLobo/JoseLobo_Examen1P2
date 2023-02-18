package com.mycompany.joselobo_examen1p2;

public class Laptop extends PC {

    private String marca, definicion;
    private boolean traeRGB;

    public Laptop(String marca, String definicion, boolean traeRGB) {
        this.marca = marca;
        this.definicion = definicion;
        this.traeRGB = traeRGB;
    }

    public Laptop() {
    }

    public Laptop(String marca, String definicion, boolean traeRGB, String ip, String mascara) {
        super(ip, mascara);
        this.marca = marca;
        this.definicion = definicion;
        this.traeRGB = traeRGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public boolean isTraeRGB() {
        return traeRGB;
    }

    public void setTraeRGB(boolean traeRGB) {
        this.traeRGB = traeRGB;
    }

    @Override
    public String toString() {
        return "Laptop{" + "marca=" + marca + ", definicion=" + definicion + ", traeRGB=" + traeRGB + '}';
    }

}
