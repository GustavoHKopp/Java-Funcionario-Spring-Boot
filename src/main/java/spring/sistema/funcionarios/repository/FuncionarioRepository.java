package spring.sistema.funcionarios.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

import spring.sistema.funcionarios.dto.FuncionarioDTO;
import spring.sistema.funcionarios.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	@Query("SELECT new spring.sistema.funcionarios.dto.FuncionarioDTO(f.id, f.nome, f.funcao) FROM Funcionario f")
    List<FuncionarioDTO> buscarTodos();
}