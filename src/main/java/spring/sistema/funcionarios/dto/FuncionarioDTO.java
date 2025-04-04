package spring.sistema.funcionarios.dto;

public class FuncionarioDTO {
    private Long id;
    private String nome;

    public FuncionarioDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
