package com.mycompany.joselobo_examen1p2;
public class PC {
    String ip;

    public PC() {
    }

    public PC(String ip) {
        this.ip = ip;
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
