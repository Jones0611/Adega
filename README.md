
# 📖 Projeto: Adega

Este é um projeto Java para o gerenciamento de bebidas em uma adega. Projeto realizado para uma atividade avaliativa da faculdade. Ele permite realizar o cadastro e a consulta de produtos (bebidas) com informações como nome, tipo, preço e atributos adicionais. O projeto se conecta a um banco de dados via JDBC.

## 📂 Estrutura do Projeto

```
src/
└── adega/
    ├── Adega.java               // Classe principal que inicia a aplicação
    ├── Bebidas.java             // Classe modelo que representa os dados de uma bebida
    ├── Cadastrar.java           // Tela de cadastro de novas bebidas
    ├── ConfultaOfferta.java     // Tela de consulta das bebidas cadastradas
    ├── Tela.java                // Tela principal com menu de navegação
    ├── Banco.java               // Tela com as funções
    └── Conexao.java             // Classe de conexão com o banco de dados
```

## 📌 Funcionalidades

- 📋 **Cadastrar Bebidas**: Tela para inserir novas bebidas no banco de dados, incluindo nome, tipo, preço e atributos.
- 🔍 **Consultar Bebidas**: Tela para visualizar os registros de bebidas cadastradas.
- 🖥️ **Interface Gráfica**: Desenvolvida com Java Swing.
- 💾 **Persistência de Dados**: Realizada via JDBC (classe `Conexao` — não incluída aqui).

## 🚀 Como Executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Abra no **NetBeans** ou outro IDE Java compatível com Swing.
3. Certifique-se de ter um banco de dados configurado e ajuste as informações de conexão na classe `Conexao.java`.
4. Execute a classe `Adega.java`.

## 🛠️ Tecnologias Utilizadas

- **Java SE**
- **Swing**
- **JDBC**
- **NetBeans IDE**

## 📌 Próximos Passos / Melhorias

- Validar campos de cadastro.
- Adicionar opção de excluir/editar bebidas.
- Melhorar a exibição de dados na consulta.
- Personalizar o layout das telas.
- Adicionar tratamento de exceções mais refinado.

## 👤 Autor

João Vitor Rodrigues  
📧 joaovr724@gmail.com  

