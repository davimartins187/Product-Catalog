# 🚀 Product Catalog API - Spring Boot

API RESTful desenvolvida em **Java** com **Spring Boot** para o gerenciamento de um catálogo de produtos. Este projeto foi construído com foco em boas práticas de arquitetura de software, separação de responsabilidades e padrões de mercado para aplicações backend.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

* **Java 17+**
* **Spring Boot**
  * Spring Web (Controladores REST e Tomcat embutido)
* **Lombok** (Redução de código boilerplate com `@Getter`, `@Setter`, `@Builder`, `@RequiredArgsConstructor`)
* **UUID** (Identificadores únicos globais)
* **Maven** (Gerenciamento de dependências)

---

## ⚙️ Arquitetura do Projeto

O projeto segue estritamente a separação de responsabilidades em camadas:

```text
src/main/java/souza/projetect/productCatalog/
│
├── Controller/     # Camada de entrada (Endpoints REST, tratamento de rotas e status HTTP)
├── Service/        # Camada de regra de negócio (Lógica da aplicação e manipulação de dados)
├── domain/         # Entidades de Domínio (Modelo de negócio)
└── dto/            # Data Transfer Objects (Isolamento de dados de entrada)
