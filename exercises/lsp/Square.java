class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Para um quadrado, largura e altura são iguais
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // Para um quadrado, altura e largura são iguais
    }
}