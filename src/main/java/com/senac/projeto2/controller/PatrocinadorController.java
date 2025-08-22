package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Patrocinador;
import com.senac.projeto2.service.PatrocinadorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/patrocinador")
@Tag(name = "Patrocinador", description = "API para gerenciamento de patrocinadores do sistema")
public class PatrocinadorController {

    private final PatrocinadorService patrocinadorService;

    public PatrocinadorController(PatrocinadorService patrocinadorService) {
        this.patrocinadorService = patrocinadorService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar patrocinadores do sistema")
    public ResponseEntity<List<Patrocinador>> listar(){
        return ResponseEntity.ok(patrocinadorService.listarPatrocinadores());
    }

    @GetMapping("/listarPorIdPatrocinador/{idPatrocinador}")
    @Operation(summary = "Listar patrocinadores do sistema pelo id")
    public ResponseEntity<Patrocinador> listarPorIdPatrocinador(@PathVariable("idPatrocinador") Integer idPatrocinador){
        Patrocinador patrocinador = patrocinadorService.listarPatrocinadorPorId(idPatrocinador);
        if (patrocinador == null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(patrocinador);
        }
    }

    @PostMapping("/criar")
    public String criar(){
        return "Patrocinador Criado com sucesso!";
    }

    @PutMapping("/atualizar")
    public String atualizar(){
        return  "Patrocinador atualizado com sucesso!";
    }

    @DeleteMapping("/apagar")
    public String apagar(){
        return "Patrocinador apagado com sucesso!";
    }


}
