package Visitor;

import static org.junit.Assert.*;

import excecoes.TrianguloNaoExisteException;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Test;
import Figuras.*;
import Visitor.*;

public class visitorMaximizarTest {

    @Test
    public void testVisitaRetangulo() throws ValorMenorOuIgualAZeroException {
        Retangulo retangulo = new Retangulo(5, 3);
        visitorMaximizar visitor = new visitorMaximizar();
        visitor.visitaRetangulo(retangulo);
        assertEquals(10, retangulo.getLados1(), 0.01); // Verifica se a base foi dobrada para 10
        assertEquals(6, retangulo.getLados2(), 0.01); // Verifica se a altura foi dobrada para 6
    }

    @Test
    public void testVisitaTriangulo() throws ValorMenorOuIgualAZeroException, TrianguloNaoExisteException {
        Triangulo triangulo = new Triangulo(4, 3, 5);
        visitorMaximizar visitor = new visitorMaximizar();
        visitor.visitaTriangulo(triangulo);
        assertEquals(8, triangulo.getLado1(), 0.01); // Verifica se o lado 1 foi dobrado para 8
        assertEquals(6, triangulo.getLado2(), 0.01); // Verifica se o lado 2 foi dobrado para 6
        assertEquals(10, triangulo.getLado3(), 0.01); // Verifica se o lado 3 foi dobrado para 10
    }

    @Test
    public void testVisitaCirculo() throws ValorMenorOuIgualAZeroException {
        Circulo circulo = new Circulo(5);
        visitorMaximizar visitor = new visitorMaximizar();
        visitor.visitaCirculo(circulo);
        assertEquals(10, circulo.getRaio(), 0.01); // Verifica se o raio foi dobrado para 10
    }

    @Test
    public void testVisitaTrapezio() throws ValorMenorOuIgualAZeroException {
        Trapezio trapezio = new Trapezio(3, 5, 2);
        visitorMaximizar visitor = new visitorMaximizar();
        visitor.visitaTrapezio(trapezio);
        assertEquals(10, trapezio.getBaseMaior(), 0.01); // Verifica se a base maior foi dobrada para 10
        assertEquals(6, trapezio.getBaseMenor(), 0.01); // Verifica se a base menor foi dobrada para 6
        assertEquals(4, trapezio.getLados(), 0.01); // Verifica se o valor das laterais foi dobrado para 4
    }



}
