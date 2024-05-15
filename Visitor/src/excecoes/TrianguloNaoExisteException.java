package excecoes;

public class TrianguloNaoExisteException extends Exception{
    public TrianguloNaoExisteException(){
        super("Os lados fornecidos não formam um triângulo válido.");
    }
}
