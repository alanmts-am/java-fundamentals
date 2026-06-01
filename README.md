# Java Fundamentals

Projeto de aprendizado prático cobrindo os conceitos fundamentais de Java através de exercícios progressivos, construído com Maven.

## Exercícios

| # | Tema | Conceitos |
|---|------|-----------|
| [01](docs/exercise01.md) | Sistema de Gestão de Estoque | Tipos primitivos, variáveis, lógica booleana |
| [02](docs/exercise02.md) | Sistema de Vendas | `ArrayList`, for-each, manipulação de listas |
| [03](docs/exercise03.md) | Sistema Bancário | Encapsulamento, getters/setters, controle de acesso |
| [04](docs/exercise04.md) | Sistema de Produtos | Construtores, sobrecarga, getters imutáveis |
| [05](docs/exercise05.md) | Interfaces e Polimorfismo | `interface`, `extends`, `@Override`, dispatch em runtime |

## Estrutura do Projeto

```
src/
└── main/java/com/alanmtsam/
    ├── exercises/
    │   ├── Exercise01.java
    │   ├── Exercise02.java
    │   ├── exercise03/
    │   │   ├── BankAccount.java
    │   │   └── Main.java
    │   ├── exercise04/
    │   │   ├── Product.java
    │   │   └── Main.java
    │   └── exercise05/
    │       ├── ITaxable.java
    │       ├── Product.java
    │       ├── ProductImported.java
    │       └── Main.java
docs/
└── exercise01.md ... exercise05.md   # Descrições dos exercícios e perguntas de verificação
```

## Requisitos

- Java 8+
- Maven 3.x

## Como executar

```bash
# Compilar
mvn compile

# Executar um exercício específico (ex: exercício 05)
mvn exec:java -Dexec.mainClass="com.alanmtsam.exercises.exercise05.Main"

# Rodar os testes
mvn test
```
