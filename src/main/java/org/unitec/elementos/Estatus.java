package org.unitec.elementos;

public class Estatus 
{
    public Estatus(String mensaje, boolean success) 
    {
        this.mensaje = mensaje;
        this.success = success;
    }
    
    private boolean success;
        public boolean isSuccess() { return success;}
        public void setSuccess(boolean success) { this.success = success; }

    private String mensaje;
        public String getMensaje() { return mensaje; }
        public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    
    
}
