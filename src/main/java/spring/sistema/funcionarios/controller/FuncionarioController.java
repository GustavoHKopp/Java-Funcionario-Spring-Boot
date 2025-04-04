package spring.sistema.funcionarios.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spring.sistema.funcionarios.dto.FuncionarioDTO;
import spring.sistema.funcionarios.model.Funcionario;
import spring.sistema.funcionarios.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
	@Autowired
	private FuncionarioService service;
	
	@GetMapping
	public List<FuncionarioDTO> listarTodos(){
		return service.listarTodos();
	}
	
	@GetMapping("/{id}")
	public Funcionario listarUm(@PathVariable Long id){
		return service.listarUm(id);
	}
	
	@PostMapping
	public Funcionario salvar (@RequestBody Funcionario funcionario) {
		return service.salvar(funcionario);
	}
	
	@PutMapping("/{id}")
	public Funcionario atualizar(@RequestBody Funcionario funcionario, @PathVariable Long id ) {
		return service.alterar(funcionario, id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, String>> deletar(@PathVariable Long id) {
	    Map<String, String> response = new HashMap<>();
	    try {
	        service.deletar(id);
	        response.put("message", "Funcionário deletado com sucesso!");
	        return ResponseEntity.status(HttpStatus.OK).body(response);
	    } catch (EmptyResultDataAccessException e) {
	        response.put("message", "Funcionário não encontrado!");
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	    }
	}
}
