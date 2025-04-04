
# 🏢 Sistema de Funcionários - API REST com Spring Boot

Este é um projeto de API REST para gerenciar funcionários, desenvolvido com Spring Boot. A API permite listar, cadastrar, atualizar e remover funcionários.

## Tecnologias Utilizadas

Java + Spring Boot

Spring Data JPA

Banco de Dados (PostgreSQL)

Maven
## Instalação e Execução

#### 1️⃣ Clone este repositório:

```bash
  git clone https://github.com/GustavoHKopp/Java-Funcionario-Spring-Boot.git

  cd seu-repositorio
```
#### 2️⃣ Instale as dependências:

```bash
    mvn clean install
```

#### 3️⃣ Execute a aplicação:

```bash
    mvn spring-boot:run
```

A API estará rodando em http://localhost:8080 🚀
## Funcionalidades

- Cadastrar um funcionário
- Atualizar um funcionário (passando apenas os campos desejados)
- Listar todos os funcionários
- Remover um funcionário


## Documentação da API

#### 📋 Listar todos os funcionários

```http
  GET /funcionarios
```

#### 🔹 Resposta:
```http
  [
      {
          "id": 2,
          "nome": "João",
          "salario": 8000.00,
          "funcao": "Programador Full Stack",
          "setor": "Programação"
      }
  ]
```

#### ➕ Cadastrar um funcionário

```http
  POST /funcionarios
```

#### 🔹 Body (JSON):

```http
  {
    "nome": "João",
    "salario": 8000.00,
    "funcao": "Programador Full Stack",
    "setor": "Programação"
  }
```

#### 🔹 Resposta:
```http
  {
    "id": 2,
    "nome": "João",
    "salario": 8000.00,
    "funcao": "Programador Full Stack",
    "setor": "Programação"
  }
```

#### ✏ Atualizar um funcionário (passando apenas os campos desejados)

```http
  PUT /funcionarios/{id}
```

#### 🔹 Body (JSON) - Pode enviar apenas os campos que deseja alterar:

```http
  {
    "funcao": "Programador Front-end",
  }
```

#### 🔹 Resposta:
```http
  {
    "id": 2,
    "nome": "João",
    "salario": 8000.00,
    "funcao": "Programador Front-end",
    "setor": "Programação"
  }
```

#### 🔹 Erros:
```http
404 Not Found → Se o funcionário não existir.

400 Bad Request → Se nenhum campo for enviado para alteração.
```

#### ❌ Remover um funcionário

```http
  DELETE /funcionarios/{id}
```

#### 🔹 Resposta:
```http
  {
    "message": "Funcionário deletado com sucesso!"
  }
```

#### 🔹 Erros:
```http
404 Not Found → Se o funcionário não existir.
```
## Melhorias

Adicionar funcionalidade para buscar somente um funcionário.


## Licença

Este projeto é de uso livre. Sinta-se à vontade para contribuir! 

Feito por [Seu Nome](https://github.com/GustavoHKopp) 🚀

