package Visitor;
import Figuras.*;
import Interfaces.VisitorIF;

public class visitorCalculaArea implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo r) {
        return r.getLados1() * r.getLados2();
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        double s = (t.getLado1() + t.getLado2() + t.getLado3()) / 2;

        return Math.sqrt(s * (s - t.getLado1()) * (s - t.getLado2()) * (s - t.getLado3()));
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return Math.PI * c.getRaio() * c.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        double s = (t.getBaseMaior() + t.getBaseMenor() + t.getLados() + t.getLados()) / 2;

        return Math.sqrt((s - t.getBaseMaior()) * (s - t.getBaseMenor()) * (s - t.getLados()) * (s - t.getLados()));
    }
}
