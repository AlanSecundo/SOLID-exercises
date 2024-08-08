public class Teste {
    public static void main(String[] args) {
        Rectangle retangulo = new Rectangle();
        retangulo.setWidth(5);
        retangulo.setHeight(10);
        System.out.println("Área do Retângulo: " + retangulo.getArea()); // Esperado: 50

        Square quadrado = new Square();
        quadrado.setSide(5);
        System.out.println("Área do Quadrado: " + quadrado.getArea()); // Esperado 25
    }
}