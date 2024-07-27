## Dependency Inversion Principle (DIP)

**Exercício:**
Você está trabalhando em uma aplicação que usa um banco de dados relacional para armazenar dados. A classe UserRepository depende diretamente de uma classe MySQLDatabase para realizar operações de banco de dados.

**Tarefa:**
Refatore o código para seguir o princípio de inversão de dependência. Crie uma interface Database que UserRepository possa depender, e implemente essa interface em MySQLDatabase e outros possíveis bancos de dados que você possa querer usar no futuro.

**Dica:** Imagine um sistema que usa um banco de dados para armazenar informações de usuários. A classe UserRepository está diretamente dependente de uma implementação específica do banco de dados, como MySQLDatabase. Isso viola o DIP porque a classe de alto nível (UserRepository) depende de uma classe de baixo nível (MySQLDatabase).
