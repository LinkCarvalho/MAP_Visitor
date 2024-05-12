package Figuras;

import Interfaces.ElementoConcretoIF;
import Interfaces.VisitorIF;
import excecoes.ValorMenorOuIgualAZeroException;

public class Trapezio implements ElementoConcretoIF {
    private double baseMaior;
    private double baseMenor;
    private double lados;

    public Trapezio(double baseMenor, double baseMaior, double lados)throws ValorMenorOuIgualAZeroException{
        if(baseMenor <= 0 || baseMaior <= 0 || lados <= 0){
            throw new ValorMenorOuIgualAZeroException();
        }
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.lados = lados;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getLados() {
        return lados;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        v.visitaTrapezio(this);
    }
}
