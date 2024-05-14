import Figuras.*;
import Interfaces.VisitorIF;
import Visitor.*;
import excecoes.ValorMenorOuIgualAZeroException;

public class Fachada {
    VisitorIF visitorCA = new visitorCalculaArea();
    VisitorIF visitorCP = new visitorCalculaPerimetro();
    VisitorIF visitorCD = new visitorDesenha();
    VisitorIF visitorM = new visitorMaximizar();

    public void informacoesCirculo(double raio) throws ValorMenorOuIgualAZeroException {
        Circulo circulo = new Circulo(raio);
        System.out.println("A área do círculo é: " + visitorCA.visitaCirculo(circulo));
        System.out.println("O perimetro do círculo é: " + visitorCP.visitaCirculo(circulo));
        visitorCD.visitaCirculo(circulo);
        visitorM.visitaCirculo(circulo);
    }

    public void  informacoesRetangulo(double lados1, double lados2) throws ValorMenorOuIgualAZeroException {
        Retangulo retangulo = new Retangulo(lados1, lados2);
        System.out.println("A área do retangulo é: " + visitorCA.visitaRetangulo(retangulo));
        System.out.println("O perimetro do retangulo é: " + visitorCP.visitaRetangulo(retangulo));
        visitorCD.visitaRetangulo(retangulo);
        visitorM.visitaRetangulo(retangulo);
    }

    public void informacoesTriangulo(double lado1, double lado2, double lado3) throws ValorMenorOuIgualAZeroException {
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        System.out.println("A área do triangulo é: " + visitorCA.visitaTriangulo(triangulo));
        System.out.println("O perimetro do triangulo é: " + visitorCP.visitaTriangulo(triangulo));
        visitorCD.visitaTriangulo(triangulo);
        visitorM.visitaTriangulo(triangulo);
    }

    public void informacoesTrapezio(double baseMenor, double baseMaior, double lados) throws ValorMenorOuIgualAZeroException {
        Trapezio trapezio = new Trapezio(baseMenor, baseMaior, lados);
        System.out.println("A área do trapezio é: " + visitorCA.visitaTrapezio(trapezio));
        System.out.println("O perimetro do trapezio é: " + visitorCP.visitaTrapezio(trapezio));
        visitorCD.visitaTrapezio(trapezio);
        visitorM.visitaTrapezio(trapezio);
    }


}
