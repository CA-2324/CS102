// for q1a
public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle(){
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return (int)area;
    }
}

// for q1b
public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }
}

// for q1c
public class Circle {
    private int x;
    private int y;
    private double radius;
    private double maxRadius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
        if (this.radius > maxRadius) {
            maxRadius = this.radius;
        }
    }

    public int getMaxRadius() {
        return maxRadius;
    }
}