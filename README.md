# 📋 Project To-Do List API

Este é um projeto de uma API RESTful para gerenciamento de tarefas (To-Do List), desenvolvida com **Java** e **Spring Boot**. 
O objetivo é praticar conceitos de back-end, como estrutura de projetos, camadas (Controller, Service, Repository), uso de banco de dados relacional.

## ✨ Funcionalidades

- ✅ Criar novas tarefas (Todos)
- 📖 Listar todas as tarefas
- 🔍 Buscar tarefa por ID
- ✏️ Atualizar tarefa existente
- 🗑️ Deletar tarefa
- 🏷️ Filtros por prioridade e status (em andamento, concluída, etc.)
- 📅 Atributos de data e hora para criação e atualização

## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (para testes)
- **MySQL** (para produção)
- **Lombok**
- **Postman/HTTPie** (para testar os endpoints)

## 🚀 Como Rodar o Projeto

### Pré-requisitos

- Java 17+
- Maven
- MySQL (opcional, se preferir não usar H2)
- IDE (VS Code, IntelliJ ou Eclipse)

### Passos

1. **Clone o repositório:**

```
  git clone https://github.com/ClaraSantosVasconcelos/Project-TodoList.git
  cd Project-TodoList
```
2. Configure o banco de dados (caso queira usar MySQL):
   Altere o arquivo application.properties:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/todolist
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Execute o projeto:
   Usando Maven:
   ```
   ./mvnw spring-boot:run
   ```
   Ou pela sua IDE favorita.
4. Testando os endpoints:
   
   Você pode testar usando ferramentas como Postman ou HTTPie.
   Exemplo de requisição para criar uma nova tarefa:
  ```
   http POST :8080/todos name="Estudar Java" description="Praticar Spring Boot" priority=1
  ```

👩‍💻 Sobre a Desenvolvedora
Feito com dedicação por Clara Santos Vasconcelos 👩‍💻
🎓 Estudante de Licenciatura em Computação
🚀 Buscando uma oportunidade como Desenvolvedora Back-End Júnior

📫 Contato
LinkedIn: www.linkedin.com/in/clara-santos-6b97432b7

Email: mclarasv17@gmail.com

GitHub: @ClaraSantosVasconcelos
