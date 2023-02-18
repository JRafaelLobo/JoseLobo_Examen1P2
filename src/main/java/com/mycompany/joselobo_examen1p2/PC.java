package com.mycompany.joselobo_examen1p2;

public class PC {

    String ip, mascara;

    public PC() {
    }

    public PC(String ip, String mascara) {
        this.ip = ip;
        this.mascara = mascara;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "PC{" + "ip=" + ip + '}';
    }

}
