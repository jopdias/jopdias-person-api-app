package com.digitalinnovationone.gerenciadordepessoas.controller;


import com.digitalinnovationone.gerenciadordepessoas.service.JornadaService;
import com.digitalinnovationone.gerenciadordepessoas.model.JornadaTrabalho;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Uma classe controller é responsavel por lidar com as requisições
@RestController//Handle the jason
@RequestMapping("/jornada")//Estabele que quando o cliente for para este endereço, se refirá a este controlller
public class JornadaTrabalhoController {


  @Autowired//Faz com que o jornadaTrabalha trabalhe como se já tivesse um estado inicial declarado
  JornadaService jornadaService;

  @PostMapping//esta notação diz que quando o cliente quiser um Post dentro de /jornada, ele usará esse método
  public JornadaTrabalho createJornadaTrabalho(@RequestBody JornadaTrabalho jornadaTrabalho){
  return jornadaService.saveJornada(jornadaTrabalho);
  }

  @GetMapping
  public List<JornadaTrabalho> getJornadaList(){
    return  jornadaService.findAll();
  }

  @GetMapping("/{idJornada}")
  public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception{
    return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("jornada não encontrada")));
  }

  @PutMapping
  public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
    return jornadaService.updateJornada(jornadaTrabalho);
  }

  @DeleteMapping("/{idJornada}")
  public ResponseEntity<Object> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception{
    try{
      jornadaService.deleteJornada(idJornada);
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    return ResponseEntity.ok(null);
  }


}
