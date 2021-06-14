# GOKU E-Commerce:
Desenvolvimento de uma api rest para cadastro de endereços.

## Suposições: 
- Sistema de cadastro de endereços(Logradouro, cep, cidade, estado, bairro), onde o administrador loga e pode cadastrar novos endereços
- Cadastro de administradores (nome, login, senha) - para gerenciar endereços 
- Endereços não tem ligação nenhuma com usuario. 
- Um endereço por CEP

## Requisitos técnicos: 
- JAVA 11
- MAVEN
- H2 (Banco de dados em memória)

## Arquitetura:
API REST, desenvolvido encima do Framework Spring boot. O sistema está dividido nas seguintes camadas: 
- model: camada com os modelos do banco de dados
- repository: camada de acesso ao banco de dados 
- service: camada onde se aplica as regras de negócios
- controller: endpoints
- dto: apenas modelos de transferencia de dados 

## Como rodar
1. Baixar o código do github
2. Entrar na pasta do projeto 
3. rodar o comando : `mvn spring-boot:run`
4. Sistema rodando em: `http://localhost:8080`

## API

### Endereço

- POST - http://localhost:8080/endereco - Criar (id = null)/editar endereço

		{
	    		"id": 1,
	    		"cep": "11713060",
	    		"logradouro": "rua 12",
        	"bairro": "samamba",
        	"cidade": "PG City",
			    "estado": "SP"
		}

- DELETE - http://localhost:8080/endereco?cep={CEP} - Deletar um endereço 

- GET - http://localhost:8080/endereco?cep={CEP} - Buscar endereço por cep

### Usuário

- POST - - http://localhost:8080/usuario - Criar (id = null)/editar usuário

		{
			"id": 1,
			"nome": "maria",
			"login": "maria.jose",
			"senha": "123456"
		}

- DELETE -  http://localhost:8080/usuario?id={id} - Deletar usuário

- POST  http://localhost:8080/usuario/login - Fazer login

		{
			"login": "maria.jose",
			"senha": "123456"
		}
