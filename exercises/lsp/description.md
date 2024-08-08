## Liskov Substitution Principle (LSP)

**Exercício:**
Imagine que você tem uma classe Rectangle com métodos para definir a largura e a altura. Você decide criar uma subclasse Square que deve sempre ter os mesmos valores de largura e altura.

**Tarefa:**
Analise se a classe Square pode substituir a classe Rectangle sem causar problemas de comportamento inesperado. Se não puder, ajuste a hierarquia de classes ou a implementação para que o princípio de substituição de Liskov seja respeitado.

**Dica:** Note que neste exercício temos uma classe base Rectangle e uma classe derivada Square. O quadrado é uma subclasse do retângulo, mas a implementação de Square viola o LSP porque altera o comportamento esperado ao definir a largura e a altura.

Se um método espera trabalhar com instâncias de Rectangle, como no exemplo abaixo, a substituição por Square pode causar comportamento inesperado, por exemplo:

```
public void resizeRectangle(Rectangle rect) {
    rect.setWidth(10);
    rect.setHeight(5);
    assert rect.getArea() == 50; // Supondo que isso seja um comportamento esperado
}

public void calculateAreaRectangle(Shape rect) {
    assert rect.getArea() == 50;
}
```

Square = new Square();
square.setSide(20);

calculateArea(square)

Square = new Rectangle();
square.setWidth(20);
square.setHeight(10);

calculateArea(square)

Com um Square, setWidth ou setHeight alteram ambos os valores, causando uma área diferente de 50, o que viola a expectativa de uso do método resizeRectangle.
