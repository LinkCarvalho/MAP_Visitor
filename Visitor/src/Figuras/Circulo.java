package Figuras;

import Interfaces.ElementoConcretoIF;
import Interfaces.VisitorIF;
import excecoes.ValorMenorOuIgualAZeroException;

public class Circulo implements ElementoConcretoIF {
    private double raio;

    public Circulo(double raio) throws ValorMenorOuIgualAZeroException {
        if(raio<=0){
            throw new ValorMenorOuIgualAZeroException();
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        v.visitaCirculo(this);

    }
}
