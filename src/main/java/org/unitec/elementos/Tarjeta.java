package org.unitec.elementos;

public class Tarjeta 
{   
    private String nombre;
        public String setnombre() { return nombre;}
        public void getnombre(String nombre) { this.nombre = nombre; }

    private Integer nip;
        public Integer getnip() { return nip; }
        public void setnip(Integer nip) { this.nip = nip; }
    
    private float saldo;
        public float getsaldo() { return saldo; }
        public void setsaldo (float saldo) { this.saldo = saldo; }
}
