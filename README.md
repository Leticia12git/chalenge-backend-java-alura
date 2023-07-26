##  Jornada Milhas API 🌍✈️


Bem-vindo(a) à API Jornada Milhas! Esta é uma API que permite o gerenciamento de depoimentos e destinos de viagem. Com ela, você pode criar, ler, atualizar e deletar depoimentos e destinos de forma simples e eficiente.

## Recursos da API 📚
A API Jornada Milhas possui os seguintes recursos principais:

Depoimentos: Permite adicionar, visualizar, atualizar e remover depoimentos de viajantes que compartilham suas experiências conosco.

Destinos: Possibilita cadastrar, listar, editar e excluir destinos de viagem emocionantes.

## Tecnologias Utilizadas
- Java JDK 17
- MySQL
- Spring Boot 3.1.1
- Maven
- Swagger
- Lombok
- Hibernate
- JUnit


## Documentação 📝
Para detalhes sobre os endpoints disponíveis, seus parâmetros e respostas, acesse a Documentação da API.

## Como Usar 🚀
Clone este repositório em sua máquina local usando o seguinte comando:

Copy code
git clone https://github.com/seu-usuario/jornada-milhas.git
Instale as dependências necessárias executando o seguinte comando:

Copy code
npm install
Inicie o servidor local da API com o comando:

sql
Copy code
npm start
Acesse a API através da URL:


Copy code
http://localhost:8080

## Exemplos de Uso 
Aqui estão endpoints de exemplos de como interagir com a API :

http://localhost:3000/depoimentos
Criar um novo depoimento:
"autor": "João",
"mensagem": "Viagem incrível!"}' 



http://localhost:3000/destinos
Atualizar um depoimento existente:
{"mensagem": "Melhor viagem da minha vida!"}' 
http://localhost:3000/depoimentos/1


Deletar um destino:
curl -X DELETE http://localhost:3000/destinos/2

️
Em caso de dúvidas ou sugestões, entre em contato conosco pelo email: contato@jornadamilhas.com

Licença 📜
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

Agradecemos por escolher a API Jornada Milhas! Tenha uma ótima viagem! 🌟✨



## Endereço para consulta swagger
http://localhost:8080/swagger-ui/index.html