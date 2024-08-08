
public class Triangle extends Shape {
    private int base;
    private int height;

    @Override
    public int getArea() {
        return base * height / 2;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}