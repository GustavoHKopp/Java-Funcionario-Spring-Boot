package spring.sistema.funcionarios.service;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import spring.sistema.funcionarios.model.Funcionario;
import spring.sistema.funcionarios.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> listarTodos(){
		return repository.findAll();
	}
	
	public Funcionario salvar(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	
	public Funcionario alterar(Funcionario funcionarioAtt, Long id) {
		return repository.findById(id).map(funcionario -> {
				boolean alterado = false;
				if (funcionarioAtt.getNome() != null) {
					funcionario.setNome(funcionarioAtt.getNome());
					alterado = true;
				}
				if (funcionarioAtt.getSalario() != null) {
					funcionario.setSalario(funcionarioAtt.getSalario());
					alterado = true;
				}
				if (funcionarioAtt.getFuncao () != null) {					
					funcionario.setFuncao(funcionarioAtt.getFuncao());
					alterado = true;
				}
				if (funcionarioAtt.getSetor() != null) {					
					funcionario.setSetor(funcionarioAtt.getSetor());
					alterado = true;
				}
				
				if (!alterado) {
		            throw new IllegalArgumentException("Nenhum campo para atualizar. verifique se a sintaxe está correta!");
		        }
				return repository.save(funcionario);
		}).orElseThrow(() -> new EntityNotFoundException("Funcionario não encontrado"));
	}
}
