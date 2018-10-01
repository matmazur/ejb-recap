package calculator;

import javax.ejb.Local;

@Local
public interface CalculatorLocal {
    public double add(double a, double b);
}