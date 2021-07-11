package br.ufpe.cin.petcare.comunicacao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petcare.comunicacao.requestBody.pet.BuscarPetNomeBody;
import br.ufpe.cin.petcare.comunicacao.requestBody.pet.InserirPetBody;
import br.ufpe.cin.petcare.negocio.cadastro.pet.Pet;
import br.ufpe.cin.petcare.negocio.cadastro.usuario.Usuario;
import br.ufpe.cin.petcare.negocio.fachada.Fachada;

@RestController
@RequestMapping("/pet")
public class PetRestController {
    private Fachada fachada;

    @Autowired
    public PetRestController(ApplicationContext context) {
        this.fachada = Fachada.getInstance(context);
    }

    @PostMapping("inserir")
    public Pet inserirPet(@RequestBody InserirPetBody body) throws Exception {
        String token = body.getToken();
        String nome = body.getNome();
        Date dataNascimento = body.getDataNascimento();
        Usuario tutor = this.fachada.buscarUsuario(body.getTutorID());

        if (tutor != null) {
            Pet pet = new Pet(nome, dataNascimento, tutor);

            return this.fachada.inserirPet(token, pet);
        } else {
            throw new Exception("Não existe um usuário com o ID informado.");
        }
    }

    @PostMapping("buscar")
    public List<Pet> buscarPet(@RequestBody BuscarPetNomeBody body) throws Exception {
        String token = body.getToken();
        String nome = body.getNome();

        return this.fachada.buscarPet(token, nome);
    }
}
