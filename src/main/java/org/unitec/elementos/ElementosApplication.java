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
        repoU.save(new Usuario(1, "Emiliano"));
    }
}

