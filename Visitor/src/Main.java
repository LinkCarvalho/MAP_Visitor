import Figuras.*;
import Interfaces.VisitorIF;
import Visitor.*;
import excecoes.ValorMenorOuIgualAZeroException;

public class Main {
    public static void main(String[] args) throws ValorMenorOuIgualAZeroException {
        VisitorIF visitorCA = new visitorCalculaArea();
        VisitorIF visitorCP = new visitorCalculaPerimetro();
        VisitorIF visitorCD = new visitorDesenha();
        VisitorIF visitorM = new visitorMaximizar();

        Circulo circulo = new Circulo(15);
        Retangulo retangulo = new Retangulo(5,4);
        Triangulo triangulo = new Triangulo(3,3,3);
        Trapezio trapezio = new Trapezio(5, 10, 6);

        System.out.println("A área do círculo é: " + visitorCA.visitaCirculo(circulo));
        System.out.println("O perimetro do círculo é: " + visitorCP.visitaCirculo(circulo));
        visitorCD.visitaCirculo(circulo);
        visitorM.visitaCirculo(circulo);

        System.out.println("-------------------------------------------------------------");

        System.out.println("A área do retangulo é: " + visitorCA.visitaRetangulo(retangulo));
        System.out.println("O perimetro do retangulo é: " + visitorCP.visitaRetangulo(retangulo));
        visitorCD.visitaRetangulo(retangulo);
        visitorM.visitaRetangulo(retangulo);

        System.out.println("-------------------------------------------------------------");

        System.out.println("A área do triangulo é: " + visitorCA.visitaTriangulo(triangulo));
        System.out.println("O perimetro do triangulo é: " + visitorCP.visitaTriangulo(triangulo));
        visitorCD.visitaTriangulo(triangulo);
        visitorM.visitaTriangulo(triangulo);

        System.out.println("-------------------------------------------------------------");

        System.out.println("A área do trapezio é: " + visitorCA.visitaTrapezio(trapezio));
        System.out.println("O perimetro do trapezio é: " + visitorCP.visitaTrapezio(trapezio));
        visitorCD.visitaTrapezio(trapezio);
        visitorM.visitaTrapezio(trapezio);

    }
}
