package visibleObjects;

import game.KillerGame;
import physics.KillerPhysics;

public abstract class Alive extends VisibleObject implements Runnable, Destructible {

    // Físicas: son necesarios los mismos atributos en todos los Alive?
    // En VisibleObject --> protected double angle; ... this.angle = Math.toRadians(0);
    protected double a;
    protected double dx;
    protected double dy;
    protected double vx;
    protected double vy;
    protected double maxspeed;

    protected int health;

    public Alive() {
    }

    public Alive(KillerGame game, double x, double y) {
        super(game, x, y);
        this.a = 0.01;
    }

    // TO DO: constructor común para instanciar objetos Alive recibidos de otro pc
    // Valores necesarios para físicas?
//    public Alive(KillerGame game, double x, double y, double angle, double dx, double dy, int health) {
//        super(game, x, y);        
//        this.a = 0.01;
//        this.angle = angle;
//        this.dx = dx;
//        this.dy = dy;
//        this.health = health;
//    }
    // TO DO: descomentar si es el mismo método de físicas para todos los objetos
    protected abstract void move();
//    protected void move() {
//        KillerPhysics.move(this);
//    }

    /**
     * Método para lo que hacen los objetos al chocar con los bordes
     */
    public abstract void collision();

    // ********************************************************
    // *                     Interfaces                       *
    // ********************************************************
    // *********************
    // * Getters & Setters *
    // *********************
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
