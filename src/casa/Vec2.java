package casa;

public class Vec2 {

    private double x;
    private double y;

    public Vec2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public Vec2 add(Vec2 v) {
        return new Vec2(x + v.x, y + v.y);
    }

    public Vec2 sub(Vec2 v) {
        return new Vec2(x - v.x, y - v.y);
    }

    public void m(double s) {
        x *= s;
        y *= s;
    }

    public double getL() {
        return Math.sqrt(x * x + y * y);
    }
    
    public void norm() {
        double size = getL();
        m(1 / size);
    }
    
}
