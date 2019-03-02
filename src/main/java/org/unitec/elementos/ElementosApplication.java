package org.unitec.elementos;

import com.sun.corba.se.impl.activation.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner
{
    @Autowired
    RepoUsuario repoU;
    
    public static void main(String[] args) 
    {
        SpringApplication.run(ElementosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception 
    {
        // Aqui se hallaran todas las pruebas sin necesidad de una interfaz gráfica
        
        //repoU.save(new Usuario(2, "Iván"));     -> Operacion de guardado
        
        /*                                      _
        Usuario u = new Usuario();               |
        u.setId(3);                              |
        u.setNombre("Ali");                      |-> Operacion de guardado ( forma en ciclo for )
        repoU.save(u);                           |
        */ //                                   _|
        
        /*                                      _
        for(Usuario u:repoU.findAll())           |
        {                                        |
            System.out.println(u);               |-> Operacion de Buscar Todos
        }                                        |
        */ //                                   _|
        
        /*                                      _
        System.out.println                       |
        (                                        |
            repoU.findById(2).get()              |-> Operacion de buscar por ID
        );                                       |
        */ //                                   _|
        /*
        for(Usuario u:repoU.findByNombre("prueba"))yName("Emiliano"))
           {
               System.out,println(u);
                       
           }
           
        
        /*                                      _
        repoU.save                               |
        (                                        |
            new Usuario(1, "Emiliano Gallardo")  |-> Operacion de actualizar por ID
        );                                       |
        *///                                    _|

        // repoU.deleteById(3);                   -> Operacion de Borrar 
        
        
        
    }
}

