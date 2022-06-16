package casa;


import java.awt.Color;
import java.awt.Graphics;


public class OJOS {

    private Vec2 posicion;
    private double r1;
    private double r2;
    
    public OJOS(double x, double y, double r1, double r2) {
        posicion = new Vec2(x, y);
        this.r1 = r1;
        this.r2 = r2;
    }

    public void draw(Graphics g, Vec2 mousePosition) {
        Vec2 irisPos = mousePosition.sub(posicion);
        double irisDistanceFromCenter = Math.min(r1 - r2, irisPos.getL());
        irisPos.norm();
        irisPos.m(irisDistanceFromCenter);
        irisPos = irisPos.add(posicion);
        
        g.setColor(Color.BLACK);
        g.fillOval((int) (posicion.getX() - r1 - 8), (int) (posicion.getY() - r1 - 8), (int) (2 * r1 + 16), (int) (2 * r1 + 16));
        
        g.setColor(Color.WHITE);
        g.fillOval((int) (posicion.getX() - r1), (int) (posicion.getY() - r1), (int) (2 * r1), (int) (2 * r1));

        g.setColor(Color.BLACK);
        g.fillOval((int) (irisPos.getX() - r2), (int) (irisPos.getY() - r2), (int) (2 * r2), (int) (2 * r2));
    }
    
}
