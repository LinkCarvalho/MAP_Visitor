package Visitor;

import static org.junit.Assert.*;

import excecoes.TrianguloNaoExisteException;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Test;
import Figuras.*;
import Visitor.*;

public class visitorDesenhaTest {

    @Test
    public void testVisitaRetangulo() throws ValorMenorOuIgualAZeroException {
        Retangulo retangulo = new Retangulo(5, 3);
        visitorDesenha visitor = new visitorDesenha();
        double resultado = visitor.visitaRetangulo(retangulo);
        assertEquals(-1, resultado, 0.01); // Verifica se o resultado é -1
    }

    @Test
    public void testVisitaTriangulo() throws ValorMenorOuIgualAZeroException, TrianguloNaoExisteException {
        Triangulo triangulo = new Triangulo(4, 3, 6);
        visitorDesenha visitor = new visitorDesenha();
        double resultado = visitor.visitaTriangulo(triangulo);
        assertEquals(-1, resultado, 0.01); // Verifica se o resultado é -1
    }

    @Test
    public void testVisitaCirculo() throws ValorMenorOuIgualAZeroException {
        Circulo circulo = new Circulo(5);
        visitorDesenha visitor = new visitorDesenha();
        double resultado = visitor.visitaCirculo(circulo);
        assertEquals(-1, resultado, 0.01); // Verifica se o resultado é -1
    }

    @Test
    public void testVisitaTrapezio() throws ValorMenorOuIgualAZeroException {
        Trapezio trapezio = new Trapezio(3, 5, 4);
        visitorDesenha visitor = new visitorDesenha();
        double resultado = visitor.visitaTrapezio(trapezio);
        assertEquals(-1, resultado, 0.01); // Verifica se o resultado é -1
    }


}
