class Circle implements Shape {

    public static final double PI = 3.1416;

    protected double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double radio() {
        return radio;
    }

    public double getDiametro() {
        return radio * 2;
    }

    public double getArea() {
        return PI * radio * radio;
    }

    public double getPerimeter () {
        return PI * getDiametro();
    }
}
