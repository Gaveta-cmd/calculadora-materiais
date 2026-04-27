# Calculadora de Materiais para Obra Residencial

Este projeto consiste em um conjunto de serviços backend desenvolvidos para automatizar o dimensionamento de materiais em obras residenciais. O sistema utiliza conceitos de **Teoria dos Grafos** para modelar a planta baixa, onde as paredes são representadas por arestas e os encontros estruturais (pilares) por vértices.

## 🚀 Funcionalidades

* **Modelagem de Planta Baixa:** Representação da estrutura física através de um grafo G=(V,A).
* **Cálculo de Concreto (Viga Baldrame):** Determina o volume necessário para as vigas estruturais com base na largura, altura e comprimento.
* **Cálculo de Tijolos:** Estima a quantidade exata de blocos para a construção das paredes, descontando áreas de aberturas.
* **Gestão de Aberturas:** Suporte para contabilizar janelas e portas (altura e comprimento) integradas às paredes.

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot** (Web, Data JPA)
* **Maven** (Gerenciamento de dependências)
* **H2 Database** (Banco de dados em memória)
* **REST API** (Comunicação via endpoints)

## 🏗️ Arquitetura

O projeto foi estruturado seguindo as melhores práticas de desenvolvimento backend:
* **Entity:** Representação das entidades de negócio (Vértices, Arestas, Cômodos) utilizando ORM/JPA.
* **Service:** Camada de lógica contendo as fórmulas de engenharia e cálculos de volume.
* **Controller:** Endpoints REST para entrada de parâmetros e retorno de resultados.

## 📖 Como Executar

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/Gaveta-cmd/calculadora-materiais.git](https://github.com/Gaveta-cmd/calculadora-materiais.git)
    ```
2.  Importe o projeto em sua IDE (IntelliJ IDEA ou Eclipse).
3.  Execute a aplicação Spring Boot através da classe principal.
4.  Utilize ferramentas como **Postman** ou **Insomnia** para realizar as requisições de teste.

## 📄 Exemplo de Endpoints

* `POST /api/concreto`: Recebe dimensões da viga e retorna o volume em m³.
* `POST /api/tijolos`: Recebe dimensões da parede e do tijolo para retornar a quantidade total.

---
*Projeto desenvolvido para aplicação de conceitos de abstração, encapsulamento e arquitetura de serviços backend.*
