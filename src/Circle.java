public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("radius must be >0");
    }

    public String toString()
    {
        return String.format("Circle with radius %.0f",radius);
    }
}
