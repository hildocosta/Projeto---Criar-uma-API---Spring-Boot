# 💡 Projeto API com Spring Boot  

🚀 Uma API REST simples para o gerenciamento de tarefas, desenvolvida para aplicar os conceitos básicos de desenvolvimento de APIs REST utilizando o framework **Spring Boot**. Este projeto é ideal para aprender a criar APIs organizadas e escaláveis, explorando boas práticas e a utilização de ferramentas modernas.  

---

## 📋 Atividades  

### 1. Criar um novo projeto no **Spring Initializr**:  
**Configurações:**  
- **Linguagem:** Java  
- **Ferramenta de Build:** Maven  
- **Versão do Spring Boot:** 3.4.1 (mais atualizada)  
- **Grupo (Group):** com.hildo.costa  
- **Artefato (Artifact):** api  
- **Nome do Projeto (Name):** api  
- **Descrição (Description):** Project API Simple  
- **Tipo de Empacotamento (Packaging):** JAR  
- **Versão do Java:** 17  
- **Dependências:**  
  - Adicione apenas a dependência **Spring Web**  

Após configurar, clique em **Generate** para baixar o projeto.

---

### 2. Importar o projeto no IntelliJ IDEA:  
- Após baixar o projeto, abra o IntelliJ IDEA e importe o projeto como um projeto Maven.  

---

### 3. Estrutura do Projeto:  
Após importar o projeto, organize as pastas e os pacotes da seguinte forma:  

```
src/main/java  
└── com  
    └── hildo  
        └── costa  
            └── api  
                ├── controller  
                │   └── ApiController.java  
```  

- **Pacote Principal:** `com.hildo.costa.api`.  
- Dentro do pacote principal, crie um subpacote chamado `controller`.  
- Dentro do subpacote `controller`, crie a classe `ApiController`.  

---

4. **Implementar uma Controller Simples:**  
   - Utilize a classe `ApiController` para criar endpoints básicos da API.  

5. **Adicionar a funcionalidade de leitura de tarefas:**  
   - Implemente um endpoint GET que retorna uma lista de tarefas.  

6. **Implementar a funcionalidade de cadastro de tarefas:**  
   - Adicione um endpoint POST para cadastrar novas tarefas enviadas no corpo da requisição (JSON).  

7. **Criar a funcionalidade de limpar todas as tarefas:**  
   - Implemente um endpoint DELETE para excluir todas as tarefas existentes no sistema.
   - 

### 4. 🚀 Tecnologias Utilizadas  

- **Java 17**  
- **Spring Boot 3.4.1**  
- **Spring Web**  
- **Maven**  

---

## 🎯 Objetivo  

O objetivo principal deste projeto é demonstrar a criação de uma API REST simples com funcionalidades básicas, como:  
- Organização de código em pacotes.  
- Implementação de endpoints GET, POST e DELETE.  
- Utilização de conceitos como serialização de objetos em JSON.  
- Desenvolvimento utilizando o framework **Spring Boot** com dependência mínima, garantindo simplicidade e clareza no aprendizado.  

Além disso, este projeto é uma base sólida para expandir e implementar funcionalidades mais avançadas no futuro.  

---

## 📚 Funcionalidades  

- **Listar Tarefas:** Endpoint GET para retornar todas as tarefas cadastradas no sistema.  
- **Adicionar Tarefas:** Endpoint POST para criar novas tarefas a partir de uma requisição JSON.  
- **Excluir Todas as Tarefas:** Endpoint DELETE para limpar a lista de tarefas cadastradas.  


