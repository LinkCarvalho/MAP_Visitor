package Visitor;

import static org.junit.Assert.*;

import excecoes.TrianguloNaoExisteException;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Test;
import Figuras.*;
import Visitor.*;

public class visitorCalculaPerimetroTest {

    @Test
    public void testVisitaRetangulo() throws ValorMenorOuIgualAZeroException {
        Retangulo retangulo = new Retangulo(5, 3);
        visitorCalculaPerimetro visitor = new visitorCalculaPerimetro();
        double resultado = visitor.visitaRetangulo(retangulo);
        assertEquals(16, resultado, 0.01); // Verifica se o resultado é 16 (2*(5+3))
    }

    @Test
    public void testVisitaTriangulo() throws ValorMenorOuIgualAZeroException, TrianguloNaoExisteException {
        Triangulo triangulo = new Triangulo(4, 3, 5);
        visitorCalculaPerimetro visitor = new visitorCalculaPerimetro();
        double resultado = visitor.visitaTriangulo(triangulo);
        assertEquals(12, resultado, 0.01); // Verifica se o resultado é 12 (4+3+5)
    }

    @Test
    public void testVisitaCirculo() throws ValorMenorOuIgualAZeroException {
        Circulo circulo = new Circulo(5);
        visitorCalculaPerimetro visitor = new visitorCalculaPerimetro();
        double resultado = visitor.visitaCirculo(circulo);
        assertEquals(31.42, resultado, 0.01); // Verifica se o resultado é 31.42 (2*PI*5)
    }

    @Test
    public void testVisitaTrapezio() throws ValorMenorOuIgualAZeroException {
        Trapezio trapezio = new Trapezio(3, 5, 4);
        visitorCalculaPerimetro visitor = new visitorCalculaPerimetro();
        double resultado = visitor.visitaTrapezio(trapezio);
        assertEquals(16, resultado, 0.01); // Verifica se o resultado é 18 (5+3+4+4+2)
    }


}