import javax.ejb.Stateless;

@Stateless
public class Calculator {
    public double add(double a, double b) {
        return a+b;
    }
}