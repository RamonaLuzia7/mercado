package br.com.senai.backend.sistema_mercado.services;

import java.util.List;

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

   public List<Funcionario> listarTodos() {
    return funRepository.findAll();
  }
   
   public Funcionario atualizar(Integer id, Funcionario funcionario) {
    Funcionario fun = FuncionarioRepository.findAll(id).get();
   if(fun != null){
     
     funcionario.setId(fun.getId());
    return FuncionarioRepository.save();
   }
   return null;
  }
    public boolean removerPorId(Integer id) {
    Funcionario fun =FuncionarioRepository.get(); 
    if(fun !=null){
        Funcionario.(id);
  } 
 }
}
