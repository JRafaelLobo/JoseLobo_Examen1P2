package com.mycompany.joselobo_examen1p2;

public class PC_Escritorio extends PC {

    int ram, almacen;
    String tipoAlmacen;
    boolean tieneTarjetaGrafica;

    public PC_Escritorio() {
    }

    public PC_Escritorio(int ram, int almacen, String tipoAlmacen, boolean tieneTarjetaGrafica) {
        this.ram = ram;
        this.almacen = almacen;
        this.tipoAlmacen = tipoAlmacen;
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public PC_Escritorio(int ram, int almacen, String tipoAlmacen, boolean tieneTarjetaGrafica, String ip, String mascara) {
        super(ip, mascara);
        this.ram = ram;
        this.almacen = almacen;
        this.tipoAlmacen = tipoAlmacen;
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public String getTipoAlmacen() {
        return tipoAlmacen;
    }

    public void setTipoAlmacen(String tipoAlmacen) {
        this.tipoAlmacen = tipoAlmacen;
    }

    public boolean isTieneTarjetaGrafica() {
        return tieneTarjetaGrafica;
    }

    public void setTieneTarjetaGrafica(boolean tieneTarjetaGrafica) {
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    @Override
    public String toString() {
        return super.toString() + "PC_Escritorio{" + "ram=" + ram + ", almacen=" + almacen + ", tipoAlmacen=" + tipoAlmacen + ", tieneTarjetaGrafica=" + tieneTarjetaGrafica + '}';
    }

    public String Datos() {
        return toString();
    }

}
