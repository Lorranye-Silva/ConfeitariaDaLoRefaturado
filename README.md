# ConfeitariaDaLoRefaturado
Projeto refaturado com SOLID e JDBC para futura versão web

1. Introdução 

Este relatório apresenta a refatoração do sistema desktop da Confeitaria Da Lo, com foco na separação de responsabilidades e aplicação dos princípios SOLID, preparando o projeto para futura implementação web. 

2. Princípios SOLID aplicados 

SRP (Responsabilidade Única): Separação entre dados (model), regras de negócio (service) e acesso ao banco (repository). Cada classe tem uma função clara e única. 

OCP (Aberto/Fechado): As classes estão preparadas para extensão sem modificação, como ClienteService podendo validar diferentes formatos de CPF. 

DIP (Inversão de Dependência): O uso de repositórios desacopla a lógica de negócio da persistência, permitindo testes e substituições futuras. 

3. Refatorações realizadas 

Separação da lógica da interface Swing. 

Criação de pacotes organizados (model, service, repository, util). 

Renomeação de métodos para clareza. 

Eliminação de duplicações e métodos longos. 

Correção de nomes de atributos e construtores para compatibilidade com testes. 

4. Padrões de projeto utilizados 

DAO (Data Access Object): Usado nas classes Repository para encapsular acesso ao banco. 

MVC (Model-View-Controller): Estrutura pensada para futura implementação web. 

5. Evidências do GitHub 

Repositório:Lorranye-Silva/ConfeitariaDaLoRefaturado: Projeto refaturado com SOLID e JDBC para futura versão web 

Commits: separação de pacotes, refatoração de classes, testes no main() 

Dependência do MySQL adicionada ao pom.xml com sucesso 

6. Testes realizados 

Testes simples no Main.java para validar CPF, produto e login. 

Conexão com banco de dados MySQL funcionando. 

Saída no console confirmando sucesso: 

Cliente salvo com sucesso! 

Produto salvo com sucesso! 

Funcionário salvo com sucesso! 

 
