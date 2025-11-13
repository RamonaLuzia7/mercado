package br.com.senai.backend.sistema_mercado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;
import br.com.senai.backend.sistema_mercado.repositories.MercadoriaRepository;

@Service
public class MercadoriaService {
   
    @Autowired
    private MercadoriaRepository merRepository;

    public Mercadoria cadastrar(Mercadoria mercadoria) {
        return merRepository.save(mercadoria);
    }
    
    public Mercadoria recuperarPorId(Integer id){
        return merRepository.findById(id).get();
}
}