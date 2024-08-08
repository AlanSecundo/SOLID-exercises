## Single Responsibility Principle (SRP)

**Exercício:**
Imagine que você está desenvolvendo um sistema de gerenciamento de pedidos para um restaurante. Atualmente, a classe OrderProcessor é responsável por várias tarefas, tais como:

- Validar os itens do pedido;
- Calcular o total do pedido;
- Processar o pagamento;
- Enviar um recibo para o cliente;

**Tarefa:**
Refatore a classe OrderProcessor para que cada classe tenha uma única responsabilidade. Separe as funcionalidades em classes distintas, como OrderValidator, PaymentProcessor, ReceiptSender, etc.

**Dica:** Tenha em mente que a implementação interna dos métodos, neste momento não é tão relevante, mas sim a forma como as entidades serão organizadas e irão se relacionar.
