package excecoes;

public class ValorMenorOuIgualAZeroException extends Exception{
    public ValorMenorOuIgualAZeroException(){
        super("Valor invalido, precisa ser maior que 0");
    }
}
