package br.com.senai.backend.sistema_mercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Funcionario;
import br.com.senai.backend.sistema_mercado.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    public Funcionario cadastrar(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario recuperarPorId(Integer id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public List<Funcionario> listarTodos() {
        return funcionarioRepository.findAll();
    }

   
    public Funcionario atualizar(Integer id, Funcionario funcionario) {
        Optional<Funcionario> funOpt = funcionarioRepository.findById(id);

        if (funOpt.isPresent()) {
            funcionario.setId(funOpt.get().getId());
            return funcionarioRepository.save(funcionario);
        }
        return null; 
    }

    public boolean removerPorId(Integer id) {
        if (funcionarioRepository.existsById(id)) {
            funcionarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
