package br.com.senai.backend.sistema_mercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Funcionario;
import br.com.senai.backend.sistema_mercado.repositories.FuncionarioRepository;
@Service
public class FuncionarioService {
   
    @Autowired
    private FuncionarioRepository funRepository;

    public Funcionario cadastrar(Funcionario funcionario) {
        return funRepository.save(funcionario);
    }

    public Funcionario recuperarPorId(Integer id){
        return funRepository.findById(id).get();
}
}
