class Square extends Shape {
    private int side;

    @Override
    public int getArea() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}