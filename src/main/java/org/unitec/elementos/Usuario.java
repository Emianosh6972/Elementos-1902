package org.unitec.elementos;

import org.springframework.data.annotation.Id;

public class Usuario 
{
    @Id
    private Integer id;
        public Integer getId() { return id; }
        public void setId(Integer id) { this.id = id; }
        
    private String nombre;
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        
    private Localizacion localizacion;
        public Localizacion getLocalizacion() { return localizacion; }
        public void setLocalizacion(Localizacion localizacion) { this.localizacion = localizacion; }

    public Usuario() { }

    public Usuario(Integer id, String nombre) 
    {
        this.id = id;
        this.nombre = nombre;
    }
    
}