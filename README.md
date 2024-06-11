# Projeto de Serviços
# Descrição do projeto
Esse projeto é uma API de serviços que é possível cadastrar usuários que possuem pedidos de produtos com pagamentos.

# Tecnologias utilizadas 
* Java 17
* Spring Web
* Spring JPA
* Banco de dados H2
* Postman para realizar requisições http

# Funcionalidades da aplicação

Para o serviço de usuários é possível:

* Listar todos os usuários.
* Buscar usuário por id.
* Inserir um novo usuário.
* Deletar um usuário por id.
* Atualizar informações de um usuário

Para os serviços de produtos,pedidos categorias de produtos é possível : 

* Listar todos.
* Buscar por id.

# Padrão de projeto
* Foi utilizado o padrão de projeto  MVC(model-view-controller) implementado dentro do framework Spring Web.
* A utilização do padrão MVC traz como benefício o isolamento das regras de negócios da lógica de apresentação, que é a interface com o usuário. Isto possibilita a existência de várias interfaces com o usuário que podem ser modificadas sem a necessidade de alterar as regras de negócios, proporcionando muito mais flexibilidade e oportunidades de reuso das classe.
* Nesse projeto estão separados por Resources(camada de configuração),Repositories(que implementam o Spring Jpa que contém as operações do banco de dados), Services(que realizam a regras de negócio) e Controllers (que realizam o controle da aplicação com as anotações e verbos http).

# Contribuições 

* Faça um fork do projeto.
* Crie uma branch para a sua feature (git checkout -b feature/MinhaFeature).
* Faça commit das suas mudanças (git commit -am 'Adicionando uma nova feature').
* Faça push para a branch (git push origin feature/MinhaFeature).
* Crie um novo Pull Request.

# Autores 

* Rodrigo Lucas -> Estudante de Desenvolvimento - rodrigo.coelho@maisunifacisa.com.br
