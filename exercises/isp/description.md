## Interface Segregation Principle (ISP)

**Exercício:**
Em uma aplicação de e-commerce, você tem uma interface ProductService que define métodos para adicionar, remover, atualizar e buscar produtos. No entanto, diferentes partes do sistema usam apenas alguns desses métodos.

**Tarefa:**
Divida a interface ProductService em interfaces menores e mais específicas, de forma que as classes que implementam essas interfaces não sejam obrigadas a implementar métodos que não utilizam.

**Dica:** Imagine que você tem uma interface ProductService para uma aplicação de e-commerce, que inclui métodos para gerenciar produtos. No entanto, diferentes partes do sistema usam apenas alguns desses métodos, o que significa que as classes que implementam essa interface precisam lidar com métodos desnecessários para suas funções específicas.

Agora, considere duas implementações:

AdminProductService: uma implementação que permite a adição, remoção, atualização e obtenção de produtos.

CustomerProductService: uma implementação usada por clientes que apenas visualiza produtos, mas não precisa adicionar, remover ou atualizar produtos.

Essa interface força CustomerProductService a implementar métodos que não são relevantes para clientes, o que é uma violação do ISP.

Para aplicar o ISP, podemos dividir a interface ProductService em interfaces menores e mais específicas, cada uma representando uma função coesa.
