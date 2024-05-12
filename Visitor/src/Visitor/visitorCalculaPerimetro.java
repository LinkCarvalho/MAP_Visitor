package Visitor;
import Figuras.*;
import Interfaces.VisitorIF;


public class visitorCalculaPerimetro implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo r) {
        return 2 * (r.getLados1() + r.getLados2());
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return t.getLado1() + t.getLado2() + t.getLado3();
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return 2 * Math.PI * c.getRaio();
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        return t.getBaseMaior() + t.getBaseMenor() + t.getLados() + t.getLados();
    }
}
