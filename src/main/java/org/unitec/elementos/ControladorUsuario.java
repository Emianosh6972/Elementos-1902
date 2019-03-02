package org.unitec.elementos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    // Metodo 2 -> Mostrar todos los usuarios : findAll();
        @GetMapping("/usuario")
        List <Usuario> buscarTodos()
        {
            return repoU.findAll();
        }
    // Metodo 3 -> Mostrar uauario mediante ID : get()
        @GetMapping("/usuario/{id}")
        Usuario buscarporId(@PathVariable Integer id)
        {
            return repoU.findById(id).get();
        }
    // Metodo 4 -> Actualizar usuario : get()
        @PutMapping("/usuario")
        Estatus actualizar(@RequestBody String json) throws Exception
        {
            ObjectMapper mapper = new ObjectMapper();
            
            Usuario u = mapper.readValue(json, Usuario.class);
            
            repoU.save(u);
            
            Estatus e= new Estatus("Usuario actualizado con exito!!!", true);
            
            return e;
        }
    // Metodo 5 -> Borrar usuario : delete()
        @DeleteMapping("/usuario/{id}")
        Estatus borrar(@PathVariable Integer id)
        {
            repoU.deleteById(id);
            
            Estatus e = new Estatus("Usuario eliminado con exito!!!", true);
            
            return e;
        }
}
