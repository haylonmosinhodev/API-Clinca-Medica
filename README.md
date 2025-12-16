# Sobre o projeto (EM PRODUÇÂO)

 Trata-se da criação de uma API REST, a aplicação consiste em criar projeto de web services com Spring Boot, JPA e MySQL para gerenciar as ativadades de um clinica medica.
 Conteudo aprendido durantes aulas da formação beck-end da Alura.
 Neste respositorio algumas modificações serão realizadas.
 
## Objetivos

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados no MySQL
- Povoar o banco de dados
- Tratamento de exceções

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- MySQL
- Insomnia
- Migrations com Flyway
- Validação com Bean Vaidation


## Implantação em produção
- Banco de dados: MySQL

## Back end
Pré-requisitos: Java 17

# Como executar o projeto
- Estou Utilizando nesse projeto a IDE IntelliJ, execute aplicação normalmente.


- Estou utilizando o Insomnia para fazer requisições ao sistema.
- Cadastro de médico.
```json
{
"nome": "Rodrigo Ferreira",
"email": "rodrigo.ferreira@voll.med",
"crm": "123456",
"especialidade": "ORTOPEDIA",
"endereco": {
    "logradouro": "rua 1",
    "bairro": "bairro",
    "cep": "12345678",
    "cidade": "Brasilia",
    "uf": "DF",
    "numero": "1",
    "complemento": "complemento"
    }
}
```
  
# Autor

Haylon Mosinho

https://www.linkedin.com/in/haylonmosinho/
