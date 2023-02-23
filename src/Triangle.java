class Triangle implements Shape {
    private double base;
    private double lado;

    public Triangle(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }


    public double getPerimeter () {
        double perimetro = 2 * lado + base;
        return perimetro;
    }

    public double getArea() {
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }
}


