package pe.edu.upc.vwalletweb.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.entities.Usuario;
import pe.edu.upc.vwalletweb.repositories.IUsuarioRepository;
import pe.edu.upc.vwalletweb.servicesinterfaces.IUsuarioService;
import pe.edu.upc.vwalletweb.entities.Usuario;
import pe.edu.upc.vwalletweb.repositories.IUsuarioRepository;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
@Autowired
    private IUsuarioRepository iR;
    @Override
    public void insert(Usuario usuario) {
    iR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return iR.findAll();
    }
}
