# Connect Data

**Connect Data** é um sistema de gerenciamento de funcionários desenvolvido em Java, projetado para ajudar gestores a coordenar suas equipes de forma eficaz. Com funcionalidades que permitem o cadastro de funcionários, departamentos e visualização de relatórios, este sistema é ideal para empresas de todos os tamanhos.

## Instalação

Para que a aplicação funcione corretamente, é fundamental instalar os seguintes componentes no seu sistema operacional:

1. **JDK (Java Development Kit)**: [Download do JDK](https://www.oracle.com/br/java/technologies/downloads/)
2. **JRE (Java Runtime Environment)**: [Download do JRE](https://www.java.com/pt-BR/download/manual.jsp)

Além disso, você deve ter o **JVM (Java Virtual Machine)**, que geralmente já está instalado junto com o JDK.

## Configuração do Banco de Dados

### Dump do Banco de Dados

O dump do banco de dados necessário para a aplicação está disponível na pasta `/db` do projeto. Para configurar o banco de dados, siga os passos abaixo:

1. **Importe o Dump do Banco de Dados:**
   - Abra o MySQL Workbench ou seu cliente MySQL preferido.
   - Conecte-se ao servidor MySQL.
   - Crie um novo banco de dados, por exemplo, `connect_data`.
   - Importe os arquivos localizados na pasta `db`.

### Configurações Adicionais

Certifique-se de que as configurações de conexão no seu código (se houver) estejam apontando para o banco de dados correto.

## Funcionalidades Desenvolvidas

- **Login**: Para realizar o login no sistema, utilize o usuário padrão `admin` e a senha `123`.

- **Home**: Na tela principal, você pode selecionar entre:
  - Funcionários
  - Departamentos
  - Admin
  - Sair do sistema
  - Visualizar o número total de funcionários, novos funcionários em onboarding, metas a serem cumpridas e notificações do RH.

- **Funcionários**: Na tela de cadastro de funcionários, você pode:
  - Cadastrar e pesquisar funcionários por nome ou CPF.
  - Imprimir relatórios de funcionários.
  - Inserir dados pessoais e profissionais dos funcionários.

- **Departamentos**: Na tela de departamentos, você pode:
  - Visualizar departamentos cadastrados, incluindo ID, nome, meta e descrição.
  - Gerar relatórios com os dados dos funcionários de um departamento específico.

## Contribuições

Contribuições são bem-vindas! Se você tiver sugestões ou melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.
