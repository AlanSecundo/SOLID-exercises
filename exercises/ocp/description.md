## Open/Closed Principle (OCP)

**Exercício:**
Você tem uma aplicação que processa pagamentos de diferentes métodos: cartão de crédito, PayPal e criptomoedas. Atualmente, a classe PaymentService possui uma lógica para cada tipo de pagamento dentro de um método.

**Tarefa:**
Refatore a classe PaymentService para que novos métodos de pagamento possam ser adicionados sem modificar o código existente. Use o padrão Strategy ou outro padrão que julgar adequado para implementar essa solução.

**Dica:** Note que, na implementação original, o método processPayment na classe PaymentService trata diretamente os diferentes métodos de pagamento, como cartão de crédito e PayPal, dentro de uma estrutura condicional. Isso viola o princípio OCP porque para adicionar um novo método de pagamento, precisamos modificar o código existente.
