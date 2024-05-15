package Visitor;

import static org.junit.Assert.*;

import excecoes.TrianguloNaoExisteException;
import excecoes.ValorMenorOuIgualAZeroException;
import org.junit.Test;
import Figuras.*;

public class visitorCalculaAreaTest {

    @Test
    public void testVisitaRetangulo() throws ValorMenorOuIgualAZeroException {
        Retangulo retangulo = new Retangulo(5, 3);
        visitorCalculaArea visitor = new visitorCalculaArea();
        double resultado = visitor.visitaRetangulo(retangulo);
        assertEquals(15, resultado, 0.01); // Verifica se a área é 15 (5*3)
    }

    @Test
    public void testVisitaTriangulo() throws ValorMenorOuIgualAZeroException, TrianguloNaoExisteException {
        Triangulo triangulo = new Triangulo(4, 3, 5);
        visitorCalculaArea visitor = new visitorCalculaArea();
        double resultado = visitor.visitaTriangulo(triangulo);
        assertEquals(6, resultado, 0.01); // Verifica se a área é 6
    }

    @Test
    public void testVisitaCirculo() throws ValorMenorOuIgualAZeroException {
        Circulo circulo = new Circulo(5);
        visitorCalculaArea visitor = new visitorCalculaArea();
        double resultado = visitor.visitaCirculo(circulo);
        assertEquals(78.54, resultado, 0.01); // Verifica se a área é aproximadamente 78.54 (PI*5*5)
    }

    @Test
    public void testVisitaTrapezio() throws ValorMenorOuIgualAZeroException {
        Trapezio trapezio = new Trapezio(5, 3, 2);
        visitorCalculaArea visitor = new visitorCalculaArea();
        double resultado = visitor.visitaTrapezio(trapezio);
        double s = (trapezio.getBaseMaior() + trapezio.getBaseMenor() + trapezio.getLados() + trapezio.getLados()) / 2;
        double expected = Math.sqrt((s - trapezio.getBaseMaior()) * (s - trapezio.getBaseMenor()) * (s - trapezio.getLados()) * (s - trapezio.getLados()));
        assertEquals(expected, resultado, 0.01); // Verifica se a área é igual ao esperado
    }

}
