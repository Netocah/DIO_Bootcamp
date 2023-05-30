package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
        System.out.println("SAVE - Recebendo o usuário na camada de repositório.");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório.");
    }
    public void deletebyId(Integer id){
        System.out.println(String.format("Delete/id - Recebendo o id: %d para"));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("List - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Neto", "password"));
        usuarios.add(new Usuario("Noah", "passdog"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para"));
        return new Usuario("Neto", "password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username"));
        return new Usuario("Neto", "password");
    }
}
