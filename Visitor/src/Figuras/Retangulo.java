package Figuras;

import Interfaces.ElementoConcretoIF;
import Interfaces.VisitorIF;
import excecoes.ValorMenorOuIgualAZeroException;

public class Retangulo implements ElementoConcretoIF {
    private double lados1;
    private double lados2;

    public Retangulo(double lados1, double lados2) throws ValorMenorOuIgualAZeroException {
        if(lados1 <= 0 || lados2 <= 0){
            throw new ValorMenorOuIgualAZeroException();
        }
        this.lados1 = lados1;
        this.lados2 = lados2;
    }

    public double getLados1() {
        return lados1;
    }

    public double getLados2() {
        return lados2;
    }

    public void setLados1(double lados1) {
        this.lados1 = lados1;
    }

    public void setLados2(double lados2) {
        this.lados2 = lados2;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        v.visitaRetangulo(this);
    }
}
