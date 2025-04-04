package spring.sistema.funcionarios.dto;

public class FuncionarioDTO {
    private Long id;
    private String nome;
    private String funcao;

    public FuncionarioDTO(Long id, String nome, String funcao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public String getFuncao() {
        return funcao;
    }
}
