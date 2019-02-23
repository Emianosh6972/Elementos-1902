package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class ControladorUsuario 
{
    @Autowired RepoUsuario repoU;
    // Metodo 1 -> Guardar usuario : save()
        @PostMapping("/usuario")
        Estatus guardar(@RequestBody String json) throws Exception
        {
            ObjectMapper maper = new ObjectMapper();
            
            Usuario u = maper.readValue(json, Usuario.class);
            
            repoU.save(u);
            
            Estatus e = new Estatus ("Usuario guardado con exito!!!", true);
            
            return e;
        }
    
}
