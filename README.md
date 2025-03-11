# Design Pattern - Circuit Breaker (Disjuntor)

> Este repositório contém a implementação de um padrão de projeto nomeado "Backend for frontend", o modelo interceptor do frontend para o backend. Essa implementação é para fins de estudo e prática.

## 💻 Pré-requisitos

Para executar este projeto, certifique-se de ter as seguintes ferramentas configuradas no seu ambiente:

- **Java 21** ou superior;
- **Apache Maven** para gerenciamento de dependências e build do projeto;
- Editor ou IDE de sua escolha (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🚀 Sobre o projeto

Esse pattern ajuda a deixar interfaces responsivas aos usuários. Ele delimita informações aos usuários, com base no dispositivo que estão utilizando. Essa api seria um pattern que ficaria entre o backend e o frontend, agindo como um filtro para os processos.

### ✨ Funcionalidades

- Acata uma requisição
- Verifica o tipo do dispositivo
- Retorna a informação com base no tipo de dispositivo

### 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto;
- **Apache Maven**: Ferramenta de build e gerenciamento de dependências;
- **Apache Kafka**: Serviço de mensageria.

### Fluxo macro do pattern
![spa-oidc-oauth-architecture](https://github.com/user-attachments/assets/7cfaf509-a83d-4244-8642-1470475dab23)

## 🛠️ Configuração e Execução

1. Clone este repositório:
   ```bash
   git clone https://github.com/enzokaua/backend-for-frontend.git
