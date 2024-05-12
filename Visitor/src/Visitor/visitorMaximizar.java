package Visitor;
import Figuras.*;
import Interfaces.VisitorIF;

public class visitorMaximizar implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo r) {
        r.setLados1(r.getLados1() * 2);
        r.setLados2(r.getLados2() * 2);
        System.out.println("Retangulo maximizado! nova base: " + r.getLados1() + " nova altura: " + r.getLados2());
        return -1;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        t.setLado1(t.getLado1() * 2);
        t.setLado2(t.getLado2() * 2);
        t.setLado3(t.getLado3() * 2);
        System.out.println("Triângulo maximizado! lado1: " + t.getLado1() + " lado2: " + t.getLado2()
                + " lado3: " + t.getLado3());
        return -1;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        c.setRaio(c.getRaio() * 2);
        System.out.println("Círculo maximizado! Novo raio: " + c.getRaio());
        return -1;
    }

    @Override
    public double visitaTrapezio(Trapezio t) {
        t.setBaseMenor(t.getBaseMenor() * 2);
        t.setBaseMaior(t.getBaseMaior() * 2);
        t.setLados(t.getLados() * 2);
        System.out.println("Trapezio maximizado! nova base menor: " + t.getBaseMenor() + " nova base maior: " +
                t.getBaseMaior() + " novo valor para ambas as laterais: " + t.getLados());
        return 0;
    }
}
