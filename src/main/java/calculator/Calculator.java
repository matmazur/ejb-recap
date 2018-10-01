package calculator;

import javax.ejb.Stateless;

@Stateless
public class Calculator implements CalculatorLocal,CalculatorRemote {
    public double add(double a, double b) {
        return a+b;
    }
}