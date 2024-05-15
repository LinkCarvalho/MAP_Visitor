import excecoes.TrianguloNaoExisteException;
import excecoes.ValorMenorOuIgualAZeroException;

public class Main {
    public static void main(String[] args) throws ValorMenorOuIgualAZeroException, TrianguloNaoExisteException {

        processaFiguras fachada = new processaFiguras();

        System.out.println("-------------------------------------------------------------");
        fachada.informacoesCirculo(15);
        System.out.println("-------------------------------------------------------------");
        fachada.informacoesRetangulo(5,4);
        System.out.println("-------------------------------------------------------------");
        fachada.informacoesTriangulo(3,3,3);
        System.out.println("-------------------------------------------------------------");
        fachada.informacoesTrapezio(5,10, 6);

    }
}
