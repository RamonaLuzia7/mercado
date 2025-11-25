package br.com.senai.backend.sistema_mercado.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;
import br.com.senai.backend.sistema_mercado.services.MercadoriaService;

@RestController
@RequestMapping("mercadoria")

public class MercadoriaController {

  @Autowired
  private MercadoriaService mercadoriaService;

  @PostMapping("/cadastrar")
  public Mercadoria cadastrar(@RequestBody Mercadoria mer) {
      return mercadoriaService.cadastrar(mer);
  }
  
  @GetMapping("/recuperar-por-id/{id}")
  public Mercadoria recuperarPorId(@PathVariable Integer id) {
    return mercadoriaService.recuperarPorId(id);
  }
   
    @GetMapping("/listar-todos")
  public List<Mercadoria> listartodos(){
    return mercadoriaService.listarTodos();
  }
  @PutMapping("/atualizar/{id}")
  public Mercadoria atualizar(@PathVariable Integer id, @RequestBody Mercadoria mer){
  return mercadoriaService.atualizar(id, mer);
  }
   
  @DeleteMapping("/deletar/{id}")
 public String removerPorId(@PathVariable Integer id){
 if(mercadoriaService.removerPorId(id)){
   return "Mercadoria removida com sucesso";
 }
 return "falha ao remover a mercadoria";
}
}

